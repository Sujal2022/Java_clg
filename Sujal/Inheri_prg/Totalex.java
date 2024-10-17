class Marks 
{
    int sub1, sub2, sub3;

    void show(int s1, int s2, int s3) 
    {
        sub1 = s1;
        sub2 = s2;
        sub3 = s3;
    }
    void showdata()
    {
        System.out.println("Subject 1 marks is "+sub1);
        System.out.println("Subject 2 marks is "+sub2);
        System.out.println("Subject 3 marks is "+sub3);
    }

}

// First derived class
class Total extends Marks {

    // Constructor to initialize the marks
    void TotalMarks() 
    {
       double t = sub1+sub2+sub3;
        
       System.out.println("Total is "+t);

    }    
}

class AverageMarks extends Total
 {    

    void Average() {
        double average = t / 3.0;
        System.out.println("Average Marks: " + average);
    }
}

// Main class
class totalex
 {
    public static void main(String args[]) 
    {

        AverageMarks s = new AverageMarks();

        s.show(20, 30, 60);
        s.showdata();
        s.TotalMarks();
        s.Average();
    }
}
