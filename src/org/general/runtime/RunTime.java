package org.general.runtime;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class RunTime {

	public static void main(String[] args) {
		Instant start = Instant.now();
		 
	    //Measure execution time for this method
	    methodToTime();
	 
	    Instant finish = Instant.now();
	 
	    long timeElapsed = Duration.between(start, finish).toMillis();  //in millis
	System.out.println(timeElapsed); 
	}
	 
	  public static void methodToTime() {
	    try {
	      TimeUnit.SECONDS.sleep(3);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	  }
	}