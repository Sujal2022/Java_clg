//(To generate user defined error msg by) handling exception through try & catch block
class test2
{
	public static void main(String args[])
	{
		int a[]={2,5,9};

		try
		{
			System.out.println("Trying to access 6th element ");
		System.out.println("a[5] = "+a[5]);//Array index out of bounds
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println("Index of Array is out of range ");
		}
	}
}