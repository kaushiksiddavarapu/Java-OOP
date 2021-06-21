/* 
Given principal as P,No of Years as N,Rate of intrest as R. Calculate
Intrest =(P*N*R)/100
*/

import java.util.Scanner;
 public class p3
{
    public static void main(String args[]) {
	         Scanner in = new Scanner(System.in);
        
        System.out.println("enter principal: ");
        int P = in.nextInt();
        System.out.println("enter no. of years N : ");
        int N = in.nextInt();
        System.out.println("enter rate if intrest :");
        int R = in.nextInt();
        float intrest =(P*N*R)/100;
        System.out.println("intrest is :"+intrest);

        in.close();
	}
}

