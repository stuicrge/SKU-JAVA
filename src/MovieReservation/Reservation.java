package MovieReservation;

public class Reservation {
	private int rNumber;
	private String rStartTime;
	private String rSeatNum;
	private String rPerson;
	private String rMovie;
	
	public Reservation( String rStartTime, String rSeatNum, String rPerson, String rMovie) {
		super();
		this.rStartTime = rStartTime;
		this.rSeatNum = rSeatNum;
		this.rPerson = rPerson;
		this.rMovie = rMovie;
	}

	public int getrNumber() {
		return rNumber;
	}

	public String getrStartTime() {
		return rStartTime;
	}

	public void setrStartTime(String rStartTime) {
		this.rStartTime = rStartTime;
	}

	public String getrSeatNum() {
		return rSeatNum;
	}

	public void setrSeatNum(String rSeatNum) {
		this.rSeatNum = rSeatNum;
	}

	public String getrPerson() {
		return rPerson;
	}

	public void setrPerson(String rPerson) {
		this.rPerson = rPerson;
	}

	public String getrMovie() {
		return rMovie;
	}

	public void setrMovie(String rMovie) {
		this.rMovie = rMovie;
	}
	
	
}
