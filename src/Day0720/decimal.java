package Day0720;

import java.util.Scanner;

public class decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//2부터 100사이 모든 소수를 찾는 프로그램
//
		int n = 0;

		for (int i = 2; i <= 100; i++) {
			n = 1;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					n = 0;
					break;
				}
			}
			if (n == 1) {
				System.out.println(i + " ");
			}
		}
	}

}
