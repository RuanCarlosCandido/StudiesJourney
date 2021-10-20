package org.ruan.architecture.abstractanimals;

public class Fish {

	private double incubationTime;
	private boolean isDangerous;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getIncubationTime() {
		return incubationTime;
	}

	public void setIncubationTime(double incubationTime) {
		this.incubationTime = incubationTime;
	}

	public boolean isDangerous() {
		return isDangerous;
	}

	public void setDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}

}
