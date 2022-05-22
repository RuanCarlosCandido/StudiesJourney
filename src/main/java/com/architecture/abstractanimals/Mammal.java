package com.architecture.abstractanimals;

public abstract class Mammal extends Animal {

	boolean oviparous;

	// From superclass
	protected Mammal() {
		super();

	}

	protected Mammal(boolean oviparous) {
		this.oviparous = oviparous;
	}

	public boolean subAbstractClassMethodIsOviparous() {
		return oviparous;
	}

	public void subAbstractClassMethodSetOviparous(boolean oviparous) {
		this.oviparous = oviparous;
	}

	protected abstract double subAbstractClassMethodgetGestationTime();

	@Override
	public String toString() {
		return "oviparous=" + oviparous;
	}

}