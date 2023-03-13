package java_study_2;

import java.util.Scanner;

public class Java_study_2_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("어디서 어디까지의 소수를 찾고 싶나요?(입력:n m): " );
		int start =input.nextInt();
		int finish=input.nextInt();
		
		for (int n = start; n <= finish; n++) {
			if (isPrime(n))
				System.out.println(n);

		}

	}
//소수 판별 메소드
	static boolean isPrime(int m) {
		if (m < 2)
			return false;
		for (int i = 2; i * i < m; i++)
			if (m % i == 0)
				return false;
		return true;
	}
}
