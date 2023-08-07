package Day0727;

import java.util.Scanner;

public class ElementaryAritimetic extends Operator {

	public ElementaryAritimetic(int number1, int number2, String str) {
		super(number1, number2, str);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		boolean run = true;

		Operator op = new Operator(number1, number2, str);

		while (true) {

			System.out.print("입력: ");
			number1 = sc.nextInt();
			number2 = sc.nextInt();
			str = sc.next();

			if (str.equals("+")) {
				op.plus();

			} else if (str.equals("-")) {
				op.minus();

			}

			else if (str.equals("*")) {
				op.multi();

			} else if (str.equals("/")) {
				op.division();

			} else
				run = false;

		}
	}

}
