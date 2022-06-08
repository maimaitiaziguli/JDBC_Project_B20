package day1;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class TestConnection {


    public static void main(String[] args) throws SQLException {

        // REPLACE THIS IP ADDRESS WITH YOUR OWN THAT WORKING IN SQL DEVELOPER
        // Make sure do not delete @ in front of it
        String connectionStr = "jdbc:oracle:thin:@54.172.251.212:1521:XE";
        String username = "hr" ;
        String password = "hr" ;

        Connection conn = DriverManager.getConnection(connectionStr,username,password) ;

        Statement stmnt = conn.createStatement();

        ResultSet rs   =   stmnt.executeQuery("SELECT * FROM REGIONS") ;
        // this will move the cursor from beforefirst location to first row
        rs.next(); // currently we are at the very first row
        // rs.getString(column index) can be used to read the data of that column in current row
        System.out.println("first column value using index: --> " +  rs.getString(1)   );
    }
}
