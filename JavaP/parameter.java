    class output
    {
        int a,b;
    
        void get(int x,int y)
        {
            a=x;
            b=y;
        }
    
        void show()
        {
            System.out.println("First Number = " + a);
            System.out.println("Second Number = " + b);
        }
    
        void res()
        {
            int c=a+b;
            System.out.println("Result = " + c);
        }
    }
    
    
    class parameter 
    {
            public static void main(String args[])
            {
                output o=new output();
    
                o.get(4,5);
                o.show();
                o.res();
            }
    }
      

