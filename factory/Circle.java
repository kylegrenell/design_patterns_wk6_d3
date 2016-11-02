// concrete class implementing the same interface.

public class Circle implements Shape {
                  // puts into effect the shape interface
   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   } // this subclass can implement a parent class method 
}