package Day0718;

import java.util.Scanner;

public class CaseSensitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("단어를 입력하시오: ");
		String word = sc.nextLine();

		char w1 = word.charAt(0);

		switch (w1) {
		case 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'V', 'T',
				'W', 'Z', 'U' -> {
			System.out.println("대문자입니다");
		}
				
		default -> {
			System.out.println("소문자입니다");
		}
		
		}
	}
}
