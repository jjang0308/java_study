
public class Rectangle {
	protected int width;					// �簢���� ��
	protected int height;					// �簢���� ����
	
	public void setWidth(int w) {
		width = w;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int h) {
		height = h;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int circumference() {
		return 2*width + 2*height;
	}
	
	public int area() {
		return width * height;
	}
	
	public boolean isSquare() {
		return width == height;
	}
	
	public boolean equals (Rectangle s) {
		return (width == s.getWidth() && height == s.getHeight());
	}

	public String toString() {
		return "폭 :" + width + " 높이 :" + height;
	}
}
