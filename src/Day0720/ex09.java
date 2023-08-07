package Day0720;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		학생들의 점수를 분석하는 프로그램

		Scanner sc = new Scanner(System.in);
		boolean run = true;

		int stu = 0;
		int[] score = null;
	

		while (true) {

			System.out.println("---------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("---------------------");

			System.out.print("선택>");
			int str = sc.nextInt();

			switch (str) {

			case 1:
				System.out.print("학생수: ");
				stu = sc.nextInt();
				score = new int[stu];
				break;

			case 2:
				for (int i = 0; i < stu; i++) {

					System.out.println("score[" + i + "]");
					score[i] = sc.nextInt();
				}
				break;

			case 3:

				for (int i = 0; i <stu; i++) {
					System.out.println("score[" + i + "]" + ": " + score[i]);
				}
				break;
			case 4:
				int highscore = 0;
				int sum = 0;

				for (int i = 0; i < stu; i++) {
					sum += score[i];
					if (score[i] > highscore) {
						highscore = score[i];
					}

				}
				System.out.print("최고 점수: " + highscore);
				System.out.println("평균 점수: " + (double) sum / stu);
				break;

			default:
				run = false;
				break;

			}

		}

	}

}
