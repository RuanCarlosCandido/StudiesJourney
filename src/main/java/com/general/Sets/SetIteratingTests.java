package com.general.Sets;

import java.time.Duration;
import java.time.Instant;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetIteratingTests {

	public static void main(String[] args) {

		Instant start;
		Instant end;

		long somaHash = 0;
		long somaLinked = 0;
		long somaTree = 0;

		int a = 0;
		int limite = 10000;

		Set<Object> hashSet = new HashSet<>();
		Set<Object> treeSet = new TreeSet<>();
		Set<Object> linkedHashSet = new LinkedHashSet<>();
		Set<Object> teste = new HashSet<>();

		start = Instant.now();
		teste = preencheSet(teste);
		end = Instant.now();

		start = Instant.now();
		linkedHashSet = preencheSet(linkedHashSet);
		end = Instant.now();
		somaLinked += Duration.between(start, end).toMillis();
		
		start = Instant.now();
		hashSet = preencheSet(hashSet);
		end = Instant.now();
		somaHash += Duration.between(start, end).toMillis();

		start = Instant.now();
		treeSet = preencheSet(treeSet);
		end = Instant.now();
		somaTree += Duration.between(start, end).toMillis();

		while (a < limite) {
			start = Instant.now();
			testaSet(teste);
			end = Instant.now();

			start = Instant.now();
			testaSet(linkedHashSet);
			end = Instant.now();
			somaLinked += Duration.between(start, end).toMillis();
			
			start = Instant.now();
			testaSet(treeSet);
			end = Instant.now();
			somaTree += Duration.between(start, end).toMillis();

			start = Instant.now();
			testaSet(hashSet);
			end = Instant.now();
			somaHash += Duration.between(start, end).toMillis();


			a++;
			System.out.println("step" + a);
		}

		System.out.println("linkedHashSet " + somaLinked + "ms");
		System.out.println("HashSet " + somaHash + "ms");
		System.out.println("TreeSet " + somaTree + "ms");

	}

	private static Set<Object> preencheSet(Set<Object> set) {
		for (int i = 0; i < 10000; i++) {
			set.add(i);
		}
		return set;
	}

	@SuppressWarnings({ "unused" })
	private static void testaSet(Set<Object> set) {

		Iterator<Object> it = set.iterator();

		while (it.hasNext()) {
			Object o = it.next();
		}

	}

}
