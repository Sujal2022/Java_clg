class Marks 
{
    public static void main(String[] args) 
{
        int subject1 = 90; // Marks for the first subject
        int subject2 = 83; // Marks for the second subject
        int subject3 = 87; // Marks for the third subject

        // Calculate the total and average marks
        int total = subject1 + subject2 + subject3;
        double average = total / 3.0;

        // Determine the grade based on the university criteria
        String grade;
        if (average >= 90) 
           	 grade = "A+";
         else if (average >= 80) 
            	grade = "A";
        else if (average >= 70) 
           	 grade = "B";
         else if (average >= 60) 
            	grade = "C";
        else if (average >= 50) 
           	 grade = "D";
       	 else 
            	grade = "F";
        

        // Display the results
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
    }
}