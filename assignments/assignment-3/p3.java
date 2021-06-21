/*
A customer has certain amount of money for buying furniture. He
is willing to allow the system to suggest the furniture based on the
amount of money.
[Note that the cost of furniture should be less than or equal to the
amount of money customer has]
Test cases:
Enter the customer Name : R.Ramesh
Enter the Amount : Rs.10000
Enter the furniture the user wants : F101,F108
Output:
F101 - Quantity - 3 - Rs.4500
F108 - Quantity - 2 - Rs.5000
*/


import java.util.*;  
public class p3
{
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in); 
	System.out.println("Enter the customer Name : ");
	sc.next();
	System.out.println("Enter the Amount  : ");
	int num= sc.nextInt();
	System.out.println("Enter model no. : ");
	String model = sc.next(); 
	String[] parts = model.split(",");
	int ans;
	int n= parts.length;
	for (int i = 0; i < parts.length; i++)
	{
	    if(parts[i].equals("f101"))
	    {
	        ans = ((int)((int)(num/n))/1500);
	        System.out.println("f101 - "+"Quantity - "+ans+" - "+ ans*1500);
	    }
	      else if(parts[i].equals("f106"))
	    {
	        ans = ((int)((int)(num/n))/2400);
	        System.out.println("f106 - "+"Quantity - "+ans+" - "+ ans* 2400);
	    }
	      else if(parts[i].equals("f108"))
	    {
	        ans = ((int)((int)(num/n))/2500);
	        System.out.println("f108 - "+"Quantity - "+ans+" - "+ ans* 2500);
	    }
	      else if(parts[i].equals("f110"))
	    {
	        ans = ((int)((int)(num/n))/3000);
	        System.out.println("f110 - "+"Quantity - "+ans+" - "+ ans* 3000);
	    }
	      else if(parts[i].equals("f122"))
	    {
	        ans = ((int)((int)(num/n))/3200);
	        System.out.println("f122 - "+"Quantity - "+ans+" - "+ ans* 3200);
	    }
	     else
	    {
	        ans = ((int)((int)(num/n))/2350);
	        System.out.println("f234 - "+"Quantity - "+ans+" - "+ ans* 2350);
	    }
	}
    sc.close();
}
}
