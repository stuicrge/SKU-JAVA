package Day0719;

import java.util.Scanner;

public class Game369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		////////////////////////////////////////////////
		// 3 6 9

		System.out.print("입력: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			String str = String.valueOf(i);

			if (str.contains("3") || str.contains("6") || str.contains("9")) {
				System.out.print("짝" + " ");
			} else
				System.out.print(i + " ");
		}

	}

}
