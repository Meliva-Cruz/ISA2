

public class ShapeFactory {
	   public Shape getShape(String shapeType,double side){
	      if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new Circle(side);  
	      } 
	      
	      return null;
	   }
	   
	  public Shape getShape(String shapeType,double side1,double side2){
		      if(shapeType == null){
		         return null;
		      }		
		      if(shapeType.equalsIgnoreCase("RECTANGLE")){
		         return new Rectangle(side1,side2);
		         
		      }else if(shapeType.equalsIgnoreCase("TRIANGLE")){
			         return new Triangle(side1,side2);
		      }
		      return null;
		   }
}
