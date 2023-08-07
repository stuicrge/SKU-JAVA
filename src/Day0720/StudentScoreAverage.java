package Day0720;

import java.util.Scanner;

public class StudentScoreAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		학생
//		2명의  3과목 점수를 입력받고, 각 학생의
//		총점과 평균, 전체
//		학생의 평균을 출력하시오.
		
		
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[2][3];
		int cnt= 0;
		int sum1 = 0, sum2 = 0;
		
		for(int i = 0; i <2; i++) {
			for (int j = 0; j <3; j++) {
				if(cnt < 3)
					System.out.print("학생1의 "+ (j+1) +"번째 점수 : ");
				else
					System.out.print("학생2의 " + (j+1) + "번째 점수 : ");
				cnt++;
				arr[i][j] = scan.nextInt();

			}
		}
		
		for(int i = 0; i <2; i++) {
			for (int j = 0; j <3; j++) {
				if(j==0)
					System.out.println();
				System.out.print(arr[i][j]+ " ");
				
			}
		}
		
		System.out.println();
		System.out.println();
		
		for(int i = 0; i <3; i++) {
			sum1 += arr[0][i];
			sum2 += arr[1][i];
		}
		
		System.out.printf("학생 1의 총점 : %d, 학생 2의 총점 : %d", sum1, sum2);
		
		System.out.println();
		System.out.println();
		
		double average1 = (double)sum1 / 3;
		double average2 = (double)sum2 / 3;
		
		System.out.printf("학생 1의 평균 : %f, 학생 2의 평균 : %f", average1, average2);
		
		System.out.println();
		System.out.println();
		
		double average = (double)(sum1 + sum2) / 6;
		
		System.out.printf("전체학생의 평균 : %f", average);
		
	}

}
