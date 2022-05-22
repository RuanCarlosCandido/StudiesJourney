package com.architecture.abstractanimals;

import com.architecture.interfaces.Flag;
import com.architecture.interfaces.LivingBeing;

/**
 * When implementing the interface in abstract class nothing have to be
 * implemented. Pass it ahead.
 * @Ruan
 */
public abstract class Animal implements LivingBeing, Flag {

	/**
	 * Sole constructor. (For invocation by subclass constructors, typically
	 * implicit.)
	 */
	protected Animal() {
	}

	
	
	//mandatory
	public abstract int abstractClassMethodLifeTime();

}
