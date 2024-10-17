import p1.Marks;

interface sports
{
   final int m4 = 95;
   public void sp(); 
}
class MarksData extends Marks implements sports
{
    int m1,m2,m3;
    void getData(int x,int y,int z)
    {
        m1=x;
        m2=y;
        m3=z;
    }

    void show()
    {
        System.out.println("C = " + m1);
        System.out.println("Java = " + m2);
        System.out.println("PHP = " + m3);
    }

    public void sp()
    {
        System.out.println("Sports = " + m4);
    }

    void ta()
    {
        int tot=m1+m2+m3+m4;
        System.out.println("Total = " + tot);
        double avg=tot/4;
        System.out.println("Average = " + avg);
    }
}
class PackageResult
{
    public static void main(String args[])
    {
        MarksData m=new MarksData();
        
        m.get("Nevil",20,1);
        m.disp();
        m.getData(98,97,99);
        m.show();
        m.sp();
        m.ta();
    }     
}
