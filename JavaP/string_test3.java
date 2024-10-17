//  string comparision,searching and character extraction methods using String class

//import java.lang.String.*;

class string_test3
{
	public static void main(String args[])
	{
		String s1="Hello java programing language";
		String s2="hello java programing language";
		String s3="xyz";

		System.out.println("Starts with "+s1.startsWith("Hello"));
		if(s1.equals(s2))		
			System.out.println("Both are same ");
		else
			System.out.println("both are not same ");


		if(s1.equalsIgnoreCase(s2))		
			System.out.println("Both are same ");
		else
			System.out.println("both are not same ");
	
		
		System.out.println("Index of 'e' is "+s1.indexOf('e'));	
		System.out.println("Index of 'a' is "+s1.lastIndexOf('a'));	

		System.out.println("First character of string is "+s1.charAt(0));

		System.out.println("Last character of string is "+s1.charAt(s1.length()-1));		

		byte a[]=new byte[3];
		a="ABC".getBytes();

		System.out.print("Bytes Array ");
		for(int i=0;i<3;i++)
			System.out.print(a[i]+" ");	
	}
}	