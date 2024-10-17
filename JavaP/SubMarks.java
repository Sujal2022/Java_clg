import p1.*;
import p1.p2.*; 

class Result extends SMarks
{
    void res()
    {
        int tot=m1+m2+m3;
        System.out.println("Total = " + tot);
        double avg=tot/3;
        System.out.println("Average = " + avg);
    }
}


class SubMarks 
{
    public static void main(String args[])
    {
        p1.p2.Name r=new Name();
        r.get("Nevil",20,1);
        r.disp();
        Result t=new Result();
        t.getData(99,78,98);
        t.show();
        t.res();
    }
}
