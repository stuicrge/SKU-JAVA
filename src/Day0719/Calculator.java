package Day0719;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// 간단한 계산기 구현
		System.out.print("입력: ");
		char str = sc.next().charAt(0);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		if (str == '+') {
			int sum = 0;
			sum = num1 + num2;
			System.out.println(sum);
		} else if (str == '-') {
			int min = 0;
			min = num1 - num2;
			System.out.println(min);
		} else if (str == '*') {
			int X = 0;
			X = num1 * num2;
			System.out.println(X);
		} else if (str == '/') {
			int division = 0;
			division = num1 / num2;
			System.out.println(division);
		}
	}
}
