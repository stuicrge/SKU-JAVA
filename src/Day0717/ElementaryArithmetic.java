package Day0717;

import java.util.Scanner;

public class ElementaryArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ３．　사용자로부터　두 개의　정수를　받아서　합，　차，　곱，　평균，　큰 수，　작은 수를　계산하여　출력하는　프로그램을　작성하시오．
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("a: ");
		a=sc.nextInt();
		System.out.println("b: ");
		b=sc.nextInt();
		
	 int sum = a+b;
	 int min = a-b;
	 int x = a*b;
	 int avg = a+b/2;
	
	 int big;
	 int small;
	
	 if(a>b) {
		 big = a;
		 small=b;
	 }else {
		 small = a;
		 big=b;
	 }
	System.out.println("합: "+sum);
	System.out.println("차: "+min);
	System.out.println("곱: "+x);
	System.out.println("평균: "+avg);
	System.out.println("큰 수: "+big);
	System.out.println("작은 수:"+small);
		
		
		
	}

}
