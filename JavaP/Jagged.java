class Jagged 
{
    public static void main(String args[]) 
    {
     int a[][]=new int[4][];
     
     a[0]=new int[4];
     a[1]=new int[2];
     a[2]=new int[1];
     a[3]=new int[3];

     a[0][0]=4;
     a[0][1]=7;
     a[0][2]=8;
     a[0][3]=5;

     a[1][0]=9;
     a[1][1]=4;

     a[2][0]=10;

     a[3][0]=6;
     a[3][1]=7;
     a[3][2]=8;
     
     for(int i=0;i<a.length;i++)
     {
        for(int j=0;j<a[i].length;j++)
        {
            System.out.print(a[i][j] + " ");
        }
        System.out.println();
     }

    }
}
