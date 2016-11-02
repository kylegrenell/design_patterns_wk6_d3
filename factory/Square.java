// concrete class implementing the same interface.

public class Square implements Shape {

   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   } // this subclass can implement a parent class method 
}