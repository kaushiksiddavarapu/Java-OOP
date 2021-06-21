/* Write a program to print the following details: (use only variables.Do not use any inbuilt methods. 
Provide value for the fields in the program) Roll No Name 19 Address Emailid Mobile No Parents Occupation Todays Date
*/

import java.util.Scanner;
 public class p1
{
    public static void main(String args[]) {
	 Scanner in = new Scanner(System.in);
        System.out.println("enter roll no. :");
        String roll = in.nextLine();
        System.out.println("enter name :");
        String name = in.nextLine();
        System.out.println("enter address :");
        String addr = in.nextLine();
        System.out.println("enter email id :");
        String em = in.nextLine();
        System.out.println("enter phone no. :");
        int phno = in.nextInt();
        System.out.println("enter date :");
        String da = in.nextLine();
        in.close();
        
        
        System.out.println("roll no : "+roll);
        System.out.println("name: "+name);
        System.out.println("address: "+addr);
        System.out.println("email id: "+em);
        System.out.println("phone number: "+phno);
        System.out.println("date :"+da);
	}
}
