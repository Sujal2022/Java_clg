// valueOf() Method using String class

class string_test2
{
	public static void main(String args[])
	{
		int a=12345;
		double b=23456.78;
		
		String s1=String.valueOf(a);
		System.out.println("The length of a is "+s1.length());

		String s2=String.valueOf(b);
		System.out.println("The length of b is "+s2.length());

//System.out.println("the length of b is "+String.valueOf(b).length());
	}
}	