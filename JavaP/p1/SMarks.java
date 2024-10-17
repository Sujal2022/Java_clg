package p1;

public class SMarks 
{
    public int m1,m2,m3;
    public void getData(int x,int y,int z)
    {
        m1=x;
        m2=y;
        m3=z;
    }

    public void show()
    {
        System.out.println("C = " + m1);
        System.out.println("Java = " + m2);
        System.out.println("PHP = " + m3);
    }
}