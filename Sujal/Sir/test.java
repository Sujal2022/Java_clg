class test
{
	public static void main(String args[])
	{
		int r=0,a=10,b;
		try
		{	
			b=Integer.parseInt(args[0]);
			r=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero ");//Printing exception
			a=0;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter new value for b through command line argument");
		}
		catch(NumberFormatException e)
		{
			System.out.println("wrong conversion of string to float value");
		}
		System.out.println("r = "+r);
	}
}