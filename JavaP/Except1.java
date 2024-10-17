class Except1 
{
    public static void main(String args[]) 
    {
        int a[]={5,7,9,45,65};
        
        try
        {
        System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("We are trying to access Array out of its range");
        }

    }    
}
