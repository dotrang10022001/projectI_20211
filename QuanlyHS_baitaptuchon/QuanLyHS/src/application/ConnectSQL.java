package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectSQL {
	public static Connection getConnection(String strServer,String strDatabase) throws SQLException {
		Connection connection=null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connectionURL="jdbc:sqlserver://"+strServer+":1433;"
					+ "databaseName="+strDatabase+";integratedSecurity=true;";
			connection=DriverManager.getConnection(connectionURL, "sa", "123456");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}
    public static Connection getConnect() throws SQLException {
    	Connection conn = getConnection("LAPTOP-I53V7UHN","QUANLYHOCSINH");
		return conn;
    }
}
