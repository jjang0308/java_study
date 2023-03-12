import java.util.Scanner;

public class Java_study_1_11 {

	public static void main(String[] args) {

		// 최댓닶과 최솟값 구하기

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] data = new int[n];
		// 배열의 크기 설정

		for (int i = 0; i < n; i++) {
			data[i] = input.nextInt();
			// n-1까지의 배열에 들어갈 정수 입력
		}
		int max = data[0];// 최댓값 초기화
		int min = data[0];// 최솟값 초기화

		for (int i = 0; i < n; i++) {
			if (data[i] > max)
				max = data[i];
			if (min > data[i])
				min = data[i];
		}

		System.out.println("최솟값은: " + min);
		System.out.println("최댓값은: " + max);
	}

}
