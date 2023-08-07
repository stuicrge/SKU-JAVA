package Day0802;

public class StudentHashMap {
	
	String tel;
	String name;
	
	public StudentHashMap(String tel , String name) {
		
		this.tel = tel;
		this.name = name;
		
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode() + tel.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof StudentHashMap target) {
			return name.equals(target.name);
		}
		 return false;
	}
	
}
