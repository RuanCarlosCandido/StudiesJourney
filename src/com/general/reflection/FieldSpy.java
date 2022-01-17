package com.general.reflection;

import java.lang.reflect.Field;

public class FieldSpy<T> {

	public static void printFields(Class<?> c) {
		
		    Field[] fields = c.getDeclaredFields();
		    for(Field f : fields) {
				System.out.format("Field: %s%n", f);
		    	System.out.format("Name: %s%n", f.getName());
			    System.out.format("Type: %s%n", f.getType());
			    System.out.format("GenericType: %s%n", f.getGenericType());		    	
		    }

		}
}
