/*	String class
           Just like C and C++, String in Java is also a sequence of characters. 
It is also an object of class String. Both String and StringBuffer classes in 
java are defined in the default package java.lang. The String class creates a 
fixed-length string object. When you create a String object, the contents of 
that string object can not be chaged. So when you want to perform some 
operations on a particular object of a String, you have to create another string
object that receives this changed string. Thus the origial string object remains 
unchanged. But if you want a string's contents to be changed, then you can 
create a StringBuffer object. The StringBuffer class creates a flexible length
string object. You can insert or delete characters from the StringBuffer object.
*/


//General String Methods and String Modifying Methods 
class string_test1
{
	public static void main(String args[])
	{
		String s1=new String();
		String s2="computer center";
		String s3=new String(s2);

		System.out.println("String1 is "+s1);
		System.out.println("String2 is "+s2);
		System.out.println("String2 is "+s3);

		char ch[]={'H','e','l','l','o',' ','w','o','r','l','d'};
		String s4=new String(ch);
		System.out.println("String2 is "+s4);

		String s5=new String(ch,6,4);
		System.out.println("String2 is "+s5);


		byte b[]={65,66,67,68,69,70};

		
		String s6=new String(b);
		String s7=new String(b,3,3);

		System.out.println("String5 is "+s6);
		System.out.println("String6 is "+s7);		
		
		String s8="Computer";
		int a=s8.length();
		System.out.println("Length of the string is "+a);

		String s9=s8.concat("Center");
		System.out.println("New String is "+s9);
		
		String s10=s8+" College";
		System.out.println("New String is "+s10);
	
		String s11="Computer Center";
		System.out.println("String in uppercase is "+s11.toUpperCase());
	
		System.out.println("String in lowercase is "+s11.toLowerCase());


		String s12="          RK University";
		System.out.println("Trimmed String is "+s12.trim());		

		String s13="RK University";
		System.out.println("New String is "+s13.replace('i','z'));	

		String s14="RK University";
		System.out.println("Sub String is "+s14.substring(4));

		System.out.println("Sub String is "+s14.substring(4,10));
	
	}
}		