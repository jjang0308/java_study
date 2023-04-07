import java.util.Scanner;

public class CircleTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Circle c1, c2;
		int x, y, r;
		System.out.print("첫번째의 원의 중점의 x,y 좌표와 반지름을 입력하시오");
		x = input.nextInt();
		y = input.nextInt();
		r = input.nextInt();
		c1 = new Circle(x, y, r);

		System.out.print("두번째의 원의 중점의 x,y 좌표와 반지름을 입력하시오");
		x = input.nextInt();
		y = input.nextInt();
		r = input.nextInt();
		c2 = new Circle(x, y, r);
		
		System.out.println();
		System.out.println("첫번째"+c1);
		System.out.println("면적 : "+c1.getArea());
		System.out.println("둘레 : "+c1.getCircumference());
		
		System.out.println();
		System.out.println("첫번째"+c2);
		System.out.println("면적 : "+c2.getArea());
		System.out.println("둘레 : "+c2.getCircumference());
	
		if(c1.equals(c2))
			System.out.println("두원은 동일합니다");
		else
			System.out.println("두 원은 동일하지 않습니다.");
	}
}
