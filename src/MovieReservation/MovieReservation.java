package MovieReservation;

import java.util.*;

public class MovieReservation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int choice;
		String pId;
		while (true) {
			System.out.println();
			System.out.println(" ** 영화 예매 프로그램 **");
			System.out.println("1. 로그인 2. 회원가입");
			choice = sc.nextInt();
			if (choice == 1) {
				pId = LoginService.Login();
				break;
			} else if (choice == 2) {
				JoinService.Join();
				pId = LoginService.Login();
				break;

			} else {
				System.out.println("올바른 메뉴를 선택하세요.");
			}

		}
		
		if (LoginService.isManager(pId)) {
			while (true) {
				System.out.println();
				System.out.println(" ** 관리자 모드 **");
				System.out.println("1. 영화 추가 2. 영화 삭제 3. 종료");
				choice = sc.nextInt();
				if (choice == 1) {
					MovieManagement.addMovie();

				} else if (choice == 2) {
					MovieManagement.Delete();
				} else if (choice == 3) {
					break;
				} else
					System.out.println("올바른 메뉴를 선택하세요.");
			}

		}
		boolean run = true;

		Outter: while (run) {
			ReservationService rs = new ReservationService();
			System.out.print("1. 예매하기 2. 예매내역 보기 3. 종료");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				rs.reservMovie(pId);
				break;
			case 2:
				rs.printReservation(pId);
				break;
			case 3:
				System.out.println("예매를 종료합니다.");
				break Outter;
			}

		}

	}

}
