class First
{
	int a,b,c;
	
	void sum(int x,int y)
	{
		a=x;
		b=y;
		int t = a+b;
		System.out.println("Sum is "+t);
	}
	void sum(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
		int t = a+b+c;
		System.out.println("Sum is "+t);
	}
	void sum()
	{
		a=25;
		b=63;
		
		if(a>b)
		{
			System.out.println(a+" is Max Number");
		}
		else
		{
			System.out.println(b+" is Max Number");
		}
	}
	
}

class OverloadEx
{
	public static void main(String args[])
	{
		First f = new First();
		
		f.sum(5,3);
		f.sum(5,3,2);
		f.sum();
	}
}