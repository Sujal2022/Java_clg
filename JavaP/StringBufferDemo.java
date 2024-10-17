class StringBufferDemo
{
	public static void main(String args[])
	{
		StringBuffer s1=new StringBuffer("Naitik");
		StringBuffer s2=new StringBuffer(100);
		StringBuffer s3=new StringBuffer();

		System.out.println("String buffer capacity is "+s1.capacity());
		System.out.println("String length is "+s1.length());
	System.out.println("String length is "+s1.charAt(2));
	s1.setCharAt(2,'a');

	System.out.println("String length is "+s1.toString());

	s3.append("I am fine");
System.out.println("String  is "+s3);

	s3.insert(1,'d');
System.out.println("String  is "+s3);
	s3.delete(4,'m');
System.out.println("String  is "+s3);
	s3.reverse();
System.out.println("String  is "+s3);
	s2.append("Manish Vankani");
System.out.println("String  is "+s2);
	s2.setLength(10);
System.out.println("String  is "+s2);
             }
}