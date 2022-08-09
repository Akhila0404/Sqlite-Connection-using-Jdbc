package PackageSqlite;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlliteDemo {

	public static void main(String[] args) throws ClassNotFoundException {
        try {
   
        	Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:C:\\sqlite\\test.db";
            java.sql.Connection conn = DriverManager.getConnection(url);
            Statement stmt  = (Statement) conn.createStatement();
            ResultSet rs    = ((java.sql.Statement) stmt).executeQuery("select * from movies");
          
           while (rs.next()) {
               System.out.println(rs.getString("name") + "\t" + rs.getString("actor") + "\t" +
            		   rs.getString("actress") + "\t" + rs.getString("director") + "\t" + rs.getInt("year"));
           }
                        
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        } 

	}

}

