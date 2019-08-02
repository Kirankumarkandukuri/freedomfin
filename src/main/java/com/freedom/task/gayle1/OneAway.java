package com.freedom.task.gayle1;

public class OneAway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		OneAway OneAway = new OneAway();
		OneAway.oneAway("pale", "ple");
		OneAway.oneAway("pale", "bale");
		OneAway.oneAway("pales", "palty");
	}
	
	public void oneAway(String input1, String input2) {
	
		if(input1.length() == input2.length())
		{
			System.out.println(equalCheck(input1, input2));
		}
		else
		{
			System.out.println(notEqualCheck(input1, input2));
		}

	
	}
	
	public boolean equalCheck(String input1, String input2)
	{
		int index2=0;
		int found =0;
		
		for(int index1=0; index1<input1.length();)
		{
			if(input1.charAt(index1)!=input2.charAt(index2))
			{
				found++;
				if(found>1)
				{
					System.out.println(" Not a valid");
					return false;
				}
			}
			
				index1++;
				index2++;
		}
		
		return true;
	}
	
	public boolean notEqualCheck(String input1, String input2) {
		int index2=0;
		int found =0;
		
		for(int index1=0; index1<input1.length();)
		{
			if(input1.charAt(index1)!=input2.charAt(index2))
			{
				found++;
				if(found>1)
				{
					System.out.println(" Not a valid");
					return false;
				}
				index1++;
			}
			else {
			
				index1++;
				index2++;
			}
		}
		return true;
		
	}

}
