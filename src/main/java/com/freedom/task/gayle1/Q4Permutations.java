package com.freedom.task.gayle1;

import java.util.Hashtable;
import java.util.Map;

public class Q4Permutations {
	public static void main(String[] args)
	{
		Q4Permutations Q4Permutations = new Q4Permutations();
		Q4Permutations.palin_permutation("abccba");
	}
	
	public void palin_permutation(String input)
	{
		char[] c = input.toCharArray();
		Hashtable table = new Hashtable();
		if(input.length()%2==0)
		{
			for(int i=0;i<c.length;i++)
			{
				table.put(c[i], ((int)table.get(c[i]))+1);
			}
			
			
			
		}
	}

}
