package MovieReservation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconn {
	public static Connection makeConnection() {        
   
        String url = "jdbc:mysql://localhost:3306/moviereservation";
        String id = "root";
        String password = "jaehoon1106@";
        Connection con = null;
               
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, id, password);
            //System.out.println("데이터베이스 연결 성공");
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버를 찾을 수 없습니다.");
        } catch (SQLException e) {
            System.out.println("연결에 실패하였습니다.");
        }        
        return con;
    }
}
