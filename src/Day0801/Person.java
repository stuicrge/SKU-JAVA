package Day0801;

public class Person {
	
	public String id;
	public String name;
	
	public Person (String id , String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + id.hashCode();
		
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override 
	public boolean equals(Object obj) {
		if(obj instanceof Person target) {
			return target.id.equals(id);
		} else {
			return false;
		}
	}
	

	@Override
	public String toString() {
		return  name+"회원님의 아이디는"+id+"입니다." ;
	}
	
}
