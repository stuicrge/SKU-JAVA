package Day0802;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import Day0801.MemberTree;

public class StudentTreeExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		TreeMap<Student, String> stus = new TreeMap<>();

		boolean run = true;

		while (run) {

			System.out.println("1.추가 2.조회 3.삭제 4.전체출력 4.종료");
			System.out.println("선택하시오>>");
			int strn = sc.nextInt();

			switch (strn) {

			case 1:

			}

		}

	}

	public static void insert(TreeMap<Student, String> stus) {

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

	public static void search(TreeMap<Student, String> stus) {

		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하시오: ");
		String n = sc.nextLine();

		Set<Entry<Student, String>> entrySet = stus.entrySet();
		Iterator<Entry<Student, String>> entryIterator = entrySet.iterator();

	}

	public static void removes(TreeMap<Student, String> stus) {

		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하시오: ");
		String n = sc.nextLine();

		Set<Entry<Student, String>> entrySet = stus.entrySet();
		Iterator<Entry<Student, String>> entryIterator = entrySet.iterator();
	

	}
}
