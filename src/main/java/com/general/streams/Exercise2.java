package com.general.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			list.add(new Random().nextInt(100));

		Predicate<? super Integer> filter = number -> number > 50;

		list.forEach(number -> System.out.print(number + " "));

		/* multiply every number in the list that satisfies the filter */
		Stream<Object> str2 = list.stream().map(number -> number * 2);

		/* multiply every number in the list that satisfies the filter */
		Stream<Object> str = list.stream().filter(filter).map(number -> number * 2);

		list.stream().filter(filter).map(number -> number * 2);

		System.out.println(Arrays.toString(str.toArray()));
		System.out.println(Arrays.toString(str2.toArray()));

		double average = list.stream().mapToInt(i -> i).average().getAsDouble();

		System.out.println(average);
		
		List<String> list2 = new ArrayList<String>();
		list2.add("ruan");
		list2.add("carlos");
		list2.add("ala");
		list2.add("abcd");

		List<String> upperList = list2.stream().map(String::toUpperCase).collect(Collectors.toList());

		System.out.println(upperList);
		
		List<String> filteredList = list2.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3)
				.collect(Collectors.toList());

		System.out.println(filteredList);

		Stream<Integer> intStream=Stream.generate(() -> new Random().nextInt(1000)).limit(5);
		intStream.forEach(System.out::println);

		Stream<Integer> intStream2 = Stream.iterate(100 , n -> n+1).limit(5);
		intStream2.forEach(System.out::println);
	

int sum = Arrays.stream(new int[] {1,2,3})
                .sum();
System.out.println(sum);
		
	}

	public static int T(String... names) {

		Stream.of(names).filter(name -> name.length() > 5).mapToInt(name -> name.length());

		return 0;
	}

}
