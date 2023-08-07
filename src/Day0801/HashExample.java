package Day0801;

import java.util.HashSet;
import java.util.Set;

public class HashExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("JDBC");
		set.add("JSP");
		set.add("s-java");
		set.add("SPring");
		
		int size = set.size();
		System.out.println("총 객체 수: "+size);
	}

}
