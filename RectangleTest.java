import java.util.Scanner;


public class RectangleTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Rectangle s1 = new Rectangle();
		Rectangle s2 = new Rectangle();
		
		System.out.print("첫번째 사각형의 폭과 높이를 입력하세요 : ");
		int w= scan.nextInt();
		int h= scan.nextInt();
		
		s1.setWidth(w);
		s1.setHeight(h);

		System.out.print("두번째 사각형의 폭과 높이를 입력하세요 : ");
		w= scan.nextInt();
		h= scan.nextInt();
		
		s2.setWidth(w);
		s2.setHeight(h);
		
		System.out.println();
		System.out.println("첫번째 " + s1);
		System.out.println("둘레는 " + s1.circumference());
		System.out.println("면적은 " + s1.area());
		if (s1.isSquare())
			System.out.println("정사각형입니다");
		else
			System.out.println("직사각형입니다");
			
		System.out.println();
		System.out.println("두번째 " + s2);
		System.out.println("둘레는 " + s2.circumference());
		System.out.println("면적은 " + s2.area());
		if (s1.isSquare())
			System.out.println("정사각형입니다");
		else
			System.out.println("직사각형입니다");

		System.out.println();
		if (s1.equals(s2))
			System.out.println("두 사각형은 동일합니다");
		else
			System.out.println("두 사각형은 동일하지 않습니다");
	}

}
