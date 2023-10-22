package entities;

public class treina1 {
	
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return (width + height) * 2;
	}
	
	public double diagonal() {
		return Math.sqrt((width * width) + (height * height)) ;
	}
	
	public String toString() {
		return "area = "
				+  String.format("%.2f%n", area())
				+ "perimeter = "
				+ String.format("%.2f%n", perimeter())
				+ "diagonal = "
				+ String.format("%.2f%n", diagonal());
	}
	
}
