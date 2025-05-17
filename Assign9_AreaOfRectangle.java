package assign_practise;

import java.util.Scanner;

public class Assign9_AreaOfRectangle 
{
public static void main(String[] args) 
{
	
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the base value");
	int base=s1.nextInt();

	Scanner s2=new Scanner(System.in);
	System.out.println("Enter the width value");
	int width=s2.nextInt();


	int Area= base * width;
	System.out.println("The Area of Rectangle "+ Area);
}
}
