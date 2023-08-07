package Day0718;

public class ThrowTheCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//동전 2개를 던져서 둘다 앞면이 나올때까지 몇 번 던졌나 구하기	
		
////////////////////////////////////////////////////////////////////////////

// 동전 2개
		int i = 0;
		while (true) {
			int num1 = (int) (Math.random() * 2) + 1;
			int num2 = (int) (Math.random() * 2) + 1;

			i++;
			if (num1 == 1 && num2 == 1)
				break;
		}
		System.out.println("던진횟수: " + i);
	
	}
}
