package Day0718;

import java.util.Scanner;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 비트 연산자 이용하여 AND, OR, XOR 의 결과 출력
		
		 Scanner sc = new Scanner(System.in);

		 System.out.println("P\tQ\tAND\tOR\tXOR");
		 printTruthTable(true,true);
		 printTruthTable(true,false);
		 printTruthTable(false,true);
		 printTruthTable(false,false);
	
		
	}

	private static void printTruthTable(boolean P, boolean Q) {
// TODO Auto-generated method stub
		System.out.println(P + "\t"+Q+"\t"+(P&&Q)+"\t"+(P||Q)+"\t"+(P^Q)+"\t");
	}
}
