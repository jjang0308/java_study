import java.util.Scanner;

public class Java_study_1_13 {

	public static void main(String[] args) {

		// 정렬 bubble sort algorithm

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] data = new int[n];
		for (int i = 0; i < n; i++)
			data[i] = input.nextInt();

		for (int i = n-1; i >0; i--) {
			for (int j = 0; j < i; j++) {
				if (data[j] > data[j + 1]) {
					int tmp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = tmp;
				}
			}

		}
		for(int i = 0 ; i < n ; i++)
		System.out.print(data[i]);
	}

}
