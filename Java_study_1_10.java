import java.util.Scanner;

public class Java_study_1_10 {

	public static void main(String[] args) {
		
		Scanner keyB= new Scanner(System.in);
		int n = keyB.nextInt();
		int []data = new int [n];
		for(int i=0;i<n;i++) {
			data[i]= keyB.nextInt();
		}
		int max=0;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int sum=0;
			for(int k=i;k<j;k++)
				sum+=data[k];
			if(sum>max)
				max=sum;
		}
		}
		System.out.println(max);
	}

}
