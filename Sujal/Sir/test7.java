  /*
	When a method is generate  an exception then that exception is thrown by throws keyword.

	Syntax:
		returntype methodname(args) throws exception
		{
			body of method;
		}

*/
class test7
 {
	static void show() throws IllegalAccessException
	{
		System.out.println(" Inside function");
		throw new IllegalAccessException("Hello");
	}
	public static void main(String args[])
	{
		try
		{
			System.out.println(" Inside try block");
			show();
		}
		catch(Exception e)
		{	
	   //System.out.println("Exception is caught ");//Without Excepiton name
 	     System.out.println("Exception is caught "+e);
		}
	}
}