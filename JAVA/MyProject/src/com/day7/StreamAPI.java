package com.day7;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 11, 12, 13, 14, 7);
		System.out.println(list);
		
		List<Integer> evenList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(evenList);
		
		List<String> names = Arrays.asList("Chandra", "Gowtham", "Lakshmi", "Priya", "Preethi", "Valan");
		List<String> namesList = names.stream().filter(n -> n.contains("n")).collect(Collectors.toList());
		System.out.println(namesList);
		
		List<Integer> mulList = list.stream().map(x -> x * 2).collect(Collectors.toList());
		System.out.println(mulList);
		
		Map<String, Integer> map = names.stream().collect(Collectors.toMap(z -> z, z -> z.length()));
		System.out.println(map);
	}

}
