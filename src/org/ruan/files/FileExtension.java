package org.ruan.files;

import java.util.HashMap;
import java.util.Map;

public enum FileExtension {

	TXT(".txt"), PDF(".pdf");

	private String value;
	private static Map<FileExtension, String> map = new HashMap<FileExtension, String>();

	private FileExtension(String value) {
		this.value = value;
	}

	static {
		FileExtension[] allExtensions = values();
		int extensionsCount = allExtensions.length;

		for (int i = 0; i < extensionsCount; i++) {
			map.put(allExtensions[i], allExtensions[i].getValue());
		}

	}

	public static String of(FileExtension fileExtension) {

		return map.get(fileExtension);
	}

	private String getValue() {
		return value;
	}

}
