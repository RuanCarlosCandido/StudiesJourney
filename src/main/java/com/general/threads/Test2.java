package com.general.threads;

public class Test2 {

	public static void main(String[] args) {

		
		for(int i = 0; i <10; i++) {
			MyThreadPattern thread = new MyThreadPattern(i+"", (i+1)*10000000);
			new Thread(thread).start();

			thread.doIt();
			thread.stopThread();

		}
		
		
//		MyThreadPattern thread = new MyThreadPattern("firstThread", 1000);
//		MyThreadPattern thread2 = new MyThreadPattern("secondThread", 40000);
//		
//		
//		
//		
//		
//		thread.doIt();
//		thread2.doIt();
//
//		thread.stopThread();
//		thread2.stopThread();

	}

}
