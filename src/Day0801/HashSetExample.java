package Day0801;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Set<Member> set = new HashSet<>();
		Set<String> set2 = new HashSet<String>();
		
		set.add(new Member("홍길동" , 30));
		set.add(new Member("홍길동" , 30));
		
		System.out.println("총 객체 수: "+set.size());
		
		set2.add("java");
		set2.add("JDBC");
		set2.add("JSP");
		set2.add("Spring");
		
		Iterator<String> iterator = set2.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
			if(element.equals("JSP")) {
				iterator.remove();
			}
			
		}
		System.out.println();
		set2.remove("JDBC");
		
		for(String element:set2) {
			System.out.println(element);
		}
	}

}
