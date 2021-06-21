/*Write a program to print the multiplication table for a given number x
Test case input:
Enter the value of x: 5
Output:
5*1=5
5*2=10
5*3=15
5*4=20
5*5=25
5*6=30
5*7=35
5*8=40
5*9=45
5*10=50
*/

import java.util.Scanner;
 public class p6
{
    public static void main(String []args) 
    {
	    Scanner in = new Scanner(System.in);
        in.close();
        int i;
        System.out.println("ENTER N");
        int n = in.nextInt();
        for (i=1;i<=10;i++)
        {
            System.out.println(n + "*" + i + "=" + n*i);
        }
	}
}
