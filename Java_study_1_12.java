import java.util.Scanner;

public class Java_study_1_12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] data = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = input.nextInt();
		}
		int max =0;
		for (int i = 0; i < n; i++)
			for (int j = i; j < n; j++) {
				int value = 0;
				for (int k = i; k < j; k++)
					value = value * 10 + data[k];
				boolean isPrime = true;
				for (int k = 2; k * k <= value && isPrime; k++) {
					if (value % k == 0)
						isPrime = false;
					// 소수 판별 알고리즘 사용
					
					if(isPrime && value>1&& value >max)
						max = value;
				}
			}
		if(max>0)
		System.out.println(max);
		else
			System.out.println("no prime number");
	}

}
