package assign_practise;

import java.util.Scanner;

public class Assign10_AreaOfTrapezium {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a=s1.nextInt();
		
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter the value of b");
		int b=s2.nextInt();
		
        Scanner s3=new Scanner(System.in);
        System.out.println("Enter the value of h");
        int h=s3.nextInt();
		
		
		double Area=0.5*(a+b)*h;
		System.out.println("Area of Trapezium "+ Area);
	}

}
