package com.javacore;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Threads extends Thread {
	public void run () {
		System.out.print("simple thread");
	}
	
	public static void main(String[] args) {
		Thread th = new Threads();
		th.start();
	}
	
	static class Runable implements Runnable {
		public void run() {
			System.out.print("Runable thread");
		}
		
		public static void main(String[] args) {
			Thread th = new Thread(new Runable());
			th.start();
		}
		
	}
	
	static class Callables implements Callable<Object> {

		@Override
		public Object call() {
			System.out.print("Callable thread");
			return null;
		}
		
		public static void main(String[] args) throws InterruptedException, ExecutionException {
			ExecutorService ex = Executors.newFixedThreadPool(1);
			Future<Object> fu = ex.submit(new Callables());
			fu.get();
		}
	}
}
