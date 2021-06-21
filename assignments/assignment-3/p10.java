//Write a program to convert from one unit scale to another. Test case Input: Enter the number :     1 Enter the unit        :         km Enter the unit to be converted :Meter Ouput: 1000

import java.util.Scanner;
public class p10
{
    public static void main(String[] args) 
    { Scanner in= new Scanner(System.in);
        in.close();
        int ch;
        ch= in.nextInt();
        switch (ch)
        {
        case 1:
            {
        System.out.println("Enter Kilometer: ");
        double km;
        km = in.nextDouble();
        double meter=km*1000;
        System.out.println("meter:- "+meter);
        break;
            }
        case 2:
            {
                System.out.println("Enter Meter: ");
        double m;
        m = in.nextDouble();
        double km=m/1000;
        System.out.println("kilometer:- "+km);
        break;
    }
    }
    }
}