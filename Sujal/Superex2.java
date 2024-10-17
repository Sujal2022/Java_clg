class First
{
    int a=10;

    void show()
    {
        System.out.println("Value A is "+a);
    }
}
class Second extends First
{
    int b=20;
   
    void showdata()
    {
        super.show();
        System.out.println("Value B is "+b);
    }
}
class Superex2
{
    public static void main(String args[])
    {
        Second s = new Second();
        
        s.showdata();
    }

}