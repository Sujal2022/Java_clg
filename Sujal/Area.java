class AreaCalculator 
{
     double calculateArea(double length, double width) 
    {
        return length * width;
    }

    
     double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }

    
     double calculateArea(double base, double height, boolean isTriangle) 
     {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return 0;  
    }
}

class Area
{

   
   public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        
        double rectangleArea = calculator.calculateArea(10, 5);
        System.out.println("Area of the rectangle: " + rectangleArea);

        
        double circleArea = calculator.calculateArea(7);
        System.out.println("Area of the circle: " + circleArea);

        
        double triangleArea = calculator.calculateArea(10, 8, true);
        System.out.println("Area of the triangle: " + triangleArea);
    }
}

