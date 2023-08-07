package MovieReservation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

//로그인
public class LoginService {
	public static String Login() {
		Scanner sc = new Scanner(System.in);
		String id = null;
		String password;

		Connection conn = dbconn.makeConnection();
		if (conn == null) {
			System.out.println("DB 연결이 되지 않음");
			return null;
		}

		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			while (true) {
				System.out.println("로그인할 아이디와 비번을 입력하세요.");

				System.out.print("id : ");
				id = sc.next();
				System.out.print("password : ");
				password = sc.next();

				String sql = "select * from person where pId = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, id);
				rs = pstmt.executeQuery();

				if (rs.next()) {
					if (password.equals(rs.getString("pPassword"))) {
						System.out.println(rs.getString("pName") + "님 환영합니다.");
						System.out.println();
						break;
					} else {
						System.out.println("로그인에 실패했습니다.");
						System.out.println();
					}
				} else {
					System.out.println("로그인에 실패했습니다.");
					System.out.println();
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				pstmt.close();
				conn.close();
				rs.close();
			} catch (Exception e) {
			}
		}
		return id;
	}
	//매니저 아이디인지 확인
	public static boolean isManager(String pId) {
		Connection conn = dbconn.makeConnection();
		if (conn == null) {
			System.out.println("DB 연결이 되지 않음");
			return false;
		}

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean isManager = false;

		try {
			String sql = "SELECT pPosition FROM person WHERE pId = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pId);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				String pPosition = rs.getString("pPosition");
				isManager = pPosition != null && pPosition.equalsIgnoreCase("y");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				conn.close();
			} catch (Exception e) {
			}
		}

		return isManager;
	}

}