class wrapper_test
{
public static void main(String args[])
{
Integer t=new Integer(243);
System.out.println("Object t "+t);
System.out.println("float value of integer object t="+t.floatValue());
System.out.println("byte value of integer object t="+t.byteValue());

Integer t2=Integer.parseInt("345");
System.out.println("integer value from the string = "+t2);

// Double d1=new Double(12345.67);
// System.out.println("Object d1 "+d1);
// System.out.println("byte value of double object d1 ="+d1.byteValue());
// System.out.println("int value of double object d1 ="+d1.intValue());
// System.out.println("float value of double object d1 ="+d1.floatValue());
// double d2=Double.parseDouble("345.67");
// System.out.println("double value from the string = "+d2);
}
}