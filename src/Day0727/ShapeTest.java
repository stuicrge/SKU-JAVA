package Day0727;

import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Shape[] shapeArray = new Shape[3];// 추상 클래스 배열 선언.

		double w, h, ar, r;

		System.out.print("사각형의 가로 입력: ");
		w = sc.nextDouble();

		System.out.print("사각형의 세로 입력: ");
		h = sc.nextDouble();

		shapeArray[0] = new Rectangle(w, h);

		System.out.print("삼각형의 가로 입력: ");
		w = sc.nextDouble();

		System.out.print("삼각형의 세로 입력: ");
		h = sc.nextDouble();

		shapeArray[1] = new Triangle(w, h);

		System.out.print("원의 넓이: ");
		r = sc.nextDouble();

		shapeArray[2] = new Circle(r);

		for (Shape s : shapeArray) {
			System.out.printf("\n%.1f", s.getArea());
		}
		// 출력하기
		sc.close();

	}

}
