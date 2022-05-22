package com.general.util;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Class with bundle of utilities.
 * 
 * <p>
 * {@code Util} has no public constructor. Instead {@code Util} have only static
 * methods who can be implemented at any projects
 *
 * <p>
 * The following example uses {@code Util} to print the class name of an object:
 *
 * <blockquote>
 * 
 * <pre>
 * Util.printClassname("Any Object");
 * </pre>
 * 
 * </blockquote>
 *
 *
 * @author Ruan
 *
 */
public class Util {

	// final field
	private final Util util;

	public static void printClassName(Object obj) {
		System.out.println("The class of " + obj + " is " + obj.getClass().getName());
	}

	static {
		// do something
	}

	/*
	 * Private constructor. This constructor is not used and prevents the default
	 * constructor being generated.
	 */
	private Util(Util u) {
		// Initialize final field for util.
		util = u;
	}

	public boolean isEnum(Class<?> c) {
        // An enum must both directly extend java.lang.Enum and have
        // the ENUM bit set; classes for specialized enum constants
        // don't do the former.
        return  c.getSuperclass() == java.lang.Enum.class;
    }	
	
	public static Logger getLogger() {
		String logFilePath = new File(System.getProperty("user.dir")) + "/logs/logs.txt";
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

}


