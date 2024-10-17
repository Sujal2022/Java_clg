class Thread1 
{
    public static void main(String args[])
     {
        Thread t=Thread.currentThread();

        System.out.println("The Current Thread is = "+t);
        System.out.println("Name of the Thread = "+t.getName());

        t.setName("My Thread");
        System.out.println("Now the name of the Thread = "+t.getName());
    }
}
