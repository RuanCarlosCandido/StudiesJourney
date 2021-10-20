package org.general.files;

public class Test {

	public static void main(String[] args) {
		//PULAR LINHA NAO ESTA FUNCIONANDO
		FileGenerator log = new FileGenerator();
		int a = 0;
		while (a < 10) {
			log.addInNewLine("primeira mensagem");
			log.add("segunda mensagem");
			log.addInNewLine("terceira mensagem");

			a++;
		}

		try {
			log.removeMessage("segunda mensagem");
		} catch (Exception e) {
			e.printStackTrace();
		}
		log.setFileExtension(FileExtension.TXT);
		log.setFileName("padrao");
		log.setFilePath("C://Users//gs//Desktop//");

		log.save();

	}

}
