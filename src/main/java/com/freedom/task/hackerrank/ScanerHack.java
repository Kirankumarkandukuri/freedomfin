package com.freedom.task.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ScanerHack {

    public static void main(String[] args) { Scanner scanner = new Scanner(System.in);
    double payment = scanner.nextDouble();
    scanner.close();
    
    // Write your code here.
    NumberFormat format = NumberFormat.getInstance(Locale.CANADA);
  String us =  format.format(payment);
     String india =  format.format(payment);
      String france =  format.format(payment);
       String china =  format.format(payment);
    System.out.println("US: " + us);
    System.out.println("India: " + india);
    System.out.println("China: " + china);
    System.out.println("France: " + france);
}}


