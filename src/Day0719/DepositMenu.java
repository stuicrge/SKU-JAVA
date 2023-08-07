package Day0719;

import java.util.Scanner;

public class DepositMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		boolean run = true;
		int money = 0;
		while (run) {
			System.out.println("1. 입력: 예금액 증가 ");
			System.out.println("2. 입력: 예금액 감소 ");
			System.out.println("3. 입력: 잔고 출력 ");
			System.out.println("4. 입력: run을 false로 만들어 종료 ");
			System.out.println("선택: ");
			String strn = sc.nextLine();
			switch (strn) {

			case "1" -> {
				System.out.print("예금액: ");
				int put = sc.nextInt();
				money += put;
				break;
			}
			case "2" -> {
				System.out.println("출금액: ");
				int get = sc.nextInt();
				money -= get;
				if (get > money) {
					System.out.println("잔액이 부족합니다");
				}
				break;
			}
			case "3" -> {
				System.out.println("잔고: " + money);
				break;
			}
			case "4" -> {
				run = false;
				break;
			}
			}
		}
	}

}
