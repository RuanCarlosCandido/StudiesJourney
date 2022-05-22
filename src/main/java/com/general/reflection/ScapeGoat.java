package com.general.reflection;

import java.util.List;

public class ScapeGoat<T> {

		public enum Spy { BLACK , WHITE }
	 	public volatile int share;
	    public int instance;
	    public class Inner {};
	
	 public boolean[][] b = {{ false, false }, { true, true } };
	    public String name  = "Alice";
	    public List<Integer> list;
	    public T val;
	    
	    // for the morbidly curious
	    <E extends RuntimeException> void genericThrow() throws E {}

}
