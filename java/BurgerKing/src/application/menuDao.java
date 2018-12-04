package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MenuDao {

   private Connection conn; // DB 커넥션(연결) 객체
   private static final String USERNAME = "root"; // DB접속시 ID
   private static final String PASSWORD = "1234"; // DB접속시 password
   // DB접속 경로(스키마=데이터베이스명)설정
   private static final String URL = "jdbc:mysql://localhost/burgerking";

   private ObservableList<Menu> data = FXCollections.observableArrayList();

   public ObservableList<Menu> getData() {
      return data;
   }

   public MenuDao() {
      // connection객체를 생성해서 DB에 연결함
      try {
         // 동적 객체르 만들어줌
         Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
         System.out.println("드라이버 로딩 성공!!");
      } catch (Exception e) {
         e.printStackTrace();
         System.out.println("드라이버 로드 실패!!");
      }

   }

   // 메뉴를 선택하면 DB메뉴에서 불러옴
   public void menuSelect(String str) {

      PreparedStatement pstmt = null;
      ResultSet rs = null;
      String sql = "select id, name, cost from menu_tbl where id=" + str;

      try {

         pstmt = conn.prepareStatement(sql);
         rs = pstmt.executeQuery();

         // select한 결과는 ResultSet에 담겨 리턴된다.

         while (rs.next()) {

            data.add(new Menu(rs.getString("id"), rs.getString("name"), rs.getString("cost")));

         }

      } catch (Exception e) {
         e.printStackTrace();
         System.out.println(e);
      } finally {
         try {
            if (rs != null) {
               rs.close();
            }
            if (pstmt != null) {
               pstmt.close();
            }

         } catch (Exception e2) {
            e2.printStackTrace();
         }
      }
      // return menu;

   }

   // TableView에 선택된 메뉴들을 DB에 저장함
   public void selectedMenu_Insert() {
      PreparedStatement pstmt = null;
      String sql = "insert into selected_tbl(name, cost) values(?,?)";

      try {
         pstmt = conn.prepareStatement(sql);

         for (int i = 0; i < data.size(); i++) {
            
        	String sname1 = String.valueOf(data.get(i).getName());
            String sname2 = String.valueOf(data.get(i).getCost());
            pstmt.setString(1, sname1);
            pstmt.setString(2, sname2);
            
            /*RootController rc=new RootController();
            pstmt.setString(3, rc.radioSelect());*/
            pstmt.executeUpdate();
         }

      } catch (Exception e) {
         e.printStackTrace();
         System.out.println(e);
      } finally {

      }
   }

}
