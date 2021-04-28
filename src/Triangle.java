

public class Triangle implements Shape {
	private double base;
	private double height;
	private double area;
	
	public Triangle(double base,double height) {
		this.base = base;
		this.height = height;
		area = 0.5* base * height;
	}
	
	 @Override
	   public void area() {
	      System.out.println("Triangle Area: "+area);
	   }
}
