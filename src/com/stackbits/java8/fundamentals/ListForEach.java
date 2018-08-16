package com.stackbits.java8.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListForEach {
	public static void main(String[] args) {
		List<String> cities = Arrays.asList("Shimla", "Bbsr", "Bam", "Delhi", "Mumbai");
		List<String> newCityList = new ArrayList<>(); 
		Consumer<String> logConsumer = System.out::println;
		Consumer<String> addConsumer = newCityList::add;
		cities.forEach(logConsumer.andThen(addConsumer));
		newCityList.sort(String::compareTo);
		newCityList.forEach(logConsumer);
	}
}
