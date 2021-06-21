/*Create a class with a static String field that is initialized at the point of definition, and another one that is initialized by the static block.
Add a static method that prints both fields and demonstrates that they are both initialized before they are used.
*/

class sta
{  
   public static String str="String initialised as static";
   public static String str1;
   
   static void show()
   {
       str1="Initialised string in static method";
       System.out.println(str);
       System.out.println(str1);
   }
}
public class p3
{
public static void main(String[] args)
{
p3 obj1= new p3();
obj1.show();
}

private void show() {
}
}
