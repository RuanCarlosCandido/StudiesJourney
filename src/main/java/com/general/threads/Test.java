package com.general.threads;

public class Test {

	public static void main(String[] args) {

		Thread thread = new Thread();
		thread.start();
		
		
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("LThread");
			}
		});
		thread2.start();
		
		
		Thread thread3 = new Thread("anyName");

		
		Thread thread4 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("LThreadWithName");
			}
		}, "otherName");

		
		Thread thread5 = new Thread(new ThreadGroup("ThreadGroup"), new Runnable() {

			@Override
			public void run() {
				System.out.println("LThreadWithThreadGroup");
			}
		});

		
		Thread thread6 = new Thread(new ThreadGroup("AnotherThreadGroup"), new Runnable() {

			@Override
			public void run() {
				System.out.println("LThreadWithThreadGroupNameStackSize");
			}
		}, "theUltimate", 10l);
		thread6.start();
		
		
		for (int i = 0; i <= 10; i++) {
			new ThreadUtil().describeThread(thread);
			new ThreadUtil().describeThread(thread2);
			new ThreadUtil().describeThread(thread3);
			new ThreadUtil().describeThread(thread4);
			new ThreadUtil().describeThread(thread5);
			new ThreadUtil().describeThread(thread6);
		}

	}

}
