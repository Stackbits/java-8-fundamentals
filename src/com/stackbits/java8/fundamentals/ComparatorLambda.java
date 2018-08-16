package com.stackbits.java8.fundamentals;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {
	public static void main(String[] args) {
		Comparator<String> comparatorLambda = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());
		List<String> list = Arrays.asList("***", "**", "****", "*");
		Collections.sort(list, comparatorLambda);
		for (String s : list) {
			System.out.println(s);
		}
	}

}
