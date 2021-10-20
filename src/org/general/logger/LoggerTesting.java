package org.general.logger;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerTesting {

	public static final Logger LOGGER = geraLogger();

	public static Logger geraLogger() {
		String logFilePath = new File(System.getProperty("user.dir")) + "/Logs/logs.txt";
		final Logger LOGGER = Logger.getLogger(logFilePath);
		try {
			final FileHandler handler = new FileHandler(logFilePath, false);
			LOGGER.addHandler(handler);
			handler.setFormatter(new SimpleFormatter());
			LOGGER.setLevel(Level.FINE);
		} catch (SecurityException | IOException e1) {
			e1.printStackTrace();
		}

		return LOGGER;
	}

	public static void lancaException() {

		String[] array = new String[2];
		try {
			System.out.print(array[3]);
		} catch (ArrayIndexOutOfBoundsException e) {

			LOGGER.log(Level.FINE, "index informado maior que o tamanho do array", e);
		}

		try {
			Integer a = new Integer(250 / 0);
			System.out.println(a);
		} catch (Exception e) {
			LOGGER.log(Level.FINE, "tentou dividir por 0", e);
		}

		System.out.println("uau");
	}

	static void configHandler() {

		// try {
		// String logFilePath = new
		// File(System.getProperty("user.dir"))+"/Logs/logs.txt";
		// FileHandler handler;
		// handler = new FileHandler(logFilePath,false);
		// Logger log = Logger.getLogger(logFilePath);
		// log.addHandler(handler);
		// handler.setFormatter(new XMLFormatter());
		// log.setLevel(Level.INFO);
		// log.info("Browser Launched Successfully");
		// log.info("Validated Login Functionality");
		// handler.setFormatter(new SimpleFormatter());
		// log.setLevel(Level.SEVERE);
		// log.severe("Browser Launched Successfully");
		// log.severe("Validated Login Functionality");
		// } catch (SecurityException | IOException | NullPointerException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
		//
	}

	public static void main(String[] args) {

		// configHandler();

		lancaException();
	}

}
