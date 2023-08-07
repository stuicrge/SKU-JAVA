package Day0720;

import java.util.Scanner;

public class UseMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main()에서 배열의 크기를 입력받아 배열 생성 후, 배열에 점수를 저장하는 메소드 getValue()와 평균을 구하는 getAverage(),
		//배열의 요소를 출력하는 printArray()을 작성
		
		if(args.length != 2) {
			System.out.println("프로그램 입력값이 부족");
			System.exit(0);
		}
		
		String strarr= args[0];
		int num = Integer.parseInt(strarr);
		int[] arr = new int[num];
		int score;
		
		getValue(arr, num);
		getAverage(arr, num);
		System.out.println(arr + ", " );	
		
		
		
	}
	
	public static void getValue(int[] arr, int num) {

		Scanner sc = new Scanner(System.in);
		System.out.print(num + "개의 점수를 입력하시오");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
	}

	public static void getAverage(int[] arr, int num) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int size = scan.nextInt();
		for (int i = 0; i < size; i++) {
			sum += i;
		}

		System.out.println("평균 : " + sum / size);
	}

	public static void printArray(int arr, int num) {
		for (int i = 0; i < num; i++)
			System.out.print(arr + " ");
	}
	
}
