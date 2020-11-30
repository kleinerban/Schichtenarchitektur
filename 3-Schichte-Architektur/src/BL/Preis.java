package BL;

import java.sql.SQLException;

import DAL.Driver;

public class Preis {
	public static double Netto; 
	public static double Brutto;
	public static String x;
	
	public static double PreisBerechnenPfanne() throws SQLException {
		x = "Pfanne";
		Netto = Driver.Verbindung();
		Brutto = Netto * 1.19;
		return Brutto;
	}
	
	public static double PreisBerechnenTopf() throws SQLException {
		x = "Topf"; 
		Netto = Driver.Verbindung();
		Brutto = Netto * 1.19; 
		return Brutto;		
	}
	
	public static double PreisBerechnenMesser() throws SQLException {
		x = "Messer";
		Netto = Driver.Verbindung();
		Brutto = Netto * 1.19; 
		return Brutto;
	}
}
