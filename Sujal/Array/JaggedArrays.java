/*
--> A rectangular array is a multi-dimensioned array in which all of the rows have the same number of elements and all columns have the same number of elements.

--> A jagged matrix has rows (or columns) with varying number of elements.


It is a new feature supported by Java. In Jagged arrays, each row, in a two-dimensional array, may contain different lengths. Let us design a two-dimensional array with 4 rows where the first row contains 4 elements, the second row with 1 element, the third row with 2 elements and the fourth row with 3 elements.
*/

class JaggedArrays
{
  public static void main(String args[])
  {
     int student[][] = new int[4][];    
 
     student[0] = new int[4];	
     student[1] = new int[1];
     student[2] = new int[2];
     student[3] = new int[3];
 
                             // 1st row
     student[0][0] = 44;
     student[0][1] = 55;
     student[0][2] = 66;
     student[0][3] = 77;
		             // 2nd row
     student[1][0] = 36;
		             // 3rd row
     student[2][0] = 87;
     student[2][1] = 97;
		             // 4th row
     student[3][0] = 68;
     student[3][1] = 78;
     student[3][2] = 88;
 
     System.out.println("\nMatrix Form");
 
     for(int i = 0; i < student.length; i++)     
     {
       for(int j = 0; j < student[i].length; j++)
       {
          System.out.print(student[i][j] + " ");
       }
       System.out.println();        
     }
  }
}
