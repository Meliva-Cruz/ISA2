

public class Rectangle implements Shape {
	private double length; 
	private double width;
	private double area;
	
	public Rectangle(double length,double width) {
		this.length = length;
		this.width = width;
		area = length*width;
	}
	
	 @Override
	   public void area() {
	      System.out.println("Rectangle Area: "+area);
	   }
}
