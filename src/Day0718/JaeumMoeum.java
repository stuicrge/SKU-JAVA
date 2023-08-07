package Day0718;

import java.util.Scanner;

public class JaeumMoeum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

		 System.out.println("단어를 입력하시오: ");
			 String word3 = sc.nextLine();
			 int X = 0;
			 int Y = 0;
			 for(int i=0;i<word3.length();i++) {
			 switch(word3.charAt(i)) {
			 case 'a','A','e','E','i','I','o','O','u','U'->{
				 X++;
				
			 }
			 default->{
				 Y++;
				
			 }
			
			 }
			
			 }
			 System.out.println("모음은: "+X);
			 System.out.println("자음은: "+Y);
		
		
		
	}

}
