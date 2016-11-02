public class ShapeFactory {
  
   //use getShape method to get object of type shape 
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }    

      if(shapeType.equalsIgnoreCase("CIRCLE")){ // ignoreCase Determines whether two String objects contain the same data
         return new Circle(); // true if the two String objects contain either exactly the same data or if they differ only in case; false otherwise.
         
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
         
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      
      return null;
   }
}