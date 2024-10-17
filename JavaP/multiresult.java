// Multilevel Inheritance Marksheet

class First
{
    int b;
    String a;
    
    void roll(String r,int g)
    {
        a=r;
        b=g;
    }

    void show()
    {
        System.out.println("Name = " + a);
        System.out.println("Age = " + b);
    }
}

class Second extends First
{
    int m1,m2,m3;

    void gets(int o,int f,int h)
    {
        m1=o;
        m2=f;
        m3=h;
    }

    void disp()
    {
        System.out.println("Science = " + m1);
        System.out.println("Maths = " + m2);
        System.out.println("SS = " + m3);
    }
}

class Third extends Second
{
    void sum()
    {
        int tot=m1+m2+m3;
        double average=tot/3;
        System.out.println("Total = " + tot);
        System.out.println("Average = " + average);
    }
}


class multiresult
{
    public static void main(String args[]) 
    {
    Third t=new Third();
     
     t.roll("Nevil",24);
     t.show();
     t.gets(81,98,77);
     t.disp();
     t.sum();
    } 
    
}

