package Day0718;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// 십진수를 이진수로 변환하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하시오: ");
		int n = sc.nextInt(); //입력받은 정수 N
		String result = ""; //출력할 값
		
		for(int i=n; i>0; i/=2) {
			result = String.valueOf(i%2) + result;
		}
		
		System.out.println(result);
	}

}
