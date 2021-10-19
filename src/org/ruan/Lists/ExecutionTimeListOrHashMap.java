package org.ruan.Lists;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExecutionTimeListOrHashMap {

	public static void main(String[] args) {

		Instant start;
		Instant end;

		double somaLista = 0;
		double somaHashMap = 0;
		int z = 0;
		double limite = 100;

		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < 1000000; i++) {
			list.add(i);
			map.put(i, 0);
		}

		while (z < limite) {

			// For Each TEST, Mandatory for analyze
			start = Instant.now();
			testOnly(list);
			end = Instant.now();

			// For Each List
			start = Instant.now();
			listForEach(list);
			end = Instant.now();
			somaLista += Duration.between(start, end).toMillis();

			// For Each HashMap
			start = Instant.now();
			HashMapForEach(map);
			end = Instant.now();
			somaHashMap += Duration.between(start, end).toMillis();

			System.out.println("step " + z);
			z++;
		}
		System.out.println("List :: " + somaLista + "ms");
		System.out.println("HashMap :: " + somaHashMap + "ms");
	}

	@SuppressWarnings("unused")
	private static void HashMapForEach(Map<Integer, Integer> map) {
		for (Integer key : map.keySet()) {
			int a = key;
		}
	}

	@SuppressWarnings({ "unused" })
	private static void listForEach(java.util.List<Integer> list) {
		for (int i : list) {
			int a = i;
		}

	}

	@SuppressWarnings("unused")
	private static void testOnly(List<Integer> list) {
		for (int i : list) {
			int a = i;
		}

	}

}