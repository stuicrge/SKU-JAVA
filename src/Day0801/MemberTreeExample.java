package Day0801;

import java.util.NavigableSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MemberTreeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	        Set<MemberTree> members = new TreeSet<>();

	        while (true) {
	            System.out.println("** 회원 관리 프로그램 **");
	            System.out.println("1. 가입     2. 검색     3. 탈퇴     4. 전체 출력     5. 종료");
	            System.out.print("메뉴를 선택하세요: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("이름을 입력하세요: ");
	                    String name = scanner.next();
	                    System.out.print("나이를 입력하세요: ");
	                    int age = scanner.nextInt();

	                    MemberTree newMember = new MemberTree(name, age);
	                    if (members.add(newMember)) {
	                        System.out.println("가입되었습니다.");
	                    } else {
	                        System.out.println("이미 가입된 회원입니다.");
	                    }
	                    break;

	                case 2:
	                    System.out.print("검색할 회원의 이름을 입력하세요: ");
	                    String searchName = scanner.next();

	                    boolean found = false;
	                    for (MemberTree member : members) {
	                        if (member.getName().equals(searchName)) {
	                            System.out.println("이름: " + member.getName() + ", 나이: " + member.getAge());
	                            found = true;
	                            break;
	                        }
	                    }
	                    if (!found) {
	                        System.out.println("해당 회원을 찾을 수 없습니다.");
	                    }
	                    break;

	                case 3:
	                    System.out.print("탈퇴할 회원의 이름을 입력하세요: ");
	                    String removeName = scanner.next();

	                    boolean removed = false;
	                    for (MemberTree member : members) {
	                        if (member.getName().equals(removeName)) {
	                            members.remove(member);
	                            System.out.println("탈퇴되었습니다.");
	                            removed = true;
	                            break;
	                        }
	                    }
	                    if (!removed) {
	                        System.out.println("해당 회원을 찾을 수 없습니다.");
	                    }
	                    break;

	                case 4:
	                    System.out.println("** 전체 회원 목록 **");
	                    for (MemberTree member : members) {
	                        System.out.println("이름: " + member.getName() + ", 나이: " + member.getAge());
	                    }
	                    break;

	                case 5:
	                    System.out.println("프로그램을 종료합니다.");
	                    scanner.close();
	                    System.exit(0);
	                    break;

	                default:
	                    System.out.println("잘못된 메뉴 선택입니다. 다시 선택하세요.");
	                    break;
	            }
	        }
		
	}
}
