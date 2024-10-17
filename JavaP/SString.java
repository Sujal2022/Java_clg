class SString 
{
    public static void main(String args[])
    {
    String s1="RK University";
    System.out.println(s1);
    String s2=new String(s1);
    System.out.println(s2);
    
    char ch[]={'H','e','l','l','o'};

    String s3=new String(ch);
    System.out.println(s3);

    byte b[]={65,66,67};

    String s4=new String(b);
    System.out.println(s4);

    String s5="         RK University";
    System.out.println(s5.trim());

    String s6="RK University";
    System.out.println(s6.replace('U','D'));

    String s7="RK UNIVERSITY";
    System.out.println(s7.toLowerCase());

    String s8="rk university";
    System.out.println(s8.toUpperCase());

    int a=s8.length();
    System.out.println(a);
    }
}
