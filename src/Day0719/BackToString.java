package Day0719;

import java.util.Scanner;

public class BackToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하시오: ");
		String str = sc.nextLine();
		
		
		char ch;
		
		for(int i=str.length();i>0;i--) {
			
			ch = str.charAt(i-1);
			System.out.print(ch);
			
		}
		
	}

}
