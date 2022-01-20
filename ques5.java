package firstProject;

import java.util.Scanner;

public class ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Before Swap");
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		
		int c = a;
		a = b;
		b = c;
		System.out.println("After Swap");
		System.out.println("A: "+a);
		System.out.println("B: "+b);
	}

}
