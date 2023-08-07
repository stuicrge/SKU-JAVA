package Day0802;

public class Student implements Comparable <Student>{

	String name;
	String tel;
//	String dept;
	
	public Student(String name, String tel) {
		this.name=name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return name + " " + tel + " " ;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}	
