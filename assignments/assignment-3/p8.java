/*
Every text file has a set of words. Read from the user the following
input:
Number of words(excluding The, I) : 34
Number of special words(The,I) : 10
Assume that each word occupies 8 bits and special word occupies 6
bits calculate the total size in bytes for storing the file.
Test Case Input :
Number of words(excluding The, I) : 34
Number of special words(The,I) : 10
Total size is 34*8+10*6=332 bits
Total size in bytes =41 bytes and 4 bits
import java.io.*; 
*/
import java.util.*;  
  public class p8
{
public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of words(excluding The, I) :");
		int a = sc.nextInt();
		System.out.println("Number of special words(The,I) :");
		int b = sc.nextInt();
		int bits= (a*8)+(b*6);
		int bytes = (bits/8);
		int n =bits-(bytes*8);
		System.out.print(bytes+ " bytes " + n + " bits");
        sc.close();
	}
}
