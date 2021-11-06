package org.architecture.concreteAnimals;

import org.architecture.abstractanimals.Mammal;

/**
 * First concrete class, so it have to implement all the inheritance.
 * 
 * @Ruan All the constructor came here by default like public so you have to
 *       change it to public, otherwise you cannot instantiate a dog.
 */
public class Dog extends Mammal {

	private String race;
	private String name;
	private int age;
	
	public Dog() {
		super();
	}

	public Dog(boolean oviparous) {
		super(oviparous);
	}

	public Dog(String race, String name, int age) {
		this.race = race;
		this.name = name;
		this.age  = age;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return (race != null ? "race=" + race + ", " : "") + (name != null ? "name=" + name + ", " : "")
				+ (age != 0 ? "age=" + age + ", " : "") + "isOviparous = "
				+ this.subAbstractClassMethodIsOviparous();
	}
	
	
}
