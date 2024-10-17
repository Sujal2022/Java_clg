// abstract class First
// {
//     abstract void show();
// }
// class Second extends First
// {
//     void show()
//     {
//         System.out.println("Base Class");
//         System.out.println("Derived Class");

//     }
// }
// class Abstractex
// {
//     public static void main(String args[])
//     {
//         Second s = new Second();
//         s.show();
//     }
// }

// Second Example of Abstract 

abstract class First
{
    abstract void show();
    void disp()
    {
        System.out.println("Base Class");
        
    }
}
class Second extends First
{
    void show()
    {
        System.out.println("Base Class");
        System.out.println("Derived Class");

    }
}
class Abstractex
{
    public static void main(String args[])
    {
        Second s = new Second();
        s.disp();
        s.show();
    }
}