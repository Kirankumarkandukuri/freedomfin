package com.freedom.task.gayle1;

public class Check2StringsPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check2StringsPermutation Check2StringsPermutation = new Check2StringsPermutation();
		Check2StringsPermutation.check2Strings("abcd", "cddb");
	}
	
	public void check2Strings(String input1, String input2)
	{
		int[] b = new int[127];
		for(int i=0; i<input1.length();i++)
		{
			if(b[input1.charAt(i)]==0)
			{
				b[input1.charAt(i)]=1;
			}
			else
				b[input1.charAt(i)]=b[input1.charAt(i)]+1;
				
		}
		
		for(int i=0; i<input2.length();i++)
		{
			if(b[input2.charAt(i)]==0)
			{
				b[input2.charAt(i)]=0;
			}
			else
				b[input2.charAt(i)]=b[input2.charAt(i)]-1;
				
		}
		for(int i=0; i<127;i++){
			if(b[i]!=0)
			{
				System.out.println("not");
			}
		}
		
		
		
		
	}

}
