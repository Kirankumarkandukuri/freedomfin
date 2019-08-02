package com.freedom.task.gayle1;

public class Q8ZeroMatrix {
	
	public static void main(String args[])
	{
		Q8ZeroMatrix matrix = new Q8ZeroMatrix();
		
		int[][] input = { {1,2,3,4,5},{4,0,6,0,8},{7,8,9, 10, 11}};
		
		print(input);
		boolean[][] output = new boolean[input.length][input[0].length];
		
		for(int i=0; i<input.length;i++)
		{
			for(int j=0; j<input[0].length;j++)
			{
				
				if(input[i][j] == 0)
				{
					output[i][j] = true;
				}
			}
		
		}
		
		for(int i=0; i<input.length;i++)
		{
			for(int j=0; j<input[0].length;j++)
			{
				
				if(output[i][j] == true)
				{
					 for(int k=0;k<input[0].length;k++)
					 {
						 input[i][k] =0;
					 }
					 
					 for(int k=0;k<input.length;k++)
					 {
						 input[k][j] =0;
					 }
				}
			}
		
		}
		print(input);
		
	}
	
	public static  void print(int[][] input)
	{
		for(int i=0; i<input.length;i++)
		{
			for(int j=0; j<input[0].length;j++)
			{
				System.out.print(input[i][j]);
				System.out.print("  ");
			}
		System.out.println("");
		}
		
		System.out.println("");
	}
	
	

}
