package com.stackbits.java8.fundamentals;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambda {
	
	public static void main(String[] args) {
		
		FileFilter javaFileFilterLambda = (File pathname) -> pathname.getName().endsWith(".java");
		File dir = new File("/home/lily/workspace/eclipse-workspace/MultithreadingDemo/src/main/java/com/stackbits/multithreading/basics");
		File[] javaFiles = dir.listFiles(javaFileFilterLambda);
		for (File file : javaFiles) {
			System.out.println(file.getAbsolutePath());
		}
	}
}
