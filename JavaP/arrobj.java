class Res
{
    int a;
    Res(int x)
    {
        a=x;
    }

    void show()
    {
        System.out.println(" " + a);
    }
}


class arrobj
{
    public static void main(String args[])
    {
        Res r[]=new Res[2];

        r[0]=new Res(2);
        r[1]=new Res(3);

        for(int i=0;i<2;i++)
        {
            r[i].show();
        }
    }
}