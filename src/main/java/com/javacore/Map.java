package com.javacore;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class Map {
	public static void main(String[] args) {
		//key not null, sync
		Hashtable<Integer, String> map = new Hashtable<>();
		
		//key can null, sync
		ConcurrentHashMap<String, String> concuMap = new ConcurrentHashMap<>();
	}
}
