package java_study_2;

import java.util.Scanner;

public class Java_study_2_3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] data = new int[n];
		for (int i = 0; i < n; i++)
			data[i] = input.nextInt();

		bubbleSort(n, data);

		for (int i = 0; i < n; i++)
			System.out.print(data[i] + " ");
	}
//리턴 할게 없을때 리턴타입은 void
//버블sort 메소드
	static void bubbleSort(int n, int[] data) {
		for (int i = n - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (data[j] > data[j + 1]) {
					
					swap(data[j],data[j+1]);
					int tmp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = tmp;
				}
			}

		}

	}
//swap 메소드
	static void swap(int a, int b) {
		int tmp=a;
		a=b;
		b=tmp;
	}
}
