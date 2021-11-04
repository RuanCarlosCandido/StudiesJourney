package org.general.Lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.architecture.concreteAnimals.Dog;

public class StreamsTest {

	public static void main(String[] args) {

		Dog dog1 = new Dog("srd", "Mel");
		Dog dog2 = new Dog("srd", "Diana");
		Dog dog3 = new Dog("pit Bull", "Fiona");
		Dog dog4 = new Dog("German Sheperd", "Thor");

		List<Dog> dogKennel = new ArrayList<Dog>();
		dogKennel.add(dog1);
		dogKennel.add(dog2);
		dogKennel.add(dog3);
		dogKennel.add(dog4);
		dogKennel.add(null);

		/* this is the default implementation of the forEach method */
		Consumer<? super Dog> action = dog -> System.out.println(dog);

		/* execute the action there's no return */
		action.accept(dog2);

		/* basic for each interaction with no return */
		dogKennel.forEach(action);

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
		dogKennel.add(dog3);
		System.out.println("distinct");
		Stream<Dog> distinctedKennel = dogKennel.stream().distinct();
		distinctedKennel.forEach(action);

		/* returns a stream with only the values that passes the filter */
		System.out.println("filter");
		Stream<Dog> filteredStream = dogKennel.stream().filter(filter);
		filteredStream.forEach(action);

	}

}
