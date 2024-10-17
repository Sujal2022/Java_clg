class nestmax 
{
    public static void main(String args[])
    {
        int a=16,b=14,c=18;

        if(a>b)
        {
            if(a>c)
            {
                System.out.println("A is Max");
            }
            else
            {
                System.out.println("C is Max");
            }
        }
        
        else if(b>a)
        {

          if(b>c)
          {
               System.out.println("B is Max");
          }
          else
          {
             System.out.println("C is Max");
          }   
        }

        else
        {
            System.out.println("All are Equal");
        }

    }

}
