import p1.First;
import p1.p2.*;

class Add extends First
{
   
 void res()
    {
        p1.p2.Second s=new p1.p2.Second();
        s.gets(8);
        s.disp();
        int c = a+s.b;
        System.out.println("Add = "+ c);
    }
}
class SubAdd 
{
    public static void main(String args[])
     {
      Add t=new Add();
      t.get(5); 
      t.show();
      t.res();
    }
}