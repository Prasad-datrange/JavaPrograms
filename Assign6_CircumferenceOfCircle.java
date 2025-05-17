package assign_practise;

import java.util.Scanner;

public class Assign6_CircumferenceOfCircle 
{

	public static void main(String[] args) 
	{
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		int radius=s1.nextInt();
		int pi=3;

		double circumferance =2*pi*radius;
		
		System.out.println("Circumferance of Circle is - " +circumferance);
		
		
	}

}
