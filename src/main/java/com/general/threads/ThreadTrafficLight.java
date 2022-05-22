package com.general.threads;

import static com.general.threads.TrafficLightColor.*;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.general.util.Util;

public class ThreadTrafficLight implements Runnable {
	public static final Logger LOGGER = Util.getLogger();
	TrafficLightColor color;
	boolean stop;
	boolean colorChanged;

	public ThreadTrafficLight() {
		this.color 		  = RED;
		this.stop 		  = false;
		this.colorChanged = false;

		new Thread(this).start();
	}

	@Override
	public void run() {
		while (!stop) {
			try {
				Thread.sleep(this.color.getStandBy());
				this.ChangeColor();
			} catch (InterruptedException e) {
				LOGGER.log(Level.FINE, null, e);
			}
		}
	}

	private synchronized void ChangeColor() {
		switch (this.color) {
		case RED:
			this.color = GREEN;
			break;

		case YELLOW:
			this.color = RED;
			break;

		case GREEN:
			this.color = YELLOW;
			break;

		default:
			break;
		}
		this.colorChanged = true;
		notify();
	}

	public synchronized void waitColorChange() {
		while (!this.colorChanged) {
			try {
				wait();
			} catch (InterruptedException e) {
				LOGGER.log(Level.FINE, null, e);
			}
		}
		this.colorChanged = false;
	}

	public synchronized void stopTraficLight() {
		this.stop = true;
	}

	public TrafficLightColor getColor() {
		return color;
	}

}
