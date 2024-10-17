class Output
{
    int a,b;

    void get()
    {
        a=5;
        b=6;
        System.out.println("First Number = " + a);
        System.out.println("Second Number = " + b);
    }

    void res()
    {
        int c=a+b;
        System.out.println("Result = " + c);
    }
}

class udf 
{
        public static void main(String args[])
        {
            Output o=new Output();

            o.get();
            o.res();
        }
}

