package Day0719;

public class Equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner sc = new Scanner(System.in);
		// 1차방정식 3x+10y=100을 만족하는 모든 해를 구하는 프로그램

		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if (3 * x + 10 * y == 100) {
					System.out.println("(" + x + "," + y + ")");
				}
			}

		}
	}
}
