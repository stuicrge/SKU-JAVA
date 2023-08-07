package Day0718;

public class BIggerOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 1~10까지의 난수르 발생
		int num = (int)(Math.random()*10) +1;
			System.out.println("난수: "+num);
		//주사위 숫자
			int dice = (int)(Math.random()*6)+1;
			System.out.println("주사위번호: "+dice);
		//로또번호
			int lotto = (int)(Math.random()*45)+1;
			System.out.println("로또번호: "+lotto);
		
		// 1~100 사의의 세수를 랜덤으로 발생시켜 가장 큰 수 찾기
		
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		int max = 0;
		 number1 = (int)(Math.random()*100) +1;
		 number2 = (int)(Math.random()*100) +1;
		 number3 = (int)(Math.random()*100) +1;
		
		 if(number1 >= number2 && number1 >= number3) {
			 max = number1;
		 }
		 else if(number2 >= number1 && number2 >= number3) {
			 max = number2;
		 }else
			 max = number3;
		
		System.out.println(max);
		
		
		
		
		
	}

}
