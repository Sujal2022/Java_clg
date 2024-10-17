/*
	Finally Statement:
	    Java supports finally statement that can be used to handle an exception that is not caught by any of the 
	previously catch statement. Finally block can be used to handle any exception generated within a try block. 
	It may be added immediately after the try block or after the last catch block.

	When finally block is defined, this is guaranteed to execute, regardless of whether or not an exception is thrown.


	User Defined Exception :
	We can create our own exceptions. The keyword throw can be useful to throw user defined exception.

		throw new throwable_subclass;

		
*/



	class myexception extends Exception
	{
		myexception(String nm)
		{
			super(nm);
			System.out.println("Inside exception");
		}
	}

	class test8
	{
		public static void main(String args[])
		{
			int a=5,b=10;

			try
			{
				float c=a/b;

				if(c<1)
				{
				System.out.println("Inside try block");
  throw new myexception("result is smaller than value ");//Exception msg
				}
			}
			catch(myexception e)
			{
		//		System.out.println("Caught exception ");
    		System.out.println(e);//To execute exception message
			}
			finally
			{
				System.out.println("Error solution ");
			}
		}
	}	 