class Swap
{	
	public static void main(String args[])
	{
		int a=54,b=45,temp;

		System.out.println("Before swap a:"+a);
		System.out.println("Before swap b:"+b);

		temp = a;
		a = b;
		b = temp;

		System.out.println(" ");
		System.out.println(" After swap a:"+a);
		System.out.println(" After swap b:"+b);
	}
}