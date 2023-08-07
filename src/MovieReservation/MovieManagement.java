package MovieReservation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MovieManagement {
   
   public static void addMovie() {
      Connection conn = dbconn.makeConnection();
      Scanner sc = new Scanner(System.in);

      if (conn == null) {
         System.out.println("DB 연결이 되지 않음");
         return ;
      }
      String mTitle, mGenre, mRunningTime, mNation, mSummary, mSeats, mStartTime;
        String sql = "insert into Movie(mTitle, mGenre, mRunningTime, mNation, mSummary, mSeats, mStartTime) values(?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt  = null;
       
        try {
            pstmt = conn.prepareStatement(sql);
            System.out.println("**영화 추가**");

            System.out.print("영화 제목 : ");
            mTitle = sc.nextLine();
            System.out.print("영화 장르 : ");
            mGenre = sc.nextLine();
            System.out.print("영화 러닝타임 : ");
            mRunningTime = sc.nextLine();
            System.out.print("영화 국가 : ");
            mNation = sc.nextLine();
            System.out.print("영화 줄거리 : ");
            mSummary = sc.nextLine();
            System.out.print("영화 시작시간 : ");
            mStartTime =sc.nextLine();
            
            Movie newMovie=new Movie(mTitle, mGenre, mRunningTime, mNation, mSummary, mStartTime ) ;  
            mSeats=newMovie.getmSeats();
            
            pstmt.setString(1, mTitle);   //setDouble():실수, setTimeStamp():날짜
            pstmt.setString(2, mGenre);
            pstmt.setString(3, mRunningTime);
            pstmt.setString(4, mNation);
            pstmt.setString(5, mSummary);
            pstmt.setString(6, mSeats);
            pstmt.setString(7, mStartTime);
           
           pstmt.executeUpdate();
            System.out.println(mTitle + "영화가 추가되었습니다.");
            System.out.println();
            //con.commit();            
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                pstmt.close();
                conn.close();
            }catch (Exception e) {}
        }   

   }
   
   public static void Delete() {
         Connection conn = dbconn.makeConnection();
         if (conn == null) {
            System.out.println("DB 연결 되지 않음");
            return;
         }
         String sql = "delete FROM movie where mTitle = ?";
         PreparedStatement pstmt = null;

         try {
            Scanner sc = new Scanner(System.in);
            String mTitle = "";
            boolean movieExists = true;
            while (movieExists) {
               System.out.println("영화 제목 입력: ");
               mTitle = sc.next();

               if (isMovieExists(conn, mTitle)) {
                  movieExists = false;
               } else {
                  System.out.println("존재하지 않는 제목입니다. 다시 입력해주세요.");
                  System.out.println();
               }
            }

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, mTitle);

            pstmt.executeUpdate();
            System.out.println("삭제 완료");
            System.out.println();

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

      private static boolean isMovieExists(Connection conn, String mTitle) {
         String query = "SELECT mTitle FROM movie WHERE mTitle = ?";
         PreparedStatement pstmt = null;
         ResultSet rs = null;
         try {
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, mTitle);
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