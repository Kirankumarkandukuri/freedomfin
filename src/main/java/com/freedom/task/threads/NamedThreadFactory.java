package com.freedom.task.threads;

import java.util.concurrent.ThreadFactory;

public class NamedThreadFactory implements ThreadFactory {

	private static int count=0;
	
	private static String name="MyThread";
	
	@Override
	public Thread newThread(Runnable r) {
		// TODO Auto-generated method stub
		Thread t = new Thread(r, name+(++count));
		return t;
	}

}
