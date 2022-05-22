package com.general.threads;

public class TraficLightSimulator {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		ThreadTrafficLight traficLight = new ThreadTrafficLight();

		for (int i = 0; i < 10; i++) {	
			System.out.println(traficLight.getColor());
			traficLight.waitColorChange();
		}
		traficLight.stopTraficLight();
	}

}
