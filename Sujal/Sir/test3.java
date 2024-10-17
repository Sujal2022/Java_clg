class test3
{	public static void main(String args[])
	{
		int a,b,c;
		a=10;
		c=0;
		try
		{
			b=a/c;
			System.out.println("Value of b = "+b);
		}
		catch(ArithmeticException e)
		{
System.out.println("We are trying to divide the number by Zero "+e);//Printing exception
		//c=1;//Allow the program to execute remaining code
		}
		//b=a/c;
		//System.out.println("b = "+b);
	}
}