package com.stackbits.java8.fundamentals;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		List<String> cityList = new ArrayList<>();
		cityList.add("BBSR");
		cityList.add("BAM");
		Consumer<String> addConsumer = cityList::add;
		Consumer<String> logConsumer = System.out::println;
		List<String> newCityList = new ArrayList<>();
		Consumer<String> chainingConsumer = addConsumer.andThen(logConsumer);
		cityList.stream().forEach(chainingConsumer);
	}
}
