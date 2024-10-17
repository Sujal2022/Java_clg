/*
	Till now, we caught the exception thrown by Java.However, We can throw an exception manually by throw keyword. The general syntax is :

	throw new exceptiontype();

		Here, the throw statement must be put in try block and caught in catch block.

*/

class test6
{
	public static void main(String args[])
	{
		System.out.println("Throwing Exception...");

		try
		{
			throw new ArithmeticException("Division by Zero is not allowed!!!");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception is "+ae);
		}
	}
		
}

// In above example we simply created and thrown ArithmeticException and in catch block, it is caught and displayed.
