package com.javacore;

import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class App {
	
	
	public static char[] a;

	public static void main(String[] args) {
		label:
		for (String string : args) {
			break label;
		}
	}
}
