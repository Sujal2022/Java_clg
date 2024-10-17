class First
{
    double sub1;

    void get(double s1)
    {
        sub1=s1;
    }
    void show()
    {
        System.out.println("Sub 1 Value is "+sub1);
    }
}

class Second extends First
{
    double sub2;

    void getdata(double s2)
    {
        sub2=s2;
    }
    void disp()
    {
        System.out.println("Sub 2 Value is "+sub2);
    }
}

class Third extends Second
{
    

    double sub3;

    void getdata1(double s3)
    {
        sub3=s3;
    }
    void disp1()
    {
        System.out.println("Sub 3 Value is "+sub3);
    }
    
}
class Fourth extends Third
{
    void total()
    {
        double totalans = sub1+sub2+sub3;
        double aver = totalans/3;
        System.out.println("Total is "+totalans);
        System.out.println("Average is "+aver);

    }

}

class Multilevelex
{
    public static void main(String args[])
    {
        Fourth t = new Fourth();
        t.get(45);
        t.show();
        t.getdata(29);
        t.disp();
        t.getdata1(30);
        t.disp1();
        t.total();
       
    }
}