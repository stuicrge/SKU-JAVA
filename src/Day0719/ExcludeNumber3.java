package Day0719;

import java.util.Scanner;

public class ExcludeNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// 1~50까지의 난수 중에서 3의배수를 제외한 수들의 합을 출력
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			int num = (int) (Math.random() * 50) + 1;
			if (num % 3 != 0) {
				sum += num;
			}
			System.out.print(num + "+");
		}
		System.out.println("=" + sum);
	}

}

