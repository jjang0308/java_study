
public class Circle {

	int x1;
	int y1;
	int radius;

	public Circle(int a, int b, int c) {
		x1=0;
		y1=0;
		radius=1;
		
		this.x1=a;
		this.y1=b;
		this.radius=c;
	}
	
	
	public void setX(int x) {
		x1 = x;
	}

	public int getX() {
		return x1;
	}

	public void setY(int y) {
		y1 = y;
	}

	public int getY() {
		return y1;
	}

	public void setRadius(int r) {
		radius = r;
	}

	public int getRadius() {
		return radius;
	}

	public double getCircumference() {
		return (radius * 2) * 3.14;
	}

	public double getArea() {
		return (radius * radius) * 3.14;
	}

	public boolean equals(Circle s) {
		if (radius == s.radius && x1 == s.x1 && y1 == s.y1)
			return true;
		else
			return false;

	}
	public String toString() {
		return "원의 명세 반지름은 "+radius+" 면적은 "+getArea()+" 둘레는 "+getCircumference(); 
	}
}
