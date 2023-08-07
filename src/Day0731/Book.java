package Day0731;

public class Book implements Lendable {

	private String requestNo; // 청구번호
	private String bookTitle; // 제목
	private String writer; // 저자
	String borrower; // 대출인
	String checkOutDate; // 대출일
	int state; // 대출상태 빌리는중이면 1 아니면 0

	public Book(String requestNo, String bookTitle, String writer) {
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}

	public String getRequestNo() {
		return requestNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getBorrower() {
		return borrower;
	}

	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	@Override
	public void checkOut(String borrower, String checkOutDate) {
		// TODO Auto-generated method stub
		System.out.println("대출되었습니다.");
		System.out.println("책제목: " + bookTitle);
		System.out.println("책제목: " + borrower);
		System.out.println("책제목: " + checkOutDate);

	}

	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("반납되었습니다.");
		System.out.println("첵제목: " + bookTitle);
	}

}
