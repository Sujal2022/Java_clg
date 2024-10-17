class wrapper
{
	public static void main(String args[])
	{
		Integer t = new Integer(243);
		
		System.out.println("Object t "+t);
		
		System.out.println("Float value of integer t "+t.byteValue());

		Integer t2 = Integer.parseInt("345");

		System.out.println("Integer Value of String  = "+t2);

		Double d1 = new Double(12345.67);
		System.out.println("Object d1 "+d1);
		System.out.println("byte value of Object d1 "+d1.byteValue());
		System.out.println("int value of double Object d1 "+d1.intValue());
		System.out.println("FLoat value of Object d1 "+d1.floatValue());

		Double d2 = Double.parseDouble("345.67");
		System.out.println("Double value from the String = "+d2);

 	}
}