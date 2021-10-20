package org.ruan.architecture.concreteAnimals;

import org.ruan.architecture.abstractanimals.Mammal;

/**
 * First concrete class, so it have to implement all the inheritance.
 * 
 * @Ruan All the constructor came here by default like public so you have to
 *       change it to public, otherwise you cannot instantiate a dog.
 */
public class Dog extends Mammal {

	private String race;
	private String name;

	public Dog() {
		super();
	}

	public Dog(boolean oviparous) {
		super(oviparous);
	}

	public Dog(String race, String name) {
		this.race = race;
		this.name = name;
	}

	public String concreteClassMethodGetRace() {
		return race;
	}

	public void concreteClassMethodSetRace(String race) {
		this.race = race;
	}

	public String concreteClassMethodGetName() {
		return name;
	}

	public void concreteClassMethodSetName(String name) {
		this.name = name;
	}

	@Override
	public void interfaceMethodBreath() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean interfaceMethodIsTerrestrial() {
		return true;
	}

	@Override
	protected double subAbstractClassMethodgetGestationTime() {
		return 180;
	}

	@Override
	public int abstractClassMethodLifeTime() {
		return 14;
	}

	@Override
	public String toString() {
		return (race != null ? "race=" + race + ", " : "") + (name != null ? "name=" + name + ", " : "") + "isOviparous = "
				+ this.subAbstractClassMethodIsOviparous();
	}

}
