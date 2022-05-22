package com.general.Lists;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListIteratingTests {

	public static void main(String[] args) {


		Instant start;
		Instant end;

		long somaStack = 0;
		long somaLinked = 0;
		long somaArray = 0;
		long somaVector = 0;

		int a = 0;
		int limite = 100000;
		
		List<Object> stack = new Stack<>();
		List<Object> linkedList = new LinkedList<>();
		List<Object> arrayList = new ArrayList<>();
		List<Object> vector = new Vector<>();
		List<Object> teste = new ArrayList<>();
		
		start = Instant.now();		
		teste = preencheList(teste);
		end = Instant.now();

		start = Instant.now();		
		stack = preencheList(stack);
		end = Instant.now();
		somaStack += Duration.between(start, end).toMillis();
		
		start = Instant.now();		
		linkedList = preencheList(linkedList);
		end = Instant.now();
		somaLinked += Duration.between(start, end).toMillis();
		
		start = Instant.now();		
		arrayList = preencheList(arrayList);
		end = Instant.now();
		somaArray += Duration.between(start, end).toMillis();
		
		start = Instant.now();		
		vector = preencheList(vector);
		end = Instant.now();
		somaVector += Duration.between(start, end).toMillis();
		
		while (a < limite) {
			start = Instant.now();
			testaList(teste);
			end = Instant.now();

			start = Instant.now();
			testaList(stack);
			end = Instant.now();
			somaStack += Duration.between(start, end).toMillis();
			
			start = Instant.now();
			testaList(vector);
			end = Instant.now();
			somaVector += Duration.between(start, end).toMillis();
			
			start = Instant.now();
			testaList(arrayList);
			end = Instant.now();
			somaArray += Duration.between(start, end).toMillis();
			
			start = Instant.now();
			testaList(linkedList);
			end = Instant.now();
			somaLinked += Duration.between(start, end).toMillis();
			
			a++;
			System.out.println("step" + a);
		}

		System.out.println("vector " + somaVector + "ms");
		System.out.println("ArrayList " + somaArray + "ms");
		System.out.println("LinkedList " + somaLinked + "ms");
		System.out.println("Stack " + somaStack + "ms");

	}

	private static List<Object> preencheList(List<Object> list) {
		for (int i = 0; i < 1000; i++) {
			list.add(i);
		}
		return list;
	}

	@SuppressWarnings({ "unused" })
	private static void testaList(List<Object> list) {

		Iterator<Object> it = list.iterator();
		while(it.hasNext()) {
			Object o = it.next();
					
		}
		
		
//		int size = list.size();
//		for (int i = 0; i<size;i++) {
//			Object o = list.get(i);
//		}
	}

}
