package com.freedom.task.gayle1;

public class UniqueCharactersInString {
	
	public static void main(String args[])
	{
		UniqueCharactersInString uniqueCharactersInString = new UniqueCharactersInString();
		uniqueCharactersInString.findUniqueCharactersInString("abcaccdfga");
		uniqueCharactersInString.properway("abcaccdfga");
	}
	
	public void findUniqueCharactersInString(String input)
	{
		char c[] = input.toCharArray();
		char output[] = new char[c.length];
		boolean found= false;
		int pointer =0;
		for(int i=0;i<c.length;i++)
		{
			if(i==0) {
				output[0]=c[0];
				pointer++;
			}
			else
			{
				found=false;
				for(int j=0;j<pointer;j++)
				{
				
					if(output[j]==c[i])
					{
						found=true;
					}
				}
				if(!found)
				{
					output[pointer] =c[i];
					pointer++;
				}
				
			}
		}
		
		for(int i=0;i<output.length;i++)
		{
			System.out.println(output[i]);
		}
	}

	 public void properway(String input)
	 {
		 boolean[] b = new boolean[127];
		 
		 for(int i=0; i<input.length();i++)
		 {
			 if(b[input.charAt(i)])
			 {
				 
			 }
			 else
			 b[input.charAt(i)]=true;
		 }
		 
		 for(int i=0; i<127;i++)
		 {
			 if(b[i])
			 {
				 System.out.println((char)i);
			 }
		 }
		 
	 }
}
