
public class RegularPolygon {

	private int sides;
	private double x;
	private double y;
	private double sideLength;

	public RegularPolygon() {
		x = 0;
		y = 0;
		sideLength = 1;
		sides = 3;
	}

	public RegularPolygon(int newSides, double newSideLength) {
		x = 0;
		y = 0;
		sides = newSides;
		sideLength = newSideLength;
	}

	public RegularPolygon(int newSides, double newSideLength, double newx, double newy) {
		x = newx;
		y = newy;
		sides = newSides;
		sideLength = newSideLength;
	}

	public void setSides(int newSides) {
		sides = newSides;
	}

	public int getSides() {
		return sides;
	}

	public void setSideLength(double newSideLength) {
		sideLength = newSideLength;
	}

	public double getSideLength() {
		return sideLength;
	}

	public void setx(double newx) {
		x = newx;
	}

	public double getx() {
		return x;
	}

	public void sety(double newy) {
		y = newy;
	}

	public double gety() {
		return y;
	}

	public double getArea() {
		return (sides * (sideLength * sideLength) / (Math.tan(Math.PI / sides) * 4));
	}

	public double getPerimeter() {
		return sideLength * sides;

	}

}

class TestRegularPolygon {
	public static void main(String[] args) {
		RegularPolygon polygon1 = new RegularPolygon();
		System.out.println(polygon1.getPerimeter());
		System.out.println(polygon1.getArea());
		RegularPolygon polygon2 = new RegularPolygon(5, 3);
		System.out.println(polygon2.getPerimeter());
		System.out.println(polygon2.getArea());
		RegularPolygon polygon3 = new RegularPolygon(6, 4, 5, 5);
		System.out.println(polygon3.getPerimeter());
		System.out.println(polygon3.getArea());
		
		
	}
}
