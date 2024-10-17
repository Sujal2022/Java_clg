class test4
{	public static void main(String args[])
	{	int a,b;
		try
		{
			b=Integer.parseInt(args[0]);
			a=10/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero ");//Printing exception
		//	a=0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter new value for b through command line argument");
		}
		//System.out.println("a = "+a);
	}
}

/*
	If we don't pass any value through command line argument then ArrayIndexOutOfBoundsException occurs and it is caught in that(second) catch block. 
	
	If we pass 0 as command line argument then Divide by zero exception occurs and it is caught in that(first) catch block.

	If we pass non-zero value as command line argument then no exception occurs and it generate the appropriate result for the program. 

*/
