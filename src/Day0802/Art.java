package Day0802;

public class Art {

	String name;
	
	public Art(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	 public int hashCode() {
		return name.hashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Art target) {
			return name.equals(target.name);
		}
		return false;
	}
	
}
