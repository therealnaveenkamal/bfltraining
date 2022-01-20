package firstProject;

import java.util.Scanner;

public class ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		int ascii = (int)a;
		if((ascii >=65 && ascii <=90) || (ascii >= 97 && ascii <= 122)) {
			switch(a) {
			case 'a': System.out.println("Vowel"); break;
			case 'e': System.out.println("Vowel"); break;
			case 'i': System.out.println("Vowel"); break;
			case 'o': System.out.println("Vowel"); break;
			case 'u': System.out.println("Vowel"); break;
			default : System.out.println("Consonant");
			}
		}
		else {
			System.out.println("Enter an alphabet");
		}
		
	}

}
