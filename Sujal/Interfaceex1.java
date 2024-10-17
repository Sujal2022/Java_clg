class Student
{
    int rno,age;
    void get(int rno,int age)
    {
        this.rno=rno;
        this.age=age;
    }
    void show()
    {
        System.out.println("Rollno is "+rno);
        System.out.println("Age is "+age);
    }
}

interface Sports
{
    final int m4=10;
    public void disp();
}

class Marks extends Student implements Sports
{
    int m1,m2,m3;
    void getdata(int m1,int m2,int m3)
    {
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    void showdata()
    {
        System.out.println("Marks of Java: "+m1);
        System.out.println("Marks of PHP: "+m2);
        System.out.println("Marks of C: "+m3);
    }
    public void disp()
    {
        System.out.println("Marks of Sport: "+m4);
    }
    void res()
    {
        int total = m1+m2+m3+m4;
        double avg = total/4;
        System.out.println("Total Marks is: "+total);
        System.out.println("Average is: "+avg);
    }
}

class Interfaceex1
{
    public static void main(String args[])
    {
        Marks m = new Marks();
        m.get(1,20);
        m.show();
        m.getdata(70,80,90);
        m.showdata();
        m.disp();
        m.res();
    }
}