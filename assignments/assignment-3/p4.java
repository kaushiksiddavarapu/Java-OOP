/*
A restaurant has five categories of items. The discount for each
category is as below:
Customer can order items for each category.
Test cases:
Enter the no of items for category A :10
Enter the no of items for category B :12
Enter the no of items for category C : 6
6
Enter the no of items for category D :12
Enter the no of items for category E :10
Output:
Category No of items Unit cost Cost(Rs.)
A 10 300 2700
B 12 150 1710
C 6 200 1128
D 12 175 2037
E 10 180 1782
*/


import java.util.*;  
public class p4
{
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in); 
		int A,B,C,D,E;
		System.out.println("Enter the no of items for category A :");
		A = sc.nextInt();
		System.out.println("Enter the no of items for category B :");
		B = sc.nextInt();
		System.out.println("Enter the no of items for category C :");
		C = sc.nextInt();
		System.out.println("Enter the no of items for category D :");
		D = sc.nextInt();
		System.out.println("Enter the no of items for category E :");
		E = sc.nextInt();
		
		double costa= (A*300)-((A*300)*10/100);
		double costb= (B*150)-((B*150)*5/100);
		double costc= (C*200)-((C*200)*6/100);
		double costd= (D*175)-((D*175)*3/100);
		double coste= (E*180)-((E*180)*1/100);
		
		System.out.println("A"+"\t"+A+"\t"+"300"+"\t"+costa);
		System.out.println("B"+"\t"+B+"\t"+"150"+"\t"+costb);
		System.out.println("C"+"\t"+C+"\t"+"200"+"\t"+costc);
		System.out.println("D"+"\t"+D+"\t"+"175"+"\t"+costd);
		System.out.println("E"+"\t"+E+"\t"+"180"+"\t"+coste);
        sc.close();
		
	}
}

