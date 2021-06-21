/*Write a program to print the sum of n numbers
Note :Use array
Test Case Input :
Enter the total count(n) : 5
Enter n1 :1
Enter n2 :2
Enter n3 :3
Enter n4 :4
Enter n5 :5
Output :
The sum is : 15
*/

import java.util.Scanner;

public class p9{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        in.close();
        int n,i,sum=0;
        System.out.println("Enter the number to find the sum of first n natural numbers");
        n=in.nextInt();        
        for(i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of first "+n+" Natural numbers is: "+sum);
       
    }
}

