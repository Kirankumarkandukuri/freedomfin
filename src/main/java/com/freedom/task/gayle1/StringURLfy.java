package com.freedom.task.gayle1;

public class StringURLfy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringURLfy StringURLfy = new StringURLfy();
		StringURLfy.urlfy("Mr String check        ");
	}
	
	public void urlfy(String input)
	{
		char[] c = input.toCharArray();
	for(int i=0;i<c.length;)
	{
		if(i+1<c.length && c[i]==' ' && c[i+1] !=' '  )
		{
			
			
			for(int j=c.length;j>i;j--)
			{
				if(j<c.length-3)
				{
					c[j+3]=c[j];
				}
			}
			c[i] = '%';
			c[i+1] = '2';
			c[i+2] = '0';
			c[i+3] = 'f';
			i=i+4;
		}
		else
			i++;
	}
	
	String s =new String(c);
	System.out.println(s);
	}

}
