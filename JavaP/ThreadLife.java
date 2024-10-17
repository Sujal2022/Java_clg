class One extends Thread
{
    public void run()
    {
        for(int i=1;i<=3;i++)
        {
            if(i==1)
                yield();
            System.out.println("First Thread = "+i);
        }
        System.out.println("Exit from 1st Thread");
    }
}

class Two extends Thread
{
    public void run()
    {
        for(int j=1;j<=3;j++)
        {
            System.out.println("SecondThread = "+j);
            if(j==2)
                stop();
        }
        System.out.println("Exit from 2nd Thread");
    }
}

class Three extends Thread
{
    public void run()
    {
        for(int k=1;k<=3;k++)
        {
            System.out.println("Third Thread = "+k);
            if(k==1)
            {
                try
                {
                    sleep(2000);
                }
                catch(Exception e)
                {
                }
            }
        }
        System.out.println("Exit from 3rd Thread");
    }
}

class ThreadLife 
{
    public static void main(String args[]) 
    {
        One o=new One();
        o.start();
        Two t=new Two();
        t.start();
        Three n=new Three();
        n.start();
    }    
}
