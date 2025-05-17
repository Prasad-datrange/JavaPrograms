package assign_practise;

public class Assign1_Static_Method 
{
	
	public static void subtraction()
	{
		int a=100;
		int b=90;
		int c=a-b;
		System.out.println("Amount to be return is " + c);
		}
	
		public static void add() 
		{
		int a=1050;
		int b=1;
		int c=a+b;
		System.out.println("Next Voucher of Rs " +c);
		}

		public static void multiplication()
		{
			int x=101;
			int y=1;
			int z=x*y;
			System.out.println("Genuine Brand %"+z );
		}
		
		public static void divide()
		{
			int d=10000;
			int e=10;
			int f=d/e;
			System.out.println("Money back gurantee "+f);
		}
		
			public static void per()
			
			{
				int p=100;
				int q=2;
				int r=q%p;
			System.out.println("Offer Valid for days "+ r);
		}
		
	public static void main(String[] args) 
	{
	        System.out.println("Ready");
		subtraction();
		add();
		multiplication();
		divide();
		per();
		//System.out.println("Ready");
}

}
