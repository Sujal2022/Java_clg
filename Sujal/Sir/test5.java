class test5
{
	public static void main(String args[])
	{
		int a=0,b;
		try
		{
			b=10/a;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero ");
		}
catch(Exception e)
		{
			System.out.println("Exception is "+e);//Printing exception
			b=0;
		}
	}
}

/*
	We should be careful in using multiple catch statements. When an exception is caught, the other catch blocks are skipped. So when you catch an exception super class, then all its subclasses should be already caught. So super class exception must not be caught before any subclass otherwise error msg is generated.

	To remove this error, simply catch the ArithmeticException before the exception.
*/
