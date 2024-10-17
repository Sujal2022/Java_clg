class Test
{
	static int s;
	
	static void show()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			s=s+i;
		}
		System.out.println(s);
	}
}

class StaticEx
{
	public static void main(String args[])
	{
	Test.show();
	}
}