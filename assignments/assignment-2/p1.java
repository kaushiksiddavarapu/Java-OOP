/*Create a class containing an int and a char that are not initialized,
and print their values to verify that Java performs default initialization
*/

class number
{
      int num;
      char name;
     public void display()
    {
        System.out.println("Number is: "+num);
        System.out.println("Name is: "+name);
    }
}

public class p1
{
	public static void main(String[] args)
	{
	p1 obj= new p1();
	obj.display();
	}

    private void display() {
    }
}
