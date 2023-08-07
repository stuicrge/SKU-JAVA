package Day0731;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LendProgramTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		List<Book> book = new ArrayList<>();
		List<AppCD> app = new ArrayList<>();

		boolean run = true;

		while (true) {

			System.out.println("** 도서 대여 프로그램 **");
			System.out.println("1.대출 2.반납 3.회원조회 4.Book조회 5.CD 조회 6.종료");
			int strn = sc.nextInt();

			if (strn == 1) {

				for (int i = 0; i < book.size(); i++) {

					if (book.get(i).getState() == 1) {
						
						
					
					} else if (book.get(i).getState() == 0) {
						System.out.println("대출할 수없습니다");
					}

					book.remove(i);
				}

			}

		}

	}

}
