package org.general.threads;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.general.util.Util;

/**
 * My Pattern of threads to be implemented in multi- tasks processing
 * 
 * @Ruan
 */
public class MyThreadPattern implements Runnable {

	/* register the errors */
	private static final Logger LOGGER = Util.getLogger();

	/* field to check if the thread is running */
	private boolean isRunning;
	
	/*any attribute you think usefull*/
	private String attribute;
	
	private int sleepTime;

	/* Default constructor */
	MyThreadPattern() {
		isRunning = true;
		System.out.println("Start the Thread");
		new Thread(this).start();

	}

	MyThreadPattern(String attribute, int sleepTime) {
		isRunning = true;
		System.out.println("Start the Thread");
		new Thread(this).start();
		this.attribute = attribute;
		this.sleepTime = sleepTime;
	}
	
	
	/* Main procedures will be executed while the Thread is running */
	@Override
	public void run() {
		while (isRunning) {
			this.doIt();
		}
	}

	/**
	 * All the logic of the program, main action.
	 */
	public synchronized void doIt() {
		try {
			Thread.sleep(sleepTime);
			System.out.println(attribute);
		} catch (InterruptedException e) {
			LOGGER.log(Level.FINE, null, e);
		}

	}

	/**
	 * Secure stop of the thread. It's needed to not cause an stackOverFlow
	 * Exception
	 */
	public synchronized void stopThread() {
		System.out.println("Stopping");
		this.isRunning = false;
	}

}
