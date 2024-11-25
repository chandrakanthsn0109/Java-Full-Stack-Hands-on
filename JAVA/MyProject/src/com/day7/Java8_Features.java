package com.day7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class Employee {
	int id;
	String name;
	int salary;

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class Java8_Features {

	public static void main(String[] args) {

		// 1. Given a list of integers, find out all the even numbers that exist in the
		// list using Stream functions?

//				2, 4, 4, 7, 8, 9, 11, 12, 24, 31, 42
		List<Integer> list = Arrays.asList(2, 4, 4, 7, 8, 9, 11, 12, 24, 31, 42);
		List<Integer> eveLi = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(eveLi);

		// 2. Given a list of integers, find out all the numbers starting with 1 using
		// Stream functions?
		List<Integer> list1 = Arrays.asList(2, 4, 4, 7, 8, 9, 11, 12, 24, 31, 42);
		List<Integer> start = list.stream().filter(z -> String.valueOf(z).startsWith("1")).collect(Collectors.toList());
		System.out.println(start);

		// 3. How to find duplicate elements in a given integers list in java using
		// Stream functions?
		List<Integer> list2 = Arrays.asList(2, 4, 4, 7, 8, 51, 93, 45, 9, 11, 12, 24, 31, 42);
		List<Integer> dup = list2.stream().filter(z -> list2.indexOf(z) != list2.lastIndexOf(z))
				.collect(Collectors.toList());
		System.out.println(dup);

		Set<Integer> set1 = list2.stream().filter(z -> list2.indexOf(z) != list2.lastIndexOf(z))
				.collect(Collectors.toSet());
		System.out.println(set1);

		Set<Integer> tempSet = new HashSet<>();
		long duplicateCount = list.stream().filter(x -> tempSet.add(x) == false).count();
		System.out.println(duplicateCount);

		// 4. Convert a List of String into a Map key and it's length as Map Value using
		// Java 8 Stream
		List<String> str = Arrays.asList("One", "Two", "Three");
		Map<String, Integer> map1 = str.stream().collect(Collectors.toMap(x -> x, y -> y.length()));
		System.out.println(map1);

		// 5. Convert a List of String into a Map value and it's length as Map key using
		// Java 8 Stream
		List<String> str1 = Arrays.asList("Apple", "Banana", "Watermelon", "JackFruit");
		Map<Integer, String> map2 = str1.stream().collect(Collectors.toMap(x -> x.length(), z -> z));
		System.out.println(map2);

		// 6. Convert a List of String into upper case using stream
		List<String> str2 = str1.stream().map(z -> z.toUpperCase()).collect(Collectors.toList());
		System.out.println(str2);

		// 7. Given the list of integers, find the first element of the list using
		// Stream functions?
		int a = list2.stream().findFirst().get();
		System.out.println(a);

		// 8. Given a list of integers, find the total number of elements present in the
		// list using Stream functions?
		long b = list2.stream().count();
		System.out.println(b);

		// 9. Given a list of integers, find the maximum value element present in it
		// using Stream functions?
		int c = list2.stream().min((o1, o2) -> o1 - o2).get();
		System.out.println(c);

		// 10. Sort the Employee object using salary
		List<Employee> emp = Arrays.asList(new Employee(101, "Chandra", 45000), new Employee(102, "Sridhar", 25000),
				new Employee(103, "Raju", 15000));

		List<Employee> emp2 = emp.stream().sorted((l1, l2) -> l1.salary - l2.salary).collect(Collectors.toList());
		System.out.println(emp2);

		// 11. Given a list of integers, sort all the values present in it using Stream
		// functions?
		List<Integer> sort1 = list2.stream().sorted().collect(Collectors.toList());
		System.out.println(sort1);

		// 12. Given a list of integers, sort all the values present in it in descending
		// order using Stream functions?
		List<Integer> descSort = list2.stream().sorted((x, y) -> y - x).collect(Collectors.toList());
		System.out.println(descSort);

		// 13. Given an integer array nums, return true if any value appears at least
		// twice in the array, and return false if every element is distinct.
		tempSet.clear();
		boolean flag = list.stream().filter(x -> tempSet.add(x) == false).count() > 0 ? true : false;
		System.out.println(flag);

		// 14. Write a Java 8 program to sort an array and then convert the sorted array
		// into Stream?
		int arr[] = { 3, 5, 2, 1, 7 };
//	 				Arrays.sort(arr);
		Arrays.stream(arr).sorted().forEach(n -> System.out.print(n + " "));
		System.out.println();

		// 15. Java 8 program to find factorial of given list of integer values
		List<Integer> list5 = Arrays.asList(0, 1, 2, 3, 4, 5);
		Map<Integer, Integer> factList = list5.stream().collect(Collectors.toMap(x -> x, y -> {
			int fact = 1;
			for (int i = 0; i <= y; i++) {
				if (i == 0) {
					fact=1;
				} else {
					fact = fact * i;
				}
			}
			return fact;
		}));
		System.out.println("Factorial: " + factList);
		
		//16. flatMap
	    /*
	     * flatMap() V/s map():
			map() transforms each element of a stream into another object, resulting in a stream of the same size as the input. It’s used for one-to-one transformations.
			      It processes the stream of values.
			flatMap() transforms each element of a stream into zero or more elements, potentially changing the size of the stream. It’s used for one-to-many transformations and flattening nested structures.
	              It processes the stream of stream's values. 
	     */
	    List<Integer> even = Arrays.asList(2, 4, 6, 8);
	    List<Integer> odd = Arrays.asList(1, 3, 5, 7, 9);
	    List<List<Integer>> evenOdd = Arrays.asList(even, odd);
	    System.out.println("Before Flattering");
	    System.out.println(evenOdd);	    
	    List<Integer> result = evenOdd.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
	    System.out.println("After Flattering");
	    System.out.println(result);

	  //16. Java 8 : Consumer
	    /*
	     * A Consumer is an in-build functional interface in the java.util.function package. we use consumers when we need to consume objects, the consumer takes an input value and returns nothing.
	     */
	    Consumer<String> consumer = str3 -> System.out.println(str);
	    str2.forEach(consumer);
	    Consumer<Integer> evenConsumer = n -> {
	    	if(n % 2 == 0)
	    		System.out.println(n);
	    };
	    list.forEach(evenConsumer);
	    
	}

}
