package Day0731;
import java.util.Arrays;
import java.util.Scanner;
import Day0728.Student;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("학생 수 입력: ");
		int count = sc.nextInt();

		Person[] array = new Person[count];

		for (int i = 0; i < array.length; i++) {
			System.out.print(" 이름 ");
			String name = sc.next();
			System.out.print(" 키 ");
			int height = sc.nextInt();

			array[i] = new Person(name, height);
		}
		getMaximum(array);
	}

	public static void getMaximum(Person[] array) {

		Arrays.sort(array);
		System.out.println("제일 키가 큰사람: " + array[0]);

	}

}
