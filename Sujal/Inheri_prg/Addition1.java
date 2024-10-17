class First
{
    int a,b;

    void get(int x,int y)
    {
        a=x;
        b=y;
    }
    void show()
    {
        System.out.println("A = "+a+ "\nB = "+b);
    }
}

class Second extends First
{
    
    void swap()
    {
       
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After Swap \nA="+a+ "\nB="+b);
    }
}

class Addition1
{
    public static void main(String args[])
    {
         Second s = new Second();

        s.get(3,4);
        s.show();
        s.swap();
      

    }
   
}