package Day0727;

import java.util.Scanner;

public class Operator {

	static int number1;
	static int number2;
	static String str;

	public Operator(int number1, int number2, String str) {
		this.number1 = number1;
		this.number2 = number2;
		this.str = str;
	}

	Scanner sc = new Scanner(System.in);

	public void plus() {

		int sum = 0;
		sum = number1 + number2;
		System.out.println("출력: " + sum);
	}

	public void minus() {

		int min = 0;
		min = number1 - number2;
		System.out.println("출력: " + min);
	}

	public void multi() {

		int mul = 0;

		mul = number1 * number2;
		System.out.println("출력: " + mul);

	}

	public void division() {

		int div = 0;
		div = number1 / number2;
		System.out.println("출력: " + div);
	}

}
