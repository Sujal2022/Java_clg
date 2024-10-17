class first extends Thread
{
    public void run()
    {
        for(int i=1;i<=3;i++)
        {
            System.out.println("First Thread "+i);
        }
        System.out.println("Exit from first Thread ");
    }
}

class second extends Thread
{
    public void run()
    {
        for(int j=1;j<=3;j++)
        {
            System.out.println("second Thread "+j);
        }
        System.out.println("Exit from second Thread ");
    }
}

class third extends Thread
{
    public void run()
    {
        for(int k=1;k<=3;k++)
        {
            System.out.println("third Thread "+k);
        }
        System.out.println("Exit from third Thread ");
    }
}

class Thread2
{
    public static void main(String args[])
    {
        first f = new first();
        f.start();
        second s = new second();
        s.start();
        third t = new third();
        t.start();   
    }
}