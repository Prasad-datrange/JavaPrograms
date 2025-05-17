package assign_practise;

public class Assign4_Nonstatic_Method_Overloading 
{

public void subtraction(int a, int b)
{
	int h=90;
	int g=39;
	int p=h-g;
	
	System.out.println("substraction of 2 number is "+ p);
	
}
public void subtraction(int v, int c, String b)
{
	int t=100;
	int u=2;
	int o=t*u;
	
	System.out.println("multiplication  of 2 number is "+ o);
}

public void subtraction(double w, int n)
{
	int b=100;
	int m=2;
	int y=b/m;
	
	System.out.println("division is "+ y);
}

	public static void main(String[] args)
	{
		Assign4_Nonstatic_Method_Overloading s1=new Assign4_Nonstatic_Method_Overloading (); // this is Non static overloading program
		s1.subtraction(90, 89);                                              // Method overloading means same method name with different arguments
		s1.subtraction(2, 75, "Overload");
		s1.subtraction(90.0, 6);
	
	}

}
