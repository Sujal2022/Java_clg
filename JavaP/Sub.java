import p1.p2.two;

class Add extends two
{
   
    void res()
    {
        int c = a+b;
        System.out.println("Add = "+ c);
    }
}
class Sub {
    public static void main(String args[])
     {
      Add a=new Add();
      a.get(5);
      a.show();
      a.gets(8);
      a.disp();
      a.res();
    }
}