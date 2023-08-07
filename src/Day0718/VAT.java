package Day0718;

import java.util.Scanner;

public class VAT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 영수증에는　１０％　부가세와　잔돈이　인쇄되어　있다．　구입한　상품의　가격과　받은　금액을　입력하면　부가세와　잔돈을　출력하는　프로그램을　작성하시오．
		
		 Scanner sc = new Scanner(System.in);	
			double vat;
			int change;
			int money;
			int charge;
			
			System.out.println("상품의 가격은");
			money=sc.nextInt();
			System.out.println("지불한 가격은: ");
			charge=sc.nextInt();
			
			change = money-charge;
			vat = money*0.1;
			
			System.out.println("잔돈은 "+change+"입니다");
			System.out.println("부가세는"+vat+"입니다");
	}

}
