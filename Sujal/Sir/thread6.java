	//No.6
//Example of implementation of Runnable Interface

class demo implements Runnable
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println("Thread is "+i);
		}
		System.out.println("End of thread ");
	}
}
class thread6
{
	public static void main(String args[])
	{
		demo d=new demo();
		Thread t=new Thread(d);

		t.start();
		System.out.println("End of main thread");
	}
}