package org.general.threads;

public class Test2 {

	public static void main(String[] args) {
		
		MyThreadPattern thread = new MyThreadPattern("firstThread",1000);
		MyThreadPattern thread2 = new MyThreadPattern("secondThread",4000);
			
				
				thread.doIt();	
				thread2.doIt();	
				
			
		
		thread.stopThread();
		thread2.stopThread();	
		
	}

	
}
