package com.javacore;

public class Class1 {
	protected static int k = 10;
	void temp() {
		// not need init a static variable
		System.out.println(App.a);
	}
	
	void testSwitchWithString(byte a) {
		
		switch (a) {
		case 1: System.out.println(a);
		default: break;
		}
	}
}
