class Cmdline1
{
	public static void main(String args[])
	{
		int a;
		double b,c;

		a=Integer.parseInt(args[0]);
		b=Double.parseDouble(args[1]);

		c=a+b;
		System.out.println("Sum is "+c);
	}
}