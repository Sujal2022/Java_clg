// Multiple Inheritance Salary

class Employee
{
    int a,b;
    String c;

    void get(String z,int x,int y)
    {
        c=z;
        a=x;
        b=y;
    }

    void show()
    {
        System.out.println("Name = "+c);
        System.out.println("Employee No = " + a);
        System.out.println("Age = " + b);
    }
}

interface bonus
{
    final int bon=5000;
    public void disp();
}

class Ssalary extends Employee implements bonus
{
    int hr,pf,ta,bs;

    void getdata(int w,int x,int y,int z)
    {
        bs=w;
        hr=x;
        ta=y;
        pf=z;
    }
    void showdata()
    {
        System.out.println("Gross Salary = "+bs);
        System.out.println("HR = "+hr);
        System.out.println("TA = "+ta);
        System.out.println("PF = "+pf);
    }
    public void disp()
    {
        System.out.println("Bonus = "+bon);
    }
    void res()
    {
        int ns = bs+hr+ta-pf;
    
        System.out.println("Net Salary = "+ns);

        int gs=ns+bon;
        System.out.println("Gross Salary = "+gs);
    }
}
class salary
{
    public static void main(String args[]) 
    {
        Ssalary m=new Ssalary();
        
        m.get("Nevil",1,20);
        m.show();
        m.getdata(15000,5000, 4000, 6000);
        m.showdata();
        m.disp();
        m.res();
    }    
}

