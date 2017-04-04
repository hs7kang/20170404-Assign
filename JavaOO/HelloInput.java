package programming.io;

import java.util.Scanner;

public class HelloInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요. >> ");
		int data = input.nextInt();
		System.out.println("data = " + data);
		
		System.out.print("실수를 입력하세요. >> ");
		double value = input.nextDouble();
		System.out.println("value = " + value);
		
		System.out.printf("%d\n", 342);
		
		input.close();
	}

}
