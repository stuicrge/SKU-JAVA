package Day0719;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//출력하는 구구단의 숫자를 입력받아 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("입력한 수: ");
		int n = sc.nextInt();
		for (int i2 = 1; i2 < 10; i2++) {
			System.out.println("값: " + n * i2);
		}
		
		//전체 구구단을 출력
		int answer1 = 0;
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				answer1 = j * i;
				System.out.println("값: "+answer1);
			}
		}

		//전체 구구단 출력 (가로로)
		int answer2 = 0;
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				answer2 = j * i;
				System.out.print(answer2+"\t");
			}
			System.out.println();
		}
		
	}

}
