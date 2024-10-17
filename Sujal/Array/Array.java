class Array
{
	public static void main(String args[])
	{
		int a[][]=new int[2][3];
		int i,j;
		
		a[0][0]=4;
		a[0][1]=7;
		a[0][2]=5;
		a[1][0]=9;
		a[1][1]=6;
		a[1][2]=8;

		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
   			   System.out.print(" "+a[i][j]);
			}
			System.out.println(" ");
		}
	}
}
