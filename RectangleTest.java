import java.util.Scanner;


public class RectangleTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Rectangle s1 = new Rectangle();
		Rectangle s2 = new Rectangle();
		
		System.out.print("ù��° �簢���� ���� ���̸� �Է��ϼ��� : ");
		int w= scan.nextInt();
		int h= scan.nextInt();
		
		s1.setWidth(w);
		s1.setHeight(h);

		System.out.print("�ι�° �簢���� ���� ���̸� �Է��ϼ��� : ");
		w= scan.nextInt();
		h= scan.nextInt();
		
		s2.setWidth(w);
		s2.setHeight(h);
		
		System.out.println();
		System.out.println("ù��° " + s1);
		System.out.println("�ѷ��� " + s1.circumference());
		System.out.println("������ " + s1.area());
		if (s1.isSquare())
			System.out.println("���簢���Դϴ�");
		else
			System.out.println("���簢���Դϴ�");
			
		System.out.println();
		System.out.println("�ι�° " + s2);
		System.out.println("�ѷ��� " + s2.circumference());
		System.out.println("������ " + s2.area());
		if (s1.isSquare())
			System.out.println("���簢���Դϴ�");
		else
			System.out.println("���簢���Դϴ�");

		System.out.println();
		if (s1.equals(s2))
			System.out.println("�� �簢���� �����մϴ�");
		else
			System.out.println("�� �簢���� �������� �ʽ��ϴ�");
	}

}
