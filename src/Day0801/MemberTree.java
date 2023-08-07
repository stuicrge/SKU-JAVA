package Day0801;

public class MemberTree implements Comparable<MemberTree>{
	
	String name;
	int age;
	
	public MemberTree(String name,int age) {
		this.name = name;
		this.age = age;
		
	}
	

    @Override
    public int compareTo(MemberTree other) {
        // 나이에 따라 정렬하기 위해 비교 로직 구현
        return Integer.compare(this.age, other.age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Member)) return false;
        Member other = (Member) obj;
        return this.age == other.age && this.name.equals(other.name);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	
}	
