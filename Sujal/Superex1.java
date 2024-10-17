class First
{
    int a=10;
    
}
class Second extends First
{
    void showdata()
    {
        System.out.println("Value A is "+super.a);
    }
}
class Superex1
{
    public static void main(String args[])
    {
        Second s = new Second();
        
       
        s.showdata();
    }

}