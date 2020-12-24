package model;

import java.sql.*;


public class DataConnection {
    private static Statement stat;
    
    public static Statement getStat() throws ClassNotFoundException, SQLException{
    	if(stat==null) init();
    	return stat;
    }
    private static void init() throws ClassNotFoundException, SQLException{
    	Class.forName("com.mysql.jdbc.Driver");
    	String url = "jdbc:mysql://localhost:3306/biqi" ; 
    	String name="root";
    	String pw = "1920170010";
    	Connection con = DriverManager.getConnection(url,name,pw);
    	stat = con.createStatement();
    }
}
