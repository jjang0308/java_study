import java.util.Scanner;

public class Java_study_1_14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("몇개의 정수를 입력하실껀가요? ");
		int ipMax = input.nextInt();
		int[] data = new int[ipMax];
		int max = data[0];
		int min = data[0];
		
		for (int i = 0; i < ipMax; i++) {
			data[i] = input.nextInt();
			if (data[i]>max) {
				max = data[i];
			}
			if (data[i]<min) 
				min = data[i];
				else
					min=data[0];//최솟값 min에 위에서 아무것도 없는 data[0]에
			                    //초기화 되있었으므로 다시 입력된 data[0]을 넣어줘야함.
		}                       //최댓값은 상관없음.
		System.out.println("최솟값은: "+min+" 최댓값은: "+max);
	}

}
