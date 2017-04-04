package programming.io;

import java.util.Scanner;

public class HelloOuput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt(); //십진수 입력
		int num2 = input.nextInt(2); //이진수 입력
		
		input.close();
		System.out.printf("num1 = %d, num2 = %d\n", num1, num2);
		
		System.out.printf("%5d + %5d = %5d\n", num1, num2, num1 + num2);
/*		System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d\n", num1, num2, num1 / num2);
		System.out.printf("%h + %h = %h\n", num1, num2, num1 + num2);
		System.out.printf("%h - %h = %h\n", num1, num2, num1 - num2);
		System.out.printf("%h * %h = %h\n", num1, num2, num1 * num2);
		System.out.printf("%h / %h = %h\n", num1, num2, num1 / num2);
*/		
		System.out.printf("%15.2f", 243.324);
	}

}
