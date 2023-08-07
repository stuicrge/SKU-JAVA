package Day0724;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ECarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		List<ECar> list = new ArrayList<>();
		
		ECar car = new ECar();
		
		boolean run = true;
		
		while(run) {
			
			System.out.println("1.차 상태 2.주행 3.충전 4.종료");
			System.out.println("입력하시오>>");
			int strn = sc.nextInt();
			
			if(strn == 1) {
				car.dispDistance();
				car.dispBattery();
				break;
			} else if(strn == 2) {
				System.out.print("주행거리>>");
				int dis = sc.nextInt();
				if(dis*10-car.battery==0) {
					System.out.println("배터리가 부족합니다.");
					break;
				}else {
					for(int i=0;i<dis;i++) {
						car.charge();
						car.drive();
					}
					break;
				}
			}
			else if(strn==3) {
				System.out.println("충전이 완료되었습니다.");
				car.full_battery();
				break;
			}
			else if(strn == 4) {
				run = false;
			}
			
		}
		
		
		
		
	}

}
