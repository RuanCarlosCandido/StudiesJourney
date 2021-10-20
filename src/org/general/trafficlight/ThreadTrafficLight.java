package com.trafficlight;

public class ThreadTrafficLight implements Runnable {
	TrafficLightColor color;
	boolean stop;
	boolean colorChanged;

	public ThreadTrafficLight() {
		this.color = TrafficLightColor.RED;
		this.stop = false;
		this.colorChanged = false;
		new Thread(this).start();
		// Thread thread = this.;
		// thread.start();
	}

	@Override
	public void run() {
		while (!stop) {
			try {
				Thread.sleep(this.color.getStandBy());
				this.Mudarcolor();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private synchronized void Mudarcolor() {
		switch (this.color) {
		case RED:
			this.color = TrafficLightColor.GREEN;
			break;

		case YELLOW:
			this.color = TrafficLightColor.RED;
			break;

		case GREEN:
			this.color = TrafficLightColor.YELLOW;
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
				e.printStackTrace();
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
