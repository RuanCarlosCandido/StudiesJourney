package com.general.files;

import static com.general.files.FileExtension.*;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileGenerator implements Serializable {

	private static final long serialVersionUID = -6519141793292465341L;
	private StringBuilder result = new StringBuilder();
	private String fileName = "file";
	private FileExtension fileExtension = TXT;
	private int fileID = 1;
	private String filePath = "";

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName1) {
		fileName = fileName1;
	}

	public FileExtension getFileExtension() {
		return fileExtension;
	}

	public void setFileExtension(FileExtension fileExtension) {
		this.fileExtension = fileExtension;
	}

	private String completeFileName() {
		return filePath + fileName + "(" + fileID + ")" + of(fileExtension);
	}

	public void save() {

		List<String> lines = Arrays.asList(this.result + "");
		Path file = Paths.get(filePath + fileName + of(fileExtension));
		try {

			if (Files.exists(file, LinkOption.NOFOLLOW_LINKS)) {
				boolean existFile = true;
				fileID = 1;
				while (existFile) {
					file = Paths.get(completeFileName());

					if (Files.notExists(file, LinkOption.NOFOLLOW_LINKS))
						existFile = false;

					fileID++;
				}
			}
			Files.write(file, lines, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String addInNewLine(String message) {

		return this.result.append(message + "\n").toString();
	}

	public String addInNewLine(Object object) {

		return this.result.append(object.toString() + "\n").toString();
	}
	
	
	public String add(String message) {

		return this.result.append(message).toString();
	}

	public String add(Object object) {

		return this.result.append(object.toString()).toString();
	}

	public String removeMessage(String message) throws Exception {
		int initialPosition = 0;
		if (this.result.toString().contains(message)) {
			initialPosition = this.result.indexOf(message);
			return this.result.delete(initialPosition, initialPosition + message.length()).toString();
		}
		throw new Exception("message does not exist in the archive");
	}

}
