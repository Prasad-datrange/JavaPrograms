package assign_practise;

import java.util.Scanner;

public class Assign7_AreaOfTriangle {

	public static void main(String[] args) 
	{
		
		// find area of triangle using Scanner Class
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the base of triangle");
		double base=s1.nextDouble();
		
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter the height of triangle");
		double height=s2.nextDouble();
		
		
		double area=0.5* base * height;
		System.out.println("Area of triangle is "+ area);
	}

}
