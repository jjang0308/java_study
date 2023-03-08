import java.util.Scanner;

public class Java_study_1_2 {

	public static void main(String[] args) {
		int number = 123;
		Scanner keyboard = new Scanner(System.in);

		System.out.printf("enter password:");

		int input = keyboard.nextInt();

		if (input == number) {
			System.out.println("correct");
		} else {
			System.out.println("wrong");
		}
		keyboard.close();
	}

}
