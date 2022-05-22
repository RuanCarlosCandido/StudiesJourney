package com.general.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

import com.architecture.concreteAnimals.Dog;

public class Exercise1 {

	public static void main(String[] args) {

		List<Dog> dogKennel = new ArrayList<Dog>();
		dogKennel.add(new Dog("srd", "Mel", 3));
		dogKennel.add(new Dog("srd", "Diana", 5));
		dogKennel.add(new Dog("pit Bull", "Fiona", 7));
		dogKennel.add(new Dog("German Sheperd", "Thor", 3));
		dogKennel.add(new Dog("German Sheperd", "k9", 6));
		dogKennel.add(new Dog("Dobermann", "Pest", 9));
		dogKennel.add(new Dog("Poodle", "Mel", 9));	
		dogKennel.add(null);

		/* Given a list of Dogs, you need to find all the dogs whose age is greater than
		 5 and print the employee names*/
		dogKennel.stream()
		.filter(dog -> dog != null)
		.filter(dog -> dog.getAge() > 5)
		//you have to call it in static way to works
		.map(Dog::getName)
		.forEach(System.out::println);
		;

		//Given the list of dogs, find the count of dogs with age greater than 8?
		System.out.println("count =" +
				dogKennel.stream()
		.filter(dog -> dog != null)
		.filter(dog -> dog.getAge() > 5)
		.count()
				);

		//Given the list of dogs, find the dog whose name is Fiona
		dogKennel.stream()
		.filter(dog -> dog != null)
		.filter(dog -> dog.getName().equalsIgnoreCase("Fiona"))
		.collect(Collectors.toList()).forEach(System.out::println);;

		Optional<Dog> d1 = dogKennel.stream()
				.filter(dog -> dog != null)
				.filter(dog -> dog.getName().equalsIgnoreCase("Fiona"))
				.findAny();

		if(d1.isPresent())
			System.out.println("using findAny "+d1.get());


		//Given a list of dogs, You need to find highest age of dogs?
		OptionalInt max = dogKennel.stream().filter(dog -> dog!=null).mapToInt(Dog::getAge).max();
		if(max.isPresent())
			System.out.println("max= " + max.getAsInt());


		//Given a list of Dogs, you need sort Dogs list by age?
		dogKennel.stream()
		.filter(dog -> dog != null)
		.sorted((dog1,dog2)->dog1.getAge()-dog2.getAge())
		.forEach(System.out::println);;


		//Given the list of Dogs, you need to join the all dogs names with ","?
		String joinedNames = String.join(",",
				dogKennel.stream()
				.filter(dog -> dog != null)
				.map(Dog::getName)
				.collect(Collectors.toList()));
		System.out.println("joined_names = " +joinedNames);


		//Given the list of dogs, you need to group them by name
				dogKennel.stream()
				.filter(dog -> dog != null)
				.collect(Collectors.groupingBy(Dog::getName))
				.forEach((name, list) ->System.out.println("Name: "+name+"==>"+list));


	}

}
