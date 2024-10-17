class First
{
	int s;
	First()
	{
		s=0;
	}
	void show()
	{
		int i;
		for(i=1;i<=10;i++)
		{
			s=s+i;
		}
		System.out.println("Sum of 10 Values is:"+s);
	}	
}

class Def
{
	public static void main(String args[])
	{
		First f = new First();
		
		f.show();
	}
}