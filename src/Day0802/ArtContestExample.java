package Day0802;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArtContestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Art> art = new ArrayList<>();
		
		Art []participant = new Art[20];
		Art []completion = new Art[participant.length-1];
		
	}

	public static void getParticipant(List<Art> art) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("참가자를 입력하세요: ");
		String students = sc.nextLine();
		//art.add();
		
	}
	
	public static void getCompletion(List<Art> art) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("참가한 학생은: ");
		String parStudents = sc.nextLine();	
		art.add(new Art(parStudents));
	}
	
	public static void returnStudents(List<Art> art) {
		
		getParticipant(art);
		getCompletion(art);

		//if(art.contains))
		
		System.out.println("불참한 학생은: ");
		
		
	}
}
