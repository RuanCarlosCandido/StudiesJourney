package org.general.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class StreamsIntegerList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i<10 ; i++)
		list.add(new Random().nextInt(100));
		
		Predicate<? super Integer> filter = number -> number > 50;

		list.forEach(number -> System.out.print(number + " "));
		list.stream().filter(filter).map(number -> number*2).forEach(number->System.out.println(number+ " "));

		
		
	}

}
