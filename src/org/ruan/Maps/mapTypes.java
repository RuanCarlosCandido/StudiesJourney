package org.ruan.Maps;

import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class mapTypes {

	public static void main(String[] args) {

		long startTime;
		long endTime;

		int a = 13;
		Integer b = 95;

		char c = '&';
		Character d = 'N';

		double e = 5.2;
		Double f = 32.34;

		boolean g = true;
		Boolean h = false;

		// Completely unordered
		{
			startTime = Calendar.getInstance().getTimeInMillis();
			Map<Object, Object> mapA = new HashMap<Object, Object>();
			mapA.put(a, b);
			mapA.put(c, d);
			mapA.put(e, f);
			mapA.put(g, h);
			System.out.print("HashMap" + mapA);
			System.out.print(" "+ mapA.get(e));
			Object aux = mapA.get(e);
			System.out.print(" "+ aux);
			endTime = Calendar.getInstance().getTimeInMillis();
			System.out.println(" " + (endTime-startTime) + "ms");
		}

		// Respect Insertion Order
		{

			startTime = Calendar.getInstance().getTimeInMillis();
			Map<Object, Object> mapC = new LinkedHashMap<Object, Object>();
			mapC.put(a, b);
			mapC.put(c, d);
			mapC.put(e, f);
			mapC.put(g, h);
			System.out.print("LinkedHashMap" + mapC);
			System.out.print(" "+ mapC.get(e));
			Object aux = mapC.get(e);
			System.out.print(" "+ aux);
			endTime = Calendar.getInstance().getTimeInMillis();
			System.out.println(" " + (endTime-startTime) + "ms");

		}

		// Try to order in some way, ignoring the insertion order
		{
			startTime = Calendar.getInstance().getTimeInMillis();
			Map<Object, Object> mapD = new ConcurrentHashMap<Object, Object>();
			mapD.put(a, b);
			mapD.put(c, d);
			mapD.put(e, f);
			mapD.put(g, h);
			System.out.print("ConcurrentHashMap" + mapD);
			System.out.print(" "+ mapD.get(e));
			Object aux = mapD.get(e);
			System.out.print(" "+ aux);
			endTime = Calendar.getInstance().getTimeInMillis();
			System.out.println(" " + (endTime-startTime) + "ms");

		}
		// The first inserted value will define the type of the others insertion
		// e.g if the first inserted value is a int, the others have to be int
		// otherwise will throw ClassCastException, its only a problem when you pass
		// objects for the generic

		// order in natural order
		{
			Map<Object, Object> mapB = new TreeMap<Object, Object>();
			mapB.put("a", 5);
			mapB.put("e", 9);
			mapB.put("b", 3);
			mapB.put("f", 1);
			System.out.print("TreeMap" + mapB);
			System.out.print(" "+ mapB.get("e"));
			Object aux = mapB.get("e");
			System.out.print(" "+ aux);
			endTime = Calendar.getInstance().getTimeInMillis();
			System.out.println(" " + (endTime-startTime) + "ms");

		}
	}

}
