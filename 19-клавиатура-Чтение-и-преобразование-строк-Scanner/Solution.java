//package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner kbListener = new Scanner(System.in);

    String row1 = kbListener.nextLine();
    String row2 = kbListener.nextLine();
    String row3 = kbListener.nextLine();
    
    row2 = row2.toUpperCase();
    row1 = row1.toLowerCase();
   
    System.out.println(row3);
    System.out.println(row2);
    System.out.println(row1);
    
  }
}
