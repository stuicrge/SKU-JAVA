package Day0802;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class StudentHashExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		HashMap<Student, String> stus = new HashMap<>();

		boolean run = true;

		while (run) {

			System.out.println("1.추가 2.조회 3.삭제 4.전체출력 4.종료");
			System.out.println("선택하시오>>");
			int strn = sc.nextInt();

			switch (strn) {

			case 1:
				insert(stus);
				break;
			case 2:
				search(stus);
				break;
			case 3:
				removes(stus);
				break;
			case 4:
				list(stus);
				break;
			case 5:
				run = false;
			}

		}

	}

	public static void insert(HashMap<Student, String> stus) {

		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하시오: ");
		String n = sc.next();
		sc.nextLine();
		System.out.print("전화번호 입력하시오: ");
		String t = sc.next();
		sc.nextLine();
		System.out.print("학과를 입력하시오: ");
		String de = sc.nextLine();
		Student s = new Student(n, t);
		stus.put(s, de);

	}

	public static void search(HashMap<Student, String> stus) {

		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하시오: ");
		String n = sc.nextLine();

		Set<Entry<Student, String>> entrySet = stus.entrySet();
		Iterator<Entry<Student, String>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {

			Entry<Student, String> entry = entryIterator.next();
			Student name = entry.getKey();
			String tel = entry.getValue();
			if (n.equals(name.getName())) {
				System.out.println("이름: " + name.getName());
				System.out.println("전화번호: " + name.getTel()); // Print the value for 't'
				System.out.println("학과: " + stus.get(name));

			}
		}
	}

	public static void removes(HashMap<Student, String> stus) {

		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하시오: ");
		String n = sc.nextLine();

		Set<Entry<Student, String>> entrySet = stus.entrySet();
		Iterator<Entry<Student, String>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Entry<Student, String> entry = entryIterator.next();
			Student name = entry.getKey();
			n = entry.getValue();
			if (n.equals(name.getName())) {
				stus.remove(name);
			}
		}
	}

	public static void list(HashMap<Student, String> stus) {

		Set<Entry<Student, String>> entrySet = stus.entrySet();
		Iterator<Entry<Student, String>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {

			Entry<Student, String> entry = entryIterator.next();
			Student name = entry.getKey();
			// String n = entry.getValue();
			String t = entry.getValue();
			String de = entry.getValue();

			System.out.println(name + t + de);

		}
	}

}
