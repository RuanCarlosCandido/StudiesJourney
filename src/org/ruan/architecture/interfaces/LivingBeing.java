package org.ruan.architecture.interfaces;

/**
 * The ultimate abstraction of an animal
 * 
 * @Ruan
 */
public interface LivingBeing {
	// mandatory
	void interfaceMethodBreath();
	
	// mandatory
	public boolean interfaceMethodIsTerrestrial();

	// optional
	default void interfaceMethodRest(Object timeResting) throws InterruptedException {
		wait(convertToLong(timeResting));
	}

	// static method in Interfaces are like private methods, have the purpose to aux
	// others methods in this interface
	static long convertToLong(Object o) {

		return Long.valueOf(o.toString());
	}

}
