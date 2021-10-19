package org.ruan.util;

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

	public boolean isEnum(Class c) {
        // An enum must both directly extend java.lang.Enum and have
        // the ENUM bit set; classes for specialized enum constants
        // don't do the former.
        return  c.getSuperclass() == java.lang.Enum.class;
    }	
}


