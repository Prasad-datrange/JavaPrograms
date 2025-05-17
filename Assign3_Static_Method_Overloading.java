package assign_practise;

public class Assign3_Static_Method_Overloading 
{
	public static void addition()
	{
		int a= 9;
		int b= 3;
		int sum= a+b;
		
		System.out.println("addition of 2 number is "+ sum);
	}
	
	public static void addition( int x, int y)
	{
	int p= 10;
	int q= 100;
	int sum= p+q;
	
	System.out.println("addition of 2 number is "+ sum);
	
	}
	
	public static void addition( String s , char v)
	{
	int j= 90;
	int k= 1;
	int sum= j+k;
	
	System.out.println("addition of 2 number is "+ sum);
	
	}

	public static void addition( double e, String f, char g, boolean h)
	{
	int l= 14;
	int m= 11;
	int n= 5;
	int o= l+m+n;
	
	
	System.out.println("addition of 3 number is "+ o);
	
	}

	
	public static void main(String[] args)     //this is static method overloading. Method overloading means same method name but different parameters
	{
		addition();
		addition( 10, 20);
		addition( "Shubha" , 'S');
		addition( 98.9, "Over weighted", 'F', true);
		
	}

}
