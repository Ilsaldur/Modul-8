public class MyRectangle {

	public static void main(String[] args) {
		
		Rectangle rectangle1 = new Rectangle();
		System.out.println("Rektangel med sider: " + rectangle1.width + " og " + rectangle1.height + " har arealet " + rectangle1.getArea() + " og har omkretsen " + rectangle1.getPerimeter());
		
		Rectangle rectangle2 = new Rectangle(10);
		System.out.println("Rektangel med sider: " + rectangle2.width + " og " + rectangle2.height + " har arealet " + rectangle2.getArea() + " og har omkretsen " + rectangle2.getPerimeter());

	}
}
class Rectangle {
	double width;
	double height;
	
	Rectangle() {
		width = 4;
		height = 40;
	}
	Rectangle (double newHeight) {
		height = newHeight;
	}
	Rectangle (double newWidth) {
		width = newWidth;
	}
	double getArea() {
		return width * height;
	}
	double getPerimeter() {
		return (width * 2 + height * 2);
	}
	void setWidth(double newWidth) {
		width = newWidth;
	}
	void setHeight(double newHeight) {
		height = newHeight;
	}
}