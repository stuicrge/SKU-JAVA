package Day0720;

import java.util.Scanner;

public class Pibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 피보나치 수열을 배열로 나타내보시오
		Scanner sc = new Scanner(System.in);


		System.out.print("입력: ");
		int pn = sc.nextInt();
		int[] n = new int[pn];
		n[0] = 0;
		n[1] = 1;
		System.out.println(n[0] + n[1]);

		for (int i = 2; i < pn; i++) {
			n[i] = n[i - 1] + n[i - 2];
			System.out.println(n[i]);
}
	}

}
