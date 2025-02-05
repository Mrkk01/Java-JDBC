import java.sql.*;
import java.util.ArrayList;

public class DataBase {
   public void showDatabases() {
      try {
         String url = "jdbc:mysql://localhost:3306";
         String user = "root";
         String password = "Poojitha@16";
         Connection con = DriverManager.getConnection(url, user, password);
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery("Show Databases");
         System.out.println("Databases in the server are : ");
         while (rs.next()) {
            System.out.println(rs.getString(1));
         }
         con.close();
      } catch (Exception e) {
         e.printStackTrace();

      }
   }

   public void seeTable(String t_name) {
      try {
         String url = "jdbc:mysql://localhost/db_name";
         String user = "root";
         String password = "Poojitha@16";
         Connection con = DriverManager.getConnection(url, user, password);
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery("select * from " + t_name); 
         ArrayList list = new ArrayList<>();
         while (rs.next()) {
            list.add(rs.getInt(1));
            list.add(rs.getString(2));
         }
         System.out.println("Data in the table is : ");
         System.out.println(list);
         con.close();
      } catch (Exception e) {
         e.printStackTrace();

      }
   }

   public void showTables() {
      try {
         String url = "jdbc:mysql://localhost/db_name";
         String user = "root";
         String password = "Poojitha@16";
         Connection con = DriverManager.getConnection(url, user, password);
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery("show tables");
         System.out.println("Tables in the database are : ");
         while (rs.next()) {
            System.out.println(rs.getString(1));
         }
         con.close();
      } catch (Exception e) {
         e.printStackTrace();

      }
   }

   public void insert(String table_name, int id, String name) {

      try {
         String url = "jdbc:mysql://localhost/db_name";
         String user = "root";
         String password = "Poojitha@16";
         Connection con = DriverManager.getConnection(url, user, password);
         Statement st = con.createStatement();
         st.execute("insert into " + table_name + " values(" + id + "," + "'" + name + "'" + ")");
         con.close();
      } catch (Exception e) {
         e.printStackTrace();

      }
   }

   public void delete(String tableName, int id) {
      try {
         String url = "jdbc:mysql://localhost/db_name";
         String user = "root";
         String password = "Poojitha@16";
         Connection con = DriverManager.getConnection(url, user, password);
         Statement st = con.createStatement();
         st.execute("delete from " + tableName + " where id = " + id);
         con.close();
      } catch (Exception e) {
         e.printStackTrace();

      }
   }

   public void deleteTable(String table) {
      try {
         String url = "jdbc:mysql://localhost/db_name";
         String user = "root";
         String password = "Poojitha@16";
         Connection con = DriverManager.getConnection(url, user, password);
         Statement st = con.createStatement();
         st.execute("drop table " + table);
         con.close();
      } catch (Exception e) {
         e.printStackTrace();

      }
   }

   public void createTable(String tname) {
      try {
         String url = "jdbc:mysql://localhost/db_name";
         String user = "root";
         String password = "Poojitha@16";
         Connection con = DriverManager.getConnection(url, user, password);
         Statement st = con.createStatement();
         st.execute("create table " + tname + "(id int,name varchar(25))");
         con.close();
      } catch (Exception e) {
         e.printStackTrace();

      }
   }
}
