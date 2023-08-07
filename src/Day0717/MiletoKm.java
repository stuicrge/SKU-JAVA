package Day0717;

import java.util.Scanner;

public class MiletoKm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//１．하나의　상자에　오렌지를　１０개씩　담을　수　있다．　오렌지가　１２７개　있다면　상자　몇
		// 개가　필요한가？　또　몇 개의　오렌지가　남을까？
		
		Scanner sc =new Scanner(System.in);
		
		double mile;
		double km;
		
		System.out.println("마일을 입력하시오: ");
		mile = sc.nextDouble();
		km=mile*1.609;
		System.out.println("1마일은 "+km+"km입니다");		
		

	}

}
