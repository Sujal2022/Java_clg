class First 
{
    
     double p;
     double r;
     double t;

   
     First(double principal, double rate, double time) {
		p = principal;
        r = rate;
        t = time;
    }

    
     double calc() {
        return (p * r * t) / 100;
    }

    
     void display() 
	 {
        double interest = calc();
        System.out.println("Simple Interest is: " + interest);
    }
}
class Simple1
{
    
    public static void main(String[] args) 
	{
        First f = new First(1000, 5, 2);

       
        f.display();
    }
}
