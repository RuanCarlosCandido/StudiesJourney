package com.general.threads;

public class ThreadUtil {


	public void describeThread(Thread t) {

		StringBuilder desc = new StringBuilder("id = " + t.getId());
		desc.append(", name = " + t.getName())
			    .append(", priority = " + t.getPriority())
//				.append(", ContextClassLoader = " + t.getContextClassLoader())
//				.append("\n, StackTrace = " + Arrays.toString(t.getStackTrace()))
				.append(", State = " + t.getState())
//				.append(", ThreadGroup = " + t.getThreadGroup())
//				.append(", UncaughtExceptionHandler = " + t.getUncaughtExceptionHandler())
//				.append("\n, AllStackTraces = " + getAllStackTraces())
//				.append(", DefaultUncaughtExceptionHandler = " + Thread.getDefaultUncaughtExceptionHandler())
				;
		System.out.println(desc.toString());
		verifyValidation(t);
		System.out.println();
	}

	
	public void verifyValidation(Thread t) {
		if (t.isAlive())
			System.out.println("isAlive");
		
		if (t.isDaemon())
			System.out.println("isDaemon");

		if (t.isInterrupted())
			System.out.println("isInterrupted");
	}

}
