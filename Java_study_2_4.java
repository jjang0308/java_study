package java_study_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Java_study_2_4 {

	public static void main(String[] args) {
		int n = 1000;
		int m = 1000;
		String[] name = new String[n];
		String[] number = new String[m];
		int count=0;
		try {
			Scanner inFile = new Scanner(new File("input.txt"));
			
			while(inFile.hasNext()){// detect end of file
				name[count] = inFile.next();
				number[count]= inFile.next();
				count++;
			}
			
			inFile.close();
		} catch (FileNotFoundException e) {

			System.out.println("NO FILE");
			System.exit(9);
		}
		for(int i=0; i<count; i++) {
			System.out.println(name[i]+" "+number[i]);
		}
	}

}
