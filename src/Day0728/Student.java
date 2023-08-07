package Day0728;

public class Student implements Comparable<Student>{

	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	
	@Override 
	public int compareTo(Student s) {
		return this.name.compareTo(s.name);
		
	}
	@Override
	public String toString() {
		return name;
	}
	
	
}
