
class myex extends Exception
{
	myex(String nm)
	{
		super(nm);
		System.out.println("Inside exception");

	}
}

class test10
{
	public static void main(String args[])
	{
	
		try
		{
			int marks=Integer.parseInt(args[0]);
			if(marks>100)
				throw new myex("Marks Out of Bounds Exception ");
			else
				System.out.println("Marks is "+marks);
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}