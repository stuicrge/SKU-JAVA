package MovieReservation;

public class Person {
	private String pId;
	private String pPassword;
	private String pName;
	private String pPosition;

	public Person(String pId, String pPassword, String pName, String pPosition) {
		super();
		this.pId = pId;
		this.pPassword = pPassword;
		this.pName = pName;
		this.pPosition = pPosition;
	}

	public String getpId() {
		return pId;
	}

	public void setpId(String pId) {
		this.pId = pId;
	}

	public String getpPassword() {
		return pPassword;
	}

	public void setpPassword(String pPassword) {
		this.pPassword = pPassword;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpPosition() {
		return pPosition;
	}

	public void setpPosition(String pPosition) {
		this.pPosition = pPosition;
	}

}