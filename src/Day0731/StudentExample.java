package Day0731;

import java.util.HashSet;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<ex05Student> hashSet = new HashSet<ex05Student>();

		hashSet.add(new ex05Student("1"));
		hashSet.add(new ex05Student("1"));
		hashSet.add(new ex05Student("2"));

		System.out.println("저장된 Student 수: " + hashSet.size());
	}

}
