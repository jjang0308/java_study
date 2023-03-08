import java.util.Scanner;

public class Java_study_1_5 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] data = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = kb.nextInt();
		}
		int sum = 0;
		int Max = data[0];
		for (int i = 0; i < n; i++) {
			sum += data[i];
			if (data[i] > Max)
				Max = data[i];
		}

		System.out.println("The sum is:" + sum);
		System.out.println("The max is:" + Max);
		kb.close();

	}

}
