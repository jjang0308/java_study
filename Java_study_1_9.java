import java.util.Scanner;

public class Java_study_1_9 {

	public static void main(String[] args) {
		
		Scanner keyB = new Scanner(System.in);
		System.out.print("정수의 갯수를 입력하시오: ");
		int n = keyB.nextInt();
		int [] data= new int[n];
		System.out.print("정수를 입력하시오: ");
		for(int i=0;i<n;i++) {
			data[i]= keyB.nextInt();
		}
		int count= 0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(data[i]==data[j])
					count++;
			}
			
		}
		System.out.println(count);
	}

}
