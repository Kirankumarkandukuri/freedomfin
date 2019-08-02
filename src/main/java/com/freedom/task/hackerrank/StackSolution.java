package com.freedom.task.hackerrank;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class StackSolution {

    /*
     * Complete the twoStacks function below.
     */
	
	 
    static int twoStacks(int x, int[] a, int[] b) {
        /*
         * Write your code here.
         */

         Stack first = new Stack();
         Stack second = new Stack();
         int asum=0;
         int outerSum=0;
         int basum=0;
         int bouterSum=0;
         int max=0; 
         for(int i=0;i<a.length;i++)
         {
        	 
        	 outerSum = outerSum+a[i];
        	 asum=outerSum;
        	 if(outerSum>x)
        	 {
        		 first.push(i);
        		 if(i>max)
        			 max=i;
        		 break;
        	 }
        	 int count =i+1;
        	 for(int j=0;j<b.length;j++)
             {
        		 count =count+1;
        		 asum=asum+b[j];
                
                if(asum<x &&j==b.length-1) {
                	first.push(count);
                	if(count>max)
                		max=count;
                	break;
                }
                else if(asum>x)
                {
                	first.push(count-1);
                	if(count-1>max)
                		max=count-1;
                	break;
                }
                
             }
         }
         
         for(int i=0;i<b.length;i++)
         {
        	 
        	 bouterSum = bouterSum+b[i];
        	 basum=bouterSum;
        	 if(bouterSum>x)
        	 {first.push(i);
        	 if(i>max)
         		max=i;
        		 break;
        	 }
        	 int count =i+1;
        	 for(int j=0;j<a.length;j++)
             {
        		 basum=basum+a[j];
        		 count =count+1;
                if(basum<x && j==a.length-1) {
                	first.push(count);
                	if(count>max)
                		max=count;
                	break;
                }
                else if(basum>x)
                {
                	first.push(count-1);
                	if(count-1>max)
                		max=count-1;
                	break;
                }
                
             }
         }

       
  
    return max;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int g = Integer.parseInt(scanner.nextLine().trim());

        for (int gItr = 0; gItr < g; gItr++) {
            String[] nmx = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nmx[0].trim());

            int m = Integer.parseInt(nmx[1].trim());

            int x = Integer.parseInt(nmx[2].trim());

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");

            for (int aItr = 0; aItr < n; aItr++) {
                int aItem = Integer.parseInt(aItems[aItr].trim());
                a[aItr] = aItem;
            }

            int[] b = new int[m];

            String[] bItems = scanner.nextLine().split(" ");

            for (int bItr = 0; bItr < m; bItr++) {
                int bItem = Integer.parseInt(bItems[bItr].trim());
                b[bItr] = bItem;
            }

            int result = twoStacks(x, a, b);

            //bufferedWriter.write(String.valueOf(result));
            //bufferedWriter.newLine();
        }

        //bufferedWriter.close();
    }
}

