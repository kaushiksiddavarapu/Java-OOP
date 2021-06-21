/*
Write a program to print the text in reverse order by interchanging
the position of the words
Test case input:
Enter the Text :
I live in India. I am studying in college. The college is located in
Coimbatore.
Output:
India in live I. college in studying am I. Coimbatore in located is
college The.
*/

import java.util.Scanner;
public class p1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter input String :");
		String inputst = sc.nextLine();
		String outputst = ""; 
        String[] parts = inputst.split("\\.");
        
			for (int i = 0; i < parts.length; i++)
			{
			    String[] words = parts[i].split("\\s");
			   
			    	for (int j = words.length-1; j >= 0; j--)
		        {
		        	outputst = outputst + words[j]+" " ;
		        }
		        outputst = outputst + ".";
			}
		
		System.out.println("Input String : "+inputst);
		
		System.out.println("Output String : "+outputst);
		
		sc.close();
	}
}

