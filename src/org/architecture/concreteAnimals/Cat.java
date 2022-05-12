package org.architecture.concreteAnimals;

import org.architecture.abstractanimals.Mammal;

public class Cat extends Mammal {

	private String race;
	private String name;

	public Cat(String race, String name) {
		this.race = race;
		this.name = name;
	}

	protected Cat() {
		super();
	}

	protected Cat(boolean oviparous) {
		super(oviparous);
	}

	@Override
	public void interfaceMethodBreath() {

	}

	@Override
	public boolean interfaceMethodIsTerrestrial() {
		return false;
	}

	@Override
	protected double subAbstractClassMethodgetGestationTime() {
		return 0;
	}

	@Override
	public int abstractClassMethodLifeTime() {
		return 0;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
