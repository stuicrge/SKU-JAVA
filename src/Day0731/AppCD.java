package Day0731;

public class AppCD extends CD implements Lendable{
	
	public AppCD(String registerNo, String title) {
		super(registerNo, title);
		// TODO Auto-generated constructor stub
	}
	String borrower;
	String checkOutDate;
	int state;
	
	
	@Override
	public void checkOut(String borrower, String checkOutDate) {
		// TODO Auto-generated method stub
		
		System.out.println("대출되었습니다.");
		System.out.println("CD제목: "+title);
		System.out.println("대출인: "+borrower);
		System.out.println("대출일자: "+checkOutDate);
	}
	
	@Override
	public void checkIn() {
		// TODO Auto-generated method stub
		System.out.println("반납되었습니다.");
		System.out.println("CD제목: "+title);
		
	}
}
