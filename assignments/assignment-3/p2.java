/*
Write a program to read from the customer the following details:
Name :
Aadhar No :
Phone No :
Age :
If age entered is greater than 60 it should assume as Senior Citizen
No of years to be deposited :

Test cases:
Name : S.Rameshkumar
Aadhar No : B10405052
Phone No : 9823232121
Age : 34
Amount to be Deposited : 60000
Output:
Interest is : Rs.660
*/

import java.util.Scanner;


public class p2{

     public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int age; long phno;
        double interest=0.0,amt,inr=0.0,yr;
        String aadhar,name;
        System.out.println("ENTER NAME");
        name=in.next();
        System.out.println("ENTER AADHAR NUMBER");
        aadhar=in.next();
        System.out.println("ENTER PHONE NUMBER");
        phno=in.nextLong();
        System.out.println("ENTER AGE");
        age=in.nextInt();
        System.out.println("ENTER AMOUNT TO BE DEPOSITED");
        amt=in.nextDouble();
        System.out.println("ENTER NUMBER OF YEARS TO BE DEPOSITED");
        yr=in.nextDouble();
        System.out.println("NAME :"+ name);
        System.out.println("AADHAR NO :"+aadhar);
        System.out.println("PHONE NO:"+phno);
        System.out.println("AGE :"+age);
        System.out.println("AMOUNT TO BE DEPOSITED :"+amt);
        System.out.println("NUMBER OF YEARS TO BE DEPOSITED :"+yr);
        if(age>60)
        {
            System.out.println("THE PERSON IS A SENIOR CITIZEN");
            if(amt<=10000.0)
            {
               inr=8.0;
               System.out.println("RATE OF INTEREST IS "+ inr);
               interest=(amt*inr*yr)/(100);
            }
            else if(amt>10000.0&&amt<=20000.0)
            {
                inr=9.0;
               System.out.println("RATE OF INTEREST IS "+ inr);
               interest=(amt*inr*yr)/(100);
            }
            else if(amt>20000.0&&amt<=30000.0)
            {
                inr=9.5;
               System.out.println("RATE OF INTEREST IS "+ inr);
               interest=(amt*inr*yr)/(100);
            }
            else if(amt>30000.0&&amt<=40000.0)
            {
                inr=10.0;
               System.out.println("RATE OF INTEREST IS "+ inr);
               interest=(amt*inr*yr)/(100);
            }
            else if(amt>40000.0&&amt<=50000.0)
            {
                inr=10.5;
               System.out.println("RATE OF INTEREST IS "+ inr);
               interest=(amt*inr*yr)/(100);
            }
            else if(amt>50000.0)
            {
                inr=11.0;
               System.out.println("RATE OF INTEREST IS "+ inr);
               interest=(amt*inr*yr)/(100);
            }
        }
        else
        {
            System.out.println("THE PERSON IS NOT A SENIOR CITIZEN");
            if(amt<=10000.0)
            {
               inr=7.0;
               System.out.println("RATE OF INTEREST IS "+ inr);
               interest=(amt*inr*yr)/(100);
            }
            else if(amt>10000.0&&amt<=20000.0)
            {
                inr=8.5;
               System.out.println("RATE OF INTEREST IS "+ inr);
               interest=(amt*inr*yr)/(100);
            }
            else if(amt>20000.0&&amt<=30000.0)
            {
                inr=9.0;
               System.out.println("RATE OF INTEREST IS "+ inr);
               interest=(amt*inr*yr)/(100);
            }
            else if(amt>30000.0&&amt<=40000.0)
            {
                inr=9.5;
               System.out.println("RATE OF INTEREST IS "+ inr);
               interest=(amt*inr*yr)/(100);
            }
            else if(amt>40000.0&&amt<=50000.0)
            {
                inr=10.0;
               System.out.println("RATE OF INTEREST IS "+ inr);
               interest=(amt*inr*yr)/(100);
            }
            else if(amt>50000.0)
            {
                inr=10.5;
               System.out.println("RATE OF INTEREST IS "+ inr);
               interest=(amt*inr*yr)/(100);
            }
        }
        System.out.println("INTEREST :"+interest);
        in.close();
     }
}
