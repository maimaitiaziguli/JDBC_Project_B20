package day1;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class TestConnection {


    public static void main(String[] args) throws SQLException {

        // Important Interview Question -->
        // How do you connect your JAVA (IDE) to Database ? The Answer is Below:
   /*
        I use JDBC to connect to Database.
        1. I use CONNECTION INTERFACE to make a connection.
              Connection conn = DriverManager.getConnection(connectionStr,username,password)
              String connectionStr = "jdbc:oracle:thin:@54.172.251.212:1521:XE"; --> This is the URL
              String username = "hr" ; --> username
              String password = "hr" ; --> password
        2. Then I use STATEMENT INTERFACE create a statement.
               Statement stmnt = conn.createStatement();
           Then I execute a QUERY to get the result.
        3. Then I use ResultSet INTERFACE to store the result.
                ResultSet rs = stmnt.executeQuery("SELECT * FROM REGIONS") ;

         This how i connect my IDE to Database.
         Usually we create a method to connect our class to database (if not we have
         to write the whole code to connect for every class)
   */

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
        System.out.println("second column value using index: --> " +  rs.getString(2)   );

        //  rs.getString(column LABEL)
        System.out.println("Region_ID at this row is : " + rs.getString("REGION_ID") );
        System.out.println("Region_Name at this row is : " + rs.getString("REGION_NAME") );

        rs.next() ; // this will move us to next row so we can read next row
        System.out.println("Region_ID at this row is : " + rs.getString("REGION_ID") );
        System.out.println("Region_Name at this row is : " + rs.getString("REGION_NAME") );


        rs.next() ; // this will move us to next row so we can read next row
        System.out.println("Region_ID at this row is : " + rs.getString("REGION_ID") );
        System.out.println("Region_Name at this row is : " + rs.getString("REGION_NAME") );


        rs.next() ; // this will move us to next row so we can read next row
        System.out.println("Region_ID at this row is : " + rs.getString("REGION_ID") );
        System.out.println("Region_Name at this row is : " + rs.getString("REGION_NAME") );


    }
}
