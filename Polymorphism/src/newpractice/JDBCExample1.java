package newpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


//1.Create a connection
//2.create a query/statement
//3.Execute statement/query
//4.Close connection
public class JDBCExample1 {

	public static void main(String[] args) throws SQLException {
		//create connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl","hr","hr");
		// create a query/statement
		Statement stmt = con.createStatement();
		String s = "insert into student values(101,'Scott')";
		// execute the statement/query
		stmt.executeQuery(s);
		
		// close connection
		con.close();
		System.out.println("Program is completed");

	}

}
