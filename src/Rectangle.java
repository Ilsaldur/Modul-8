public class Rectangle {
	double width;
	double height;
	
	public Rectangle() {
		width = 4;
		height = 40;
	}
	public Rectangle (double newHeight, double newWidth) {
		height = newHeight;
		width = newWidth;
		
	}
	public double getArea() {
		return width * height;
	}
	public double getPerimeter() {
		return (width * 2 + height * 2);
	}
	public void setWidth(double newWidth) {
		width = newWidth;
	}
	public void setHeight(double newHeight) {
		height = newHeight;
	}
}

class TestRectangle {

	public static void main(String[] args) {
		
		 Rectangle rectangle1 = new Rectangle();
		System.out.printf("Rektangel med sider: \t" + rectangle1.width + " og " + rectangle1.height + "\nHar arealet: \t \t" 
		+ rectangle1.getArea() + "\nOg har omkretsen: \t " + rectangle1.getPerimeter());
		System.out.println("  ");
		System.out.println("  ");
		rectangle1.setWidth(6.30);
		rectangle1.setHeight(5.40);
		
		System.out.printf("Rektangel med sider: \t" + rectangle1.width + " og " + rectangle1.height + "\nHar arealet: \t \t" 
				+ rectangle1.getArea() + "\nOg har omkretsen: \t " + rectangle1.getPerimeter());

	}
}