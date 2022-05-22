package com.general.Maps;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapsComparator {

	public static void main(String[] args) {

		Instant start;
		Instant end;

		long somaHash = 0;
		long somaTree = 0;
		long somaConcurrent = 0;
		long somaLinked = 0;

		int a = 0;
		int limite = 100;
		
		Map<Integer, String> testMap = new HashMap<Integer, String>();
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		Map<Integer, String> concurrentMap = new ConcurrentHashMap<Integer, String>();
		Map<Integer, String> linkedMap = new LinkedHashMap<Integer, String>();

		testMap = preencheMap(testMap);
		hashMap = preencheMap(hashMap);
		treeMap = preencheMap(treeMap);
		concurrentMap = preencheMap(concurrentMap);
		linkedMap = preencheMap(linkedMap);

		while (a < limite) {
			start = Instant.now();
			testOnly(testMap);
			end = Instant.now();

			start = Instant.now();
			LinkedHashMap(linkedMap);
			end = Instant.now();
			somaLinked += Duration.between(start, end).toMillis();
			
			start = Instant.now();
			HashMap(hashMap);
			end = Instant.now();
			somaHash += Duration.between(start, end).toMillis();

			start = Instant.now();
			TreeMap(treeMap);
			end = Instant.now();
			somaTree += Duration.between(start, end).toMillis();

			start = Instant.now();
			ConcurrentHashMap(concurrentMap);
			end = Instant.now();
			somaConcurrent += Duration.between(start, end).toMillis();

			a++;
			System.out.println("step" + a);
		}

		System.out.println("HashMap " + somaHash + "ms");
		System.out.println("TreeMap " + somaTree + "ms");
		System.out.println("ConcurrentHashMap " + somaConcurrent + "ms");
		System.out.println("LinkedHashMap " + somaLinked + "ms");

	}

	private static Map<Integer, String> preencheMap(Map<Integer, String> map) {
		for (int i = 0; i < 100000; i++) {
			map.put(i, i + "");
		}
		return map;
	}

	@SuppressWarnings({ "rawtypes", "unused" })
	private static void testOnly(Map<Integer, String> map) {

		for (Map.Entry m : map.entrySet()) {
			Object o = m.getKey() + "=" + m.getValue() + " ";
		}
	}

	@SuppressWarnings({ "rawtypes", "unused" })
	private static void HashMap(Map<Integer, String> map) {

		for (Map.Entry m : map.entrySet()) {
			// System.out.prin(m.getKey() + "=" + m.getValue() + " ");
			Object o = m.getKey() + "=" + m.getValue() + " ";
		}
	}

	@SuppressWarnings({ "rawtypes", "unused" })
	private static void TreeMap(Map<Integer, String> map) {
		for (Map.Entry m : map.entrySet()) {
			// System.out.print(m.getKey() + "=" + m.getValue() + " ");
			Object o = m.getKey() + "=" + m.getValue() + " ";
		}
	}

	@SuppressWarnings({ "rawtypes", "unused" })
	private static void LinkedHashMap(Map<Integer, String> map) {
		for (Map.Entry m : map.entrySet()) {
			// System.out.print(m.getKey() + "=" + m.getValue() + " ");
			Object o = m.getKey() + "=" + m.getValue() + " ";
		}
	}

	@SuppressWarnings({ "rawtypes", "unused" })
	private static void ConcurrentHashMap(Map<Integer, String> map) {
		for (Map.Entry m : map.entrySet()) {
			// System.out.print(m.getKey() + "=" + m.getValue() + " ");
			Object o = m.getKey() + "=" + m.getValue() + " ";
		}
	}

}
