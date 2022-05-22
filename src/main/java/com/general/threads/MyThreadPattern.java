package com.general.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.general.util.Util;

/**
 * My Pattern of threads to be implemented in multi- tasks processing
 * @Ruan
 */
public class MyThreadPattern implements Runnable {

	/* register the errors */
	private static final Logger LOGGER = Util.getLogger();

	/* field to check if the thread is running */
	private boolean isRunning;

	/* any attribute you think useful */
	private String attribute;

	private int sleepTime;

	/* Default constructor */
	MyThreadPattern() {
		isRunning = true;
		
	}

	MyThreadPattern(String attribute, int sleepTime) {
		isRunning = true;
		this.attribute = attribute;
		this.sleepTime = sleepTime;
	}

	/* Main procedures will be executed while the Thread is running */
	@Override
	public void run() {
		while (isRunning) {
			try {
				Thread.sleep(sleepTime);
				doIt();
			} catch (InterruptedException e) {
				LOGGER.log(Level.FINE, null, e);
			}

		}
	}

	/**
	 * All the logic of the program, main action.
	 */
	public synchronized void doIt() {
		System.err.println(attribute);
	}

	/**
	 * Secure stop of the thread. It's needed to avoid an stackOverFlow Exception
	 */
	public synchronized void stopThread() {
		System.out.println("Stopping");

		this.isRunning = false;
	}

}
