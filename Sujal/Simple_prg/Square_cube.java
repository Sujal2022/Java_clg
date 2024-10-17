class Square_cube
{
	public static  void main(String args[])
	{
		int n1=22;
		int n2=25;

		if(n1>n2)
		{
			System.out.println(n1+" is Maximum Number and");
			System.out.println(n1+" Number Sqaure is:");
			int sq = n1*n1;
			System.out.println("Sqaure is:"+sq);
		}
		else if(n2>n1)
		{
			System.out.println(n2+" is Maximum Number and");
			System.out.println(n2+" Number Cube is:");
			int cb = n2*n2*n2;
			System.out.println("Cube is:"+cb);
		}
		else
		{
			System.out.println("Both Value Are Equal");
		}
	}
}