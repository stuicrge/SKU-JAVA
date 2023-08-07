package MovieReservation;

public class Movie {
	String mTitle;
	String mGenre;
	String mRunningTime;
	String mNation;
	String mSummary;
	String mSeats;
	String mStartTime;
	
	
	public Movie(String mTitle, String mGenre, String mRunningTime, String mNation, String mSummary,
			String mStartTime) {
		super();
		this.mTitle = mTitle;
		this.mGenre = mGenre;
		this.mRunningTime = mRunningTime;
		this.mNation = mNation;
		this.mSummary = mSummary;
		this.mSeats ="A1A2A3A4A5B1B2B3B4B5";
		this.mStartTime = mStartTime;
	}
	
	public String getmTitle() {
		return mTitle;
	}
	public void setmTitle(String mTitle) {
		this.mTitle = mTitle;
	}
	public String getmGenre() {
		return mGenre;
	}
	public void setmGenre(String mGenre) {
		this.mGenre = mGenre;
	}
	public String getmRunningTime() {
		return mRunningTime;
	}
	public void setmRunningTime(String mRunningTime) {
		this.mRunningTime = mRunningTime;
	}
	public String getmNation() {
		return mNation;
	}
	public void setmNation(String mNation) {
		this.mNation = mNation;
	}
	public String getmSummary() {
		return mSummary;
	}
	public void setmSummary(String mSummary) {
		this.mSummary = mSummary;
	}
	public String getmSeats() {
		return mSeats;
	}
	public void setmSeats(String mSeats) {
		this.mSeats = mSeats;
	}
	public String getmStartTime() {
		return mStartTime;
	}
	public void setmStartTime(String mStartTime) {
		this.mStartTime = mStartTime;
	}

	
}