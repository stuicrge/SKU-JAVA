package Day0719;

import java.util.Scanner;

public class ChangeAlpaBat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 
		Scanner sc = new Scanner(System.in);
		// 영문자 한자를 입력받아 소문자는 대문자로 대문자는 소문자로 출력
		System.out.print("입력: ");
		String str = sc.nextLine();
		char ch;
		ch = str.charAt(0);
		if (ch >= 'a' && ch <= 'z') {
			System.out.print((char) (ch - 32));
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.print((char) (ch + 32));
		} else
			System.out.print("영문자가 아닙니다");

//	// 영단어를 입력받아 소문자는 대문자로 대문자는 소문자로 출력
//	System.out.print("입력: ");
//	String str = sc.nextLine();
//	char ch;
//
//	for (int i = 0; i < str.length(); i++) {
//
//		ch = str.charAt(i);
//
//		if (ch >= 'a' && ch <= 'z') {
//			System.out.print((char) (ch - 32));
//
//		} else if (ch >= 'A' && ch <= 'Z') {
//			System.out.print((char) (ch + 32));
//		}else
//		System.out.print("영문자가 아닙니다");

//
//	} 
	}

}
