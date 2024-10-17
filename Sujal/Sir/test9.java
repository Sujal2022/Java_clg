class test9
{
		static void show()
		{
			try
			{
				System.out.println("Inside try block");
				throw new ArithmeticException();
				
			}
			finally
			{
				System.out.println("Handling try block");
			}
		}
		
		public static void main(String args[])
		{
			
			try
			{
				show();			
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Exception is "+ae);
			}
			finally
			{
				System.out.println("Error solution ");
			}
		
		}	
		
} 