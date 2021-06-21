/* 
Write a program to print the following details: (use only variables.Do not use any inbuilt methods) RollNo 
Name 
English 
Physics 
Chemistry 
Average
*/

import java.util.Scanner;
 public class p2
{
    public static void main(String args[]) {
	         Scanner in = new Scanner(System.in);

        System.out.println("enter roll no. :");
        String roll = in.nextLine();
        System.out.println("enter name :");
        String name = in.nextLine();
        System.out.println("enter marks in english :");
        int e = in.nextInt();
        System.out.println("enter marks in chemistry :");
        int c = in.nextInt();
        System.out.println("enter marks in physics :");
        int p = in.nextInt();
        int avg = (e+c+p)/3;
        in.close();

        System.out.println("roll no : "+roll);
        System.out.println("name: "+name);
        System.out.println("marks in english : "+e);
        System.out.println("marks in chemistry : "+c);
        System.out.println("marks in physics : "+p);
        System.out.println("avg is :"+avg);

}
}

