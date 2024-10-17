// Super Variable & Method

class First
{
    int a = 10;

    void show()
    {
        System.out.println("First Value = " + a);
    }
}

class Second extends First
{

    void disp()
    {
        super.show();
        System.out.println("Second Value = " + super.a);
    }

}

class super2
{
    public static void main(String args[]) 
    {
     Second t=new Second();
     
     t.disp();
     
    }    
}

