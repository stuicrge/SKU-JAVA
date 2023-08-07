package Day0731;

public class CD {
	String registerNo;
	String title;
	// 생성자 정의(관리번호, 제목)
	
	public CD (String registerNo, String title) {
		this.registerNo = registerNo;
		this.title = title;
	}

	public String getRegisterNo() {
		return registerNo;
	}

	public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
