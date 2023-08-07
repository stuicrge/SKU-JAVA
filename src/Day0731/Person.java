package Day0731;

public class Person implements Comparable<Person>{

	
	private String name;
	private int height;
	
	public Person(String name, int height) {
		this.name = name;
		this.height =height;
	}
	
	
	@Override
	public int compareTo(Person p) {
		
		
		return p.height-this.height;
	
	}
	@Override
	public String toString() {
		return name + " " + height;
	}
	
}
