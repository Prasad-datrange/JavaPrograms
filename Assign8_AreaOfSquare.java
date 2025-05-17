package assign_practise;

import java.util.Scanner;

public class Assign8_AreaOfSquare 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of side");
		int side= s1.nextInt();
		
	
	
		int Area= side * side;
		System.out.println("Area of square "+ Area);

	}

}
