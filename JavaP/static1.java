// Static Member & Method

class print
{
    static int s;

    static void sum()
    {
        
        for(int i=1;i<=10;i++)
        {
            s=s+i;
        }
        System.out.println(s);
    }
}


class static1 {
    public static void main(String[] args) 
    {
        print.sum();   
    }   
}
