package Day0731;

public class ex05Student {
	private String studentNum;

	public ex05Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;

	}

	@Override
	public int hashCode() {
		int hashCode = studentNum.hashCode();
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ex05Student target) {
			if (studentNum.equals(target.getStudentNum())) {
				return true;
			}
		}
		return false;
	}
}
