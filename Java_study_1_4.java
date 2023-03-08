
public class Java_study_1_4 {

	public static void main(String[] args) {
		
		int [] grades;
		grades = new int[5];
		
		grades[0] = 100;
		grades[1]= 50;
		grades[2]= 20;
		grades[3]=10;
		grades[4]=42;
		
		for(int i=0;i<grades.length;i++) {
			System.out.println("Grade"+(i+1)+": "+grades[i]);
		}
		 
	}

}
