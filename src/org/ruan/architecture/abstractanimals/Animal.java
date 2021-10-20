package org.ruan.architecture.abstractanimals;

import org.ruan.architecture.interfaces.Flag;
import org.ruan.architecture.interfaces.LivingBeing;

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
