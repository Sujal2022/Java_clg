class arrobj
{
		int a;

		arrobj(int x)
		{
			a=x;
		}
		void show()
		{
			System.out.println(" "+a);
			
		}
		
}
class Array1
{
	public static void main(String args[])
	{
		
		arrobj t[]=new arrobj[2];
		int i;
	
		t[0]=new arrobj(2);
		t[1]=new arrobj(5);		

		for(i=0;i<2;i++)
		{
			t[i].show();
		}
			
		
		
	}
}