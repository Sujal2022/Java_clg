class First
{
    int rollno,age;
    

    void get(int r,int a)
    {
        rollno = r;
        age=a;
       
    }
    void show()
    {
        System.out.println("Your Rollno is: "+rollno);
        System.out.println("Your Age is: "+age);
    }
}
class Second extends First
{
    int m1,m2,m3;

    void getdata(int a,int b,int c)
    {
        m1=a;
        m2=b;
        m3=c;
    }
    void disp()
    {
        System.out.println("Your mark 1 is: "+m1);
        System.out.println("Your mark 2 is: "+m2);
        System.out.println("Your mark 3 is: "+m3);
    }
}
class Third extends Second
{
    void avg()
    {
        int add = m1+m2+m3;
        int ans = add/3;
        System.out.println("Your Average is: "+ans);
    }

}

class Marksheetex
{
    public static void main(String args[])
    {
        Third t = new Third();

        t.get(1,19);
        t.show();
        t.getdata(25,26,24);
        t.disp();
        t.avg();
    }
}

   


