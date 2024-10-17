	//No.1
//Example of several methods of Thread class

class thread1
{
	public static void main(String args[])
	{
		Thread t=Thread.currentThread();

System.out.println("The current thread is "+t);
System.out.println("Name of the thread is "+t.getName());		

    	t.setName("My Thread");
    System.out.println("Now the name of the thread is "+t.getName());
	}
}