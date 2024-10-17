class Cmdline2
{
	public static void main(String args[])
	{
		int p,r;
		double t,ans,avg;

		p=Integer.parseInt(args[0]);
		r=Integer.parseInt(args[1]);
		t=Double.parseDouble(args[2]);
		

		ans=p*r*t;
		avg=ans/100;
		System.out.println("Sum is "+avg);
	}
}