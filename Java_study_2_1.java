package java_study_2;

import java.util.Scanner;

//메소드 시작
public class Java_study_2_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("몇의 몇제곱을 구할지 순서대로 입력하시오: ");
		int a = input.nextInt();
		int b = input.nextInt();

		int result = power(a, b);

		System.out.println(a+" 의"+b+" 제곱은: "+result);

	}

	static int/*리턴타입*/ power(int n, int m){
		int prod =1;
		for(int i=0;i<m;i++) 
			prod*=n;
		return prod;//prod는 리턴 타입과 같은 정수여야함.
	}
	
}
