package com.freedom.task.threads;

import java.util.concurrent.TimeUnit;

public class LoopTaskA implements Runnable {

	public static int count=0;
	private int id;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("##### Task Id"+ id +" Starting #####");
		for(int i=10;i>=0;i--)
		{
			System.out.println("<"+ id+"> Tick Tixk "+ i);
		}
		try {
			TimeUnit.MILLISECONDS.sleep((long)Math.random()*1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
		System.out.println("##### Task Id"+ id +" Done #####");
		
	}
	
	public LoopTaskA()
	{
		this.id=++count;
	}

}
