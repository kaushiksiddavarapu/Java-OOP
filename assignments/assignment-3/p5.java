/*
Write a program to print natural numbers
Test case input:
Enter the size of n : 10
Output : 1,2,3,4,5,6,7,8,9,10
*/


import java.util.Scanner;
 public class p5
{
    public static void main(String []args) 
    {
	    Scanner in = new Scanner(System.in);
        in.close();
        int i;
        System.out.println("ENTER THE SIZE OF N");
        int n = in.nextInt();
        for (i=1;i<=n;i++)
        {
            System.out.print(i+",");
        }
       
	}
    
}
