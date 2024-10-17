class Parent {
    public final void show() {
        System.out.println("This is a final method in the Parent class.");
    }
}

class Child extends Parent {
    //Uncommenting the following method will cause a compilation error
   
    public void show1() {
       System.out.println("This is an attempt to override the final method.");
    }
}

public class Finalex {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
        obj.show1();  // Calls the final method from the Parent class
    }
}
