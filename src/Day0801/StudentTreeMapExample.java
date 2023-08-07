package Day0801;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class StudentTreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Map<String , String> map = new TreeMap<>();
		boolean run = true;
		
		while(run) {
			
			System.out.println("1.추가 2.조회 3.삭제 4.전체출력 4.종료");
			System.out.println("선택하시오>>");
			int strn  = sc.nextInt();
			
			if(strn == 1) {
				
				System.out.print("이름을 입력하세요>>");
				String n = sc.next();
				sc.nextLine();
				System.out.print("번호를 입력하세요>>");
				String t = sc.nextLine();
				
				String studentsName = new String(n);
				String studentsTel = new String(t);
				
				if(map.put(studentsName,studentsTel) != null) {
					System.out.println("추가했습니다");
					
				}else
					System.out.println("추가할 수 없습니다.");
				
			}
			else if(strn == 2) {
				System.out.print("입력하시오: ");
				String n = sc.next();
				boolean found = false;
				Set<String> keySet = map.keySet();
				Iterator<String> keyIterator = keySet.iterator();
				while(keyIterator.hasNext()) {
					String t = keyIterator.next();
					String N = map.get(t);
					if(n.equals(N)) {
						System.out.println(t+" "+N);
					}
					else
						System.out.println(N+"는 존재하지 않습니다");
				}
				
			}
			
		}
		
		
		
		
	}

}
