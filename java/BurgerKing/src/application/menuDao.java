package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MenuDao {

   private Connection conn; // DB Ŀ�ؼ�(����) ��ü
   private static final String USERNAME = "root"; // DB���ӽ� ID
   private static final String PASSWORD = "1234"; // DB���ӽ� password
   // DB���� ���(��Ű��=�����ͺ��̽���)����
   private static final String URL = "jdbc:mysql://localhost/burgerking";

   private ObservableList<Menu> data = FXCollections.observableArrayList();

   public ObservableList<Menu> getData() {
      return data;
   }

   public MenuDao() {
      // connection��ü�� �����ؼ� DB�� ������
      try {
         // ���� ��ü�� �������
         Class.forName("com.mysql.jdbc.Driver");
         conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
         System.out.println("����̹� �ε� ����!!");
      } catch (Exception e) {
         e.printStackTrace();
         System.out.println("����̹� �ε� ����!!");
      }

   }

   // �޴��� �����ϸ� DB�޴����� �ҷ���
   public void menuSelect(String str) {

      PreparedStatement pstmt = null;
      ResultSet rs = null;
      String sql = "select id, name, cost from menu_tbl where id=" + str;

      try {

         pstmt = conn.prepareStatement(sql);
         rs = pstmt.executeQuery();

         // select�� ����� ResultSet�� ��� ���ϵȴ�.

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

   // TableView�� ���õ� �޴����� DB�� ������
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
