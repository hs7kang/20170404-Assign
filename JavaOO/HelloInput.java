package programming.io;

import java.util.Scanner;

public class HelloInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���. >> ");
		int data = input.nextInt();
		System.out.println("data = " + data);
		
		System.out.print("�Ǽ��� �Է��ϼ���. >> ");
		double value = input.nextDouble();
		System.out.println("value = " + value);
		
		System.out.printf("%d\n", 342);
		
		input.close();
	}

}
