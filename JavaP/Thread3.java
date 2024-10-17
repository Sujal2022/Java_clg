class Demo implements Runnable
{
    public void run()
    {
        for(int i=1;i<=3;i++)
        {
            System.out.println("First Thread = "+i);
        }
        System.out.println("Exit from Thread");
    }
}

class Thread3 
{
    public static void main(String args[])
    {
        Demo o=new Demo();
        Thread t=new Thread(o);
    
        t.start();
        System.out.println("End of Main Thread");
    }
}
