class square 
{
    public static void main(String args[])
    {
        int a=16,b=15,r;

        if(a>b)
        {
            if(a%2==0)
            {
                r=a*a;
                System.out.println("Square = "+r);
            }
            else
            {
                System.out.println("First Number is Big but It is not Even");
            }
        }
        
        else if(b>a)
        {

          if(b%2!=0)
          {
               r=b*b*b;
               System.out.println("Cube = "+r);
          }
          else
          {
             System.out.println("Second Number is Big but It is not Odd");
          }   
        }

        else
        {
            System.out.println("Both are Equal");
        }

    }



}
