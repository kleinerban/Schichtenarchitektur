package DAL;

	import java.sql.*;

import BL.Preis;

public class Driver {
	
	public static double Verbindung() throws SQLException {
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/artikel", "root", "root");
			Statement myStmt = myConn.createStatement();
			String sql = "select * from artikel where Artikelname = " + "'" + Preis.x + "'";
			ResultSet myRs = myStmt.executeQuery(sql);
			if (myRs.next()) {return myRs.getDouble("Preis");} 
			return myRs.getDouble("Preis");
			//while (myRs.next()) {System.out.println(myRs.getInt("Preis") + " " + "EUR");}
		}
}