package com.general.threads;

public class AlternativeThread extends Thread {

	private long minPrime;

	AlternativeThread(long minPrime) {
		this.minPrime = minPrime;
	}

	@Override
	public void run() {
//		this.start();
//		Random r = new Random();
//		System.out.println("Start a thread with ID = " + this.getId());
	}

}
