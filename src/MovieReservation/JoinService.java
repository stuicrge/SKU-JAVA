package MovieReservation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

//회원 가입
public class JoinService {
	public static void Join() {
		Connection conn = dbconn.makeConnection();
		if (conn == null) {
			System.out.println("DB 연결 되지 않음");
			return;
		}
		String sql = "insert into person(pId, pPassword, pName) values(?, ?, ?)";
		PreparedStatement pstmt = null;

		try {
			System.out.println("**회원 가입**");
			Scanner sc = new Scanner(System.in);
			boolean idExists = true;
			String pId = "";
			while (idExists) {
				System.out.println("id 입력: ");
				pId = sc.next();

				if (isIdExists(conn, pId)) {
					System.out.println("이미 사용 중인 ID입니다. 다른 ID를 입력해주세요.");
					System.out.println();
				} else {
					idExists = false;
				}
			}
			System.out.println("password 입력: ");
			String pPassword = sc.next();
			System.out.println("이름 입력: ");
			String pName = sc.next();
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pId);
			pstmt.setString(2, pPassword);
			pstmt.setString(3, pName);

			pstmt.executeUpdate();
			System.out.println("가입 완료");
			System.out.println();
			// con.commit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e) {
			}
		}

	}

	private static boolean isIdExists(Connection conn, String pId) {
		String query = "SELECT pId FROM person WHERE pId = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, pId);
			rs = pstmt.executeQuery();
			return rs.next();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e) {
			}
		}
	}

}
