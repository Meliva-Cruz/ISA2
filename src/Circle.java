

public class Circle implements Shape {
	private double radius;
	private double area;
	
	public Circle(double radius) {
		this.radius = radius;
		area = 3.14*radius*radius;
	}
	 @Override
	   public void area() {
	      System.out.println("Circle Area: "+area);
	      
	   }
}
