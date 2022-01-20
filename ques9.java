package firstProject;

import java.util.Scanner;

public class ques9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a%4 == 0)
			if(a%100 == 0)
				if(a%400 == 0)
					System.out.println("It is a Leap Year");
				else
					System.out.println("Not a Leap Year");
			else
				System.out.println("It is a Leap Year");
		else
			System.out.println("Not a Leap Year");

	}

}
