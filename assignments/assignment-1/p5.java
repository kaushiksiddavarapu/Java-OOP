/*
Write a program to have two numbers. Perform the sum and difference of two numbers.
*/

import java.util.Scanner;
 public class p5
{
    public static void main(String args[]) {
	         Scanner in = new Scanner(System.in);
        
        System.out.println("enter first no.: ");
        int a = in.nextInt();
        System.out.println("enter secnd no.: ");
        int b = in.nextInt();
        
        int sum = a+b;
        int diff= a-b;
        System.out.println("sum is :"+sum);
        System.out.println("difference is :"+diff);
        in.close();
        }
 }
