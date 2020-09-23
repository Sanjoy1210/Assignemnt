package finalAssignment;
public class Rectangle {

	private int length, width;
	
	public Rectangle(int l, int w) {
		length = l;
		width = w;
	}
	
	public int getLength() {
		return length;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int areaCalculator() {
		int area = length * width;
		return area;
	}
}
