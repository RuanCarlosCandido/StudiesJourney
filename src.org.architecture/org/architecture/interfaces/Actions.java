package org.architecture.interfaces;

/**
 * This Interface has the function to organize the <em>minimal</em> actions that the classes that implement this have to do.
 * @Ruan
 */
public interface Actions {

	/**
	 * Method without any parameter or return but have the incubation to set the very main action from the class
	 */
	public void doIt();
	
	/**
	 * Method without params but with return and default access control, can give extraFunction to the class
	 */	
	default String getClassName() {
		return this.getClass().getSimpleName();
	}
	
	default int add(int value) {
		return ++value;
	}
	
}
