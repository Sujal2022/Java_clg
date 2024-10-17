class one extends Thread
{
    public void run()
    {
        for(int i=1;i<=3;i++)
        {
            if(i==1)
                yield();
            System.out.println("Thread one "+i);    
        }
        System.out.println("Exit from thread one");
    }
}

class two extends Thread
{
    public void run()
    {
        for(int j=1;j<=3;j++)
        {
            System.out.println("Thread two "+j);
            if(j==2)
                stop();
        }
         System.out.println("Exit from thread two");
    }
}

class three extends Thread
{
    public void run()
    {
        for(int k=1;k<3;k++)
        {
            System.out.println("Thread three "+k);
            if(k==1)
            {
                try
                {
                    sleep(2500);
                }
                catch(Exception e)
                {
                }
            }
        }
    }
}

class Thread3
{
    public static void main(String args[])
    {
        one t1 = new one();
        two t2 = new two();
        three t3 = new three();
        System.out.println("Start Thread One ");
        t1.start();
        System.out.println("Start Thread Two ");
        t2.start();
        System.out.println("Start Thread Three ");
        t3.start();
        System.out.println("Main Mathod End");
    }
}