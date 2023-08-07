package MovieReservation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class ReservationService {
	private Connection con;

	public ReservationService() {
		this.con = dbconn.makeConnection();	// db 연결
	}
	
	public void printReservation(String pId) {
		String sql="SELECT * FROM reservation where rPerson=? ";
		PreparedStatement pstmt=null;
		ResultSet rs=null;

		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, pId); 
			rs=pstmt.executeQuery();
			System.out.println();
			System.out.println(pId+"님의 예매내역");
			System.out.println("------------------------");

			while(rs.next()) {
				String rNumber=rs.getString("rNumber");
				String rStartTime=rs.getString("rStartTime");
				String rSeatNum=rs.getString("rSeatNum");
				String rMovie=rs.getString("rMovie");
				System.out.println("예매번호 : "+rNumber);
				System.out.println("영화 시작시간 : "+rStartTime);
				System.out.println("예매한 좌석번호 : "+rSeatNum);
				System.out.println("영화 제목 : "+rMovie);
				System.out.println("------------------------");


			}
		}catch(Exception e) {
            System.out.println(e.getMessage());
         }finally {
            try {

               pstmt.close();
               rs.close();
            }catch(Exception e) {}

         }

	}
	public void printMovieList() {
		String sql="SELECT * FROM MOVIE ";
		PreparedStatement pstmt=null;
		ResultSet rs=null;

		try {
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();

			while(rs.next()) {
				String mTitle=rs.getString("mTitle");
	            String mGenre=rs.getString("mGenre");
	            String mStartTime=rs.getString("mStartTime");
	            String mRunningTime=rs.getString("mRunningTime");
	            String mNation=rs.getString("mNation");
	            String mSummary=rs.getString("mSummary");
	            System.out.println("영화제목 : "+mTitle);
	            System.out.println("장르 : "+mGenre);
	            System.out.println("시작 시간 : "+mStartTime);
	            System.out.println("러닝타임 : "+mRunningTime);
	            System.out.println("국가 : "+mNation);
	            System.out.println("줄거리 : "+mSummary);
	            System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");

			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {

				pstmt.close();
				rs.close();
			}catch(Exception e) {}

		}
	}
	public void reservMovie(String pId) {	// 예약 테이블에 추가

		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("==============영화예매===============");
		System.out.println("\t영화표를 예매하겠습니다.");
		System.out.println();

		System.out.println("\t** 영화리스트 출력 **");
		printMovieList();

		System.out.println();
		System.out.println("예매할 영화의 제목을 입력해주세요. : ");
		String rMovie = sc.nextLine();
		selectAllMethod(rMovie);

		//System.out.println("\n\nA1 \t A2 \t A3 \nA4 \t A5 \t B1  \t \nB2 \t B3 \t B4 \t B5");
		System.out.println("======================================");
		System.out.println("예매할 좌석의 번호를 입력해주세요 : ");
		String rSeatNum = sc.nextLine();

		// 예매할 영화의 좌석이 이미 예약된 좌석인지 확인하는 함수 호출
		int checkReserv = isReservExists(rMovie, rSeatNum);
		if(checkReserv == 1) {	// 리턴 값이 1이면 이미 예약된 좌석이므로
			System.out.println("이미 예약된 좌석으로 예매할 수 없습니다. T^T");

			selectAllMethod(rMovie);

			return;	// 예매 종료
		}


		// 예약 가능한 좌석이라면 
		updateSeats(rMovie, rSeatNum);
		String rStartTime = findMovieStartTime(rMovie);	// 영화 시작 시간  받아옴.
		//int rNumber = currentReservNum();	// 현재 예약 테이블의 예약 번호 마지막 값을 가져옴.

		String sql = "INSERT INTO Reservation ( rStartTime, rSeatNum, rPerson, rMovie)"
				+ " VALUES  ( ?, ?, ?, ?)";		// person 변경 필요(로그인 기능 하고 회원 아이디 받아올 값 임의로 넣어둠)

		try {
			PreparedStatement pstmt  = con.prepareStatement(sql);
			pstmt.setString(1, rStartTime); 
			pstmt.setString(2, rSeatNum); 
			pstmt.setString(3, pId); 
			pstmt.setString(4, rMovie); 
			pstmt.executeUpdate();

			System.out.println("예약 완료 되었습니다.");
			System.out.println("=====================================");

			pstmt.close();

		} catch (SQLException e) {
			System.out.println("reservMovie error");
			e.printStackTrace();
		}
	}



	public String findMovieStartTime(String mTitle) {	// 영화 시작 시간 값 반환
		//System.out.println(mTitle);
		String sql = "SELECT mStartTime FROM movie WHERE mTitle = ?";	// movie 테이블에서 영화 시작 시간 검색
		String mStartTime = "";	// 영화 시작 시작

		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mTitle);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				mStartTime = rs.getString("mStartTime");
			}

			//System.out.println(mStartTime);
			rs.close();
			pstmt.close();

		}catch (SQLException e) {
			System.out.println("findMovieStartTime error");
		}

		return mStartTime;		
	}

	public int isReservExists(String rMovie, String rSeatNum){	// 이미 예약된 좌석인지 확인 하는 메소드.
		String sql = "SELECT count(*) FROM reservation WHERE rMovie = ? and rSeatNum = ?";	// 테이블 행의 개수 반환
		int count = 0;

		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, rMovie);
			pstmt.setString(2, rSeatNum);
			ResultSet rs = pstmt.executeQuery();

			while(rs.next()) {
				count = rs.getInt(1);
			}

			rs.close();
			pstmt.close();

		}catch (SQLException e) {
			System.out.println("isReservExists error");
		}

		return count;
	}



	public void updateSeats(String mTitle, String rSeat) {
		String sql1 = "select mSeats from movie where mTitle = ? ";
		String sql2 = "update movie set mSeats = ? where mTitle = ? ";
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		ResultSet rs=null;
		try {
			pstmt1=con.prepareStatement(sql1);
			pstmt1.setString(1, mTitle);
			rs=pstmt1.executeQuery();
			String mSeats=null;
			if(rs.next()) {
				mSeats=rs.getString("mSeats");
				mSeats=mSeats.replace(rSeat, "");
				try {
					pstmt2 = con.prepareStatement(sql2);


					pstmt2.setString(1, mSeats);  
					pstmt2.setString(2, mTitle);
					pstmt2.executeUpdate();

					//System.out.println(" 수정되었음.");            
				}catch (Exception e) {System.out.println(e.getMessage());

				}finally {
					try {
						pstmt2.close();
					}catch (Exception e) {}            
				}
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try { 
				pstmt1.close();
				rs.close();
			}catch (Exception e) { }
		} 


	}



	public void selectAllMethod(String rMovie) {
		Connection con = dbconn.makeConnection();
		if (con == null) {
			System.out.println("DB연결이 되지 않음");
			return;
		}

		System.out.println();
		String sql = "SELECT *  FROM MOVIE Where mTitle=?";
		String mTitle = rMovie;
		PreparedStatement pstmt = null;
		ResultSet rs = null; // 관계형DB인 mysql,오라클. DB의 데이터를 한 행씩 가져올 때 사용. 포인터 커서처럼 아래로 이동하면서 가져옴.

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mTitle);
			rs = pstmt.executeQuery(); // select문만 executeQuery로 실행.
			while (rs.next()) {
				String mSeats = rs.getString("mSeats");
				for(int i=0; i<mSeats.length(); i+=2) {
					System.out.print(mSeats.charAt(i)+""+mSeats.charAt(i+1)+" ");
				}
				System.out.println();
			}    
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try { 
				pstmt.close();
				rs.close();
			}catch (Exception e) { }
		}
	}

}
