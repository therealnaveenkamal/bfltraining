package firstProject;

import java.util.Scanner;

public class ques6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		boolean bool = checkeven(a);
		if(bool)
			System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");
		
	}

	private static boolean checkeven(int a) {
		// TODO Auto-generated method stub
		if(a%2 == 0) {
			return true;
		}
		return false;
		
	}

}
