// Multiple Inheritance Marksheet

class Student
{
    int a,b;

    void get(int x,int y)
    {
        a=x;
        b=y;
    }

    void show()
    {
        System.out.println("Roll No = " + a);
        System.out.println("Age = " + b);
    }
}

interface sports
{
    final int m4=70;
    public void disp();
}

class Marks extends Student implements sports
{
    int m1,m2,m3;
    void getdata(int x,int y,int z)
    {
        m1=x;
        m2=y;
        m3=z;
    }
    void showdata()
    {
        System.out.println("Java = "+m1);
        System.out.println("PHP = "+m2);
        System.out.println("DCN = "+m3);
    }
    public void disp()
    {
        System.out.println("Sports = "+m4);
    }
    void res()
    {
        int tot = m1+m2+m3+m4;
        double avg=tot/4;

        System.out.println("Total = "+tot);
        System.out.println("Average = "+avg);
    }
}
class multiple 
{
    public static void main(String args[]) 
    {
        Marks m=new Marks();
        
        m.get(1,20);
        m.show();
        m.getdata(89, 78, 99);
        m.showdata();
        m.disp();
        m.res();
    }    
}
