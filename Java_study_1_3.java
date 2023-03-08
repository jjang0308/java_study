import java.util.Scanner;

public class Java_study_1_3 {

	public static void main(String[] args) {

		String str = "Hello World";
		String input = null;

		for (;;) {
			System.out.print("type your answer:");
			Scanner kb = new Scanner(System.in);
			input = kb.nextLine().trim();
			if (str.equals(input)) {
				System.out.println("match!");
				break;
			} else {
				System.out.println("do not match!");
			}
		}
	}

}
