package com.general.reflection;

import java.util.List;

public class ScapeGoat<T> {

		public enum Spy { BLACK , WHITE }
	 	public volatile int share;
	    public int instance;
	    protected int instance1;
	    public static class Inner {};
	
	 public boolean[][] b = {{ false, false }, { true, true } };
	    public final String name  = "Alice";
	    transient List<Integer> list;
	    volatile List<Integer> list2;
	    public T val;
	    
	    // for the morbidly curious
	    <E extends RuntimeException> void genericThrow() throws E {}

}
