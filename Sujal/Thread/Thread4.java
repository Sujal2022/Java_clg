class demo implements Runnable
{
    public void run()
    {
        for(int i=1;i<=3;i++)
        {
            System.out.println("Thread is "+i);
        }
        System.out.println("ENd of Thread");
    }
}

class Thread4
{
    public static void main(String args[])
    {
        demo d = new demo();
        Thread t = new Thread(d);

        t.start();
    }
}