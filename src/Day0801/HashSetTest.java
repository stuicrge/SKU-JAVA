package Day0801;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashSetTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Set<Person> set = new HashSet<Person>();
//		Iterator<Person> iterator = set.iterator();
		boolean run = true;
		String ID;
		String Name;
		while (run) {

			System.out.println("** 회원 관리 프로그램 **");
			System.out.println("1.회원추가");
			System.out.println("2.회원삭제");
			System.out.println("3.회원출력");
			System.out.println("4.종료");
			System.out.print("선택하려는 메뉴의 번호를 입력하세요>");
			int strn = sc.nextInt();

			if (strn == 1) {

				System.out.print("추가할 회원의 아이디는: ");
				ID = sc.next();
				sc.nextLine();
				System.out.print("추가할 회원의 이름은: ");
				Name = sc.nextLine();

				set.add(new Person(ID, Name));

			}
			if (strn == 2) {
				System.out.print("삭제할 회원의 아이디를 입력하세요>>");
				ID = sc.next();
				Iterator<Person> iterator = set.iterator();
				boolean found = false;
				while (iterator.hasNext()) {
					Person element = iterator.next();
					
					if (ID.equals(element.getId())) {
						iterator.remove();
						found = true;
						break;
					}  
				}
				if(!found)
				System.out.println(ID + "가 존재하지않습니다");
			}
			if (strn == 3) {
				for (Person element : set) {
					System.out.println(element);
				}
			}
			if (strn == 4) {
				run = false;
			}
		}

	}
}
