package Day0718;

import java.util.Scanner;

public class SocialSecurityNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 주민번호를 입력하여 남자, 여자를 판별
		
		 Scanner sc = new Scanner(System.in);

		 while(true) {
		 		
		 		 System.out.println("주민번호를 입력하시오: ");
		 		 String regnumber = sc.nextLine();
		 		 char fn = regnumber.charAt(7);
		 		
		 		 switch(fn) {
		 		
		 		 case '1','3'->{
		 			 System.out.println("남자입니다");
		 			 System.out.println("입력을 계속하겠습니까?");
		 		 }
		 		 case '2','4'->{
		 			 System.out.println("여자입니다");
		 			 System.out.println("입력을 계속하겠습니까?");
		 			
		 		 }
		 		 default ->{
		 			 System.out.println("입력을 계속하겠습니까?");
		 		 }
		 		
		 		 }
		 	
		 	 char finish = sc.nextLine().charAt(0);
		 	 if(finish=='n')
		 		 break;
		 	 }

		
		
		
	}

}
