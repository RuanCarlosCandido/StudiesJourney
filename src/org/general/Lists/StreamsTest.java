package org.general.Lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.architecture.concreteAnimals.Dog;

public class StreamsTest {

	public static void main(String[] args) {

		List<Dog> dogKennel = new ArrayList<Dog>();
		dogKennel.add(new Dog("srd", "Mel",3));
		dogKennel.add(new Dog("srd", "Diana",5));
		dogKennel.add(new Dog("pit Bull", "Fiona",7));
		dogKennel.add(new Dog("German Sheperd", "Thor",3));
		dogKennel.add(new Dog("German Sheperd", "k9",6));	
		dogKennel.add(null);

		dogKennel.stream().forEach(System.out::println);
		//equivalent 
		dogKennel.stream().forEach(dog ->System.out.println(dog));
				
		
		/* this is the default implementation of the forEach method */
		Consumer<? super Dog> action = dog -> System.out.println(dog);
		//equivalent
		Consumer<? super Dog> actionEq = System.out::println;
		
		
		/* execute the action there's no return */
		action.accept(new Dog("pit Bull", "Fred",9));
		
		/* basic for each interaction with no return */
		dogKennel.forEach(action);

		
		Stream.of("10","20","30")
	      .mapToInt(Integer::parseInt)
	      .average()
	      .ifPresent(System.out::println);
		
		
		
		/* remove any object that match the filter */
		Predicate<? super Dog> filter = dog -> dog == null;
		boolean removed = dogKennel.removeIf(filter);
		System.out.println(removed);

		/*
		 * The comparator to use in the sort method you need to compare and subtract
		 * something to works
		 */
		Comparator<Dog> comparator = new Comparator<Dog>() {
			@Override
			public int compare(Dog dog1, Dog dog2) {
				return dog1.getName().length() - dog2.getName().length();
			}
		};
		dogKennel.sort(comparator);
		dogKennel.forEach(action);

		/* Not all of this satisfies the condition */
		boolean allMatched = dogKennel.stream().allMatch(filter);
		System.out.println(allMatched);

		/* at least one of this satisfies the condition */
		dogKennel.add(null);
		boolean anyMatch = dogKennel.stream().anyMatch(filter);
		System.out.println(anyMatch);

		long count = dogKennel.stream().count();
		System.out.println(count);

		/* returns a list without any repetition */
		dogKennel.add(new Dog("pit Bull", "Alice",9));
		System.out.println("distinct");
		Stream<Dog> distinctedKennel = dogKennel.stream().distinct();
		distinctedKennel.forEach(action);

		/* returns a stream with only the values that passes the filter */
		System.out.println("filter");
		Stream<Dog> filteredStream = dogKennel.stream().filter(filter);
		filteredStream.forEach(action);

		List<String> names = dogKennel.stream().filter(dog -> dog != null).map(dog -> dog.getName())
				.map(str -> str.toUpperCase()).collect(Collectors.toList());
		System.out.println(names);
		
		List<Dog> names2 = dogKennel.stream().filter(dog -> dog != null).sorted(Comparator.comparing(Dog::getRace)).collect(Collectors.toList());
		System.out.println(names2);
		
	}

}
