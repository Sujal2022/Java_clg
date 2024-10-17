class Print
{
	int a,b;
	
	Print(int x,int y)
	{
	a=x;
	b=y;
	System.out.println("First Values is:"+a);
	System.out.println("Second Values is:"+b);
	}
}

class par
{
	Print hello = new Print();	
	
	hello.Print(2,3);
}