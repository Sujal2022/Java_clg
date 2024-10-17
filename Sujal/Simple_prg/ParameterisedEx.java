class First
{
	int a,b;
	First(int x,int y)
	{
		a=x;
		b=y;
	}
	void show()
	{
		System.out.println("First Values is:"+a);
		System.out.println("Second Values is:"+b);
	}	
	int add()
	{
		int c = a+b;
		return c;
	}
}

class ParameterisedEx
{
	public static void main(String args[])
	{
		First f= new First(3,4);
		
		f.show();
		
		int ans = f.add();
		System.out.println("Sum is:"+ans);
	}
}