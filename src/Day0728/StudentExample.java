package Day0728;

import java.util.Arrays;
import java.util.Scanner;

public class StudentExample {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수 입력: ");
		int count = sc.nextInt();
		
		Student student[] = new Student[count];
		
		for(int i=0;i<student.length;i++) {
			System.out.print(i+1+" 번째이름 ");
			String name = sc.next();
			System.out.print(i+1+"번째 학생 나이");
			int age = sc.nextInt();
			student[i] = new Student(name,age);
		}
		
		
		Arrays.sort(student);
		
		
		System.out.println("가나다순 정렬");
		System.out.println(Arrays.toString(student));
		sc.close();
	}
}
