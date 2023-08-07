package Day0801;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TreeSet 컬렉션
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		//정렬된 integer 객체 하나씩 가져오기
		for(Integer s : scores) {
			System.out.print(s+" ");
		}
		System.out.println("\n");
		
		System.out.println("가장 낮은 점수: "+scores.first());
		System.out.println("가장 높은 점수: "+scores.last());
		System.out.println("95점 아래 점수: "+scores.lower(95));
		System.out.println("95점 위의 점수: "+scores.higher(95));
		System.out.println("95점이거나 그 아래점수: "+scores.floor(95));
		System.out.println("85점이거나 그 위의 점수: "+scores.ceiling(85));
		
		//내림차순 정리
		NavigableSet<Integer> descendingScores = scores.descendingSet();
		for(Integer s : descendingScores) {
			System.out.print(s+" ");
		}
		System.out.println("\n");
		//범위 검색
		NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
		for(Integer s : rangeSet) {
		}
			System.out.println("\n");
			
			rangeSet = scores.subSet(80, true,90,false);
			for(Integer s : rangeSet) {
				System.out.print(s+ " ");
			}
		
	}

}
