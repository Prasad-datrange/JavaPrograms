package assign_practise;

public class Assign2_NonStatic_Method 
{
	public void add()   //this is non-static method
	{
		int a=5;
		int b=2;
		int c=a+b;
		System.out.println("addition is "+ c);
	}
	
	public void subtraction()  //this is non-static method
	{
		int a=9;
		int b=6;
		int c=a-b;
		System.out.println("Amount will be return "+c );
	}
	
	public void multiplication(String don)    //this is non-static  parameterized method
	{
		int e=5;
		int f=3;
		int g=e*f;
		System.out.println("multiplication "+g);
	}
	
	public void division (double f)  //this is non-static  parameterized method 
	{
		double x=25;
		double y=3;
		double z=x/y;
		System.out.println("division is "+ z);
	}
	
	
	public static void main(String[] args) 
	{
		
        System.out.println("Hello");
        Assign2_NonStatic_Method a=new Assign2_NonStatic_Method();  //creating object with new keyword for accessing non-static method
        
        a.add();
        a.subtraction();
        a.multiplication("Rexona");    // passing parameter as Rexona bcoz this is parameterized method
        a.division (10.0);              // passing parameter as 10.0 bcoz this is parameterized method
       
        
        
        
        
        
        
        
        
        
        
     
	}

}
