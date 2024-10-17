class interestcm 
{
        public static void main(String args[])
        {
            int p,n;
            double r,i;
            p=Integer.parseInt(args[0]);
            n=Integer.parseInt(args[1]);
            r=Double.parseDouble(args[2]);
    
            i=(p*r*n)/100;
            System.out.println("interest is " +i);
        }
}    

