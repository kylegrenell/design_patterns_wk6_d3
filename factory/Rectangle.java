// concrete class implementing the same interface.

public class Rectangle implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   } // this subclass can implement a parent class method 
}