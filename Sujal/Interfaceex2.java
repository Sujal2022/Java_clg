class Employee
{
    int eid;
    String ename;
    void get(int eid,String ename)
    {
        this.eid=eid;
        this.ename=ename;
    }
    void show()
    {
        System.out.println("Employee id is "+eid);
        System.out.println("Employee name is "+ename);
    }
}

interface Bonus
{
    final int b1=10000;
    public void disp();
}

class Salary extends Employee implements Bonus
{
    int bs,hr,ta,pf;
    void getdata(int bs,int hr,int ta,int pf)
    {
        this.bs=bs;
        this.hr=hr;
        this.ta=ta;
        this.pf=pf;
    }
    void showdata()
    {
        System.out.println("Basic Salary is: "+bs);
        System.out.println("HR is: "+hr);
        System.out.println("TA is: "+ta);
        System.out.println("PF is: "+pf);
    }
    public void disp()
    {
        System.out.println("Bonus is: "+b1);
    }
    void res()
    {
        int nf = bs+hr+ta-pf;
        int gs = nf+b1;
        System.out.println("Net Salary is: "+nf);
        System.out.println("Gross Salary is: "+gs);
    }
}

class Interfaceex2
{
    public static void main(String args[])
    {
        Salary m = new Salary();
        m.get(1,"Sujal");
        m.show();
        m.getdata(70000,80000,90000,20000);
        m.showdata();
        m.disp();
        m.res();
    }
}