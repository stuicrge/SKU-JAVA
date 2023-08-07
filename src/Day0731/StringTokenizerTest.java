package Day0731;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		System.out.print("입력하세요>");
		String data = sc.nextLine();
		int count =0;
		
		StringTokenizer st = new StringTokenizer(data, " ");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
			count++;
		}
		System.out.println(count);
	}

}
