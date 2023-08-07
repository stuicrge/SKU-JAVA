package Day0720;

import java.util.Scanner;

public class PlusDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 두개의 주사위를 던졌을때 나오는 눈을 (눈1,눈2)의 형태로 출력하고 두 눈의 합이 5가 될때까지 실행하시오.
		
		Scanner sc = new Scanner(System.in);
		int sum=0;
		
		while(true) {
			
			int dice1=(int)(Math.random()*6)+1;
			int dice2=(int)(Math.random()*6)+1;
			
			sum=dice1+dice2;
			
			if(sum==5) {
				System.out.println("("+dice1+","+dice2+")");
				break;
			}else
				System.out.println("("+dice1+","+dice2+")");;
			
		}
		
		
		
		
		
	}

}
