package com.freedom.task.hackerrank.stacks;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
	


    // Complete the isBalanced function below.
    static String isBalanced(String s1) {
        char c[] = s1.toCharArray();
        if(c.length%2 !=0)
        return "NO";
        Stack s  = new Stack();
        for(int i=0;i<c.length;i++)
        {
            if(c[i]=='{' || c[i]=='('|| c[i]=='[')
            s.push(c[i]);
            else {
                 if(c[i]=='}' || c[i]==')'|| c[i]==']'){
                     if(s.isEmpty())
                     return "NO";
                 }
                if(c[i]=='}'){
                    char d = (char)s.peek();
                    if(d!='{')
                    return "NO";
                     s.pop();
                }
                 if(c[i]==')'){
                    char d = (char)s.peek();
                    if(d!='(')
                    return "NO";
                     s.pop();
                }
                 if(c[i]==']'){
                    char d = (char)s.peek();
                    if(d!='[')
                    return "NO";
                    s.pop();
                }
            }
        }

        if(s.isEmpty())
        return "YES";
        else
        return "NO";


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }

}
