package org.ruan.architecture.concreteAnimals;

import org.ruan.architecture.abstractanimals.Mammal;

public class Cat extends Mammal {

	private String race;
	private String name;

	public Cat(String race, String name) {
		this.race = race;
		this.name = name;
	}

	protected Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected Cat(boolean oviparous) {
		super(oviparous);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interfaceMethodBreath() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean interfaceMethodIsTerrestrial() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected double subAbstractClassMethodgetGestationTime() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int abstractClassMethodLifeTime() {
		// TODO Auto-generated method stub
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
