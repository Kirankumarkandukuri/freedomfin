package com.freedom.task.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingFixedThreadPool {

	public static void main(String[] args) {

		System.out.println("Start of main Thread here");
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		service.execute(new LoopTaskA());
		service.execute(new LoopTaskA());
		service.execute(new LoopTaskA());
		service.execute(new LoopTaskA());
		service.execute(new LoopTaskA());
		service.execute(new LoopTaskA());
		service.shutdown();
		System.out.println("ENd of main Thread here");
	}

}
