package Day0719;

import java.util.Scanner;

public class ScoreAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// n명의 점수를 입력받고 평균을 출력, 평균을 가로막대 그래프로 표현
		System.out.print("입력하시오: ");
		int n = sc.nextInt();

		int sum = 0;
		int avg = 0;

		System.out.println("점수를 입력해주세요: ");
		for (int i = 1; i <= n; i++) {
			int score = sc.nextInt();
			sum += score;
		}

		avg = sum / n;

		System.out.println("평균은: " + avg);

		if (avg <= 100 && avg >= 90) {
			System.out.println("*********");
		} else if (avg < 90 && avg >= 80) {
			System.out.println("********");
		} else if (avg < 80 && avg >= 70) {
			System.out.println("*******");
		} else if (avg < 70 && avg >= 60) {
			System.out.println("******");
		} else if (avg < 60 && avg >= 50) {
			System.out.println("*****");
		} else if (avg < 50 && avg >= 40) {
			System.out.println("****");
		} else if (avg < 40 && avg >= 30) {
			System.out.println("***");
		} else if (avg < 30 && avg >= 20) {
			System.out.println("**");
		} else if (avg < 20 && avg >= 10) {
			System.out.println("*");
		}
	}

}
