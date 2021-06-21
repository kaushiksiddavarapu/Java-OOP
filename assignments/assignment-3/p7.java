/*Write a program to print the numbers in ascending and descending
order:
Test case input:
Enter the count of numbers : 10
Enter number 1 :2
Enter number 1 :10
Enter number 1 :8
Enter number 1 :6
Enter number 1 :1
Enter number 1 :3
Enter number 1 :5
Enter number 1 :4
Enter number 1 :7
Enter number 1 :9
Output:
Numbers in ascending order : 1,2,3,4,5,6,7,8,9,10
Numbers in descending order : 10,9,8,7,6,5,4,3,2,1
import java.io.*;
*/
import java.util.Scanner;
 public class p7
{
    public static void main(String []args) 
    {
        int i,j,n,temp=0;
	    Scanner in = new Scanner(System.in);
        in.close();
        System.out.println("ENTER NUMBER OF ELEMENTS IN ARRAY");
        n=in.nextInt();
        int a[]=new int[n];
        System.out.println("ENTER ELEMENTS IN ARRAY");
        for (i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        
        System.out.println("NUMBERS BEFORE SORTING");
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+"");
        }
        System.out.println();
        System.out.println("NUMBERS AFTER SORTING IN ASCENDING ORDER");
        for(i=0;i<n;i++)
        {
            for(j=0;j<=n-i-2;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        
        for(i=0;i<n;i++)
        {
            System.out.print(a[i]+"");
        }
        System.out.println();
        System.out.println("NUMBERS AFTER SORTING IN DESCENDING ORDER");
        for(i=n-1;i>=0;i--)
        {
            System.out.print(a[i]+"");
        }
        
	}
}
