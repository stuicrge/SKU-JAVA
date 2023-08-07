package Day0719;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// * 삼각형 만들기
		System.out.print("입력: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j > i; j--)
				System.out.print("");

			for (int j = 0; j <= i; j++)
				System.out.print("*");

			for (int j = 0; j < i; j++)
				System.out.print("*");
			System.out.println();
		}

	}

}
