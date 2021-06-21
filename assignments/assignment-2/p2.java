//Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.

class Main 
{ 
    
    Main(int x) 
    { 
       
        this(0.5, 2); 
        System.out.println(x); 
    } 
  
   
    Main(double x, double y) 
    { 
        System.out.println(x * y); 
    } 
  
    public static void main(String args[]) 
    { 
        new Main(8); 
    } 
}
