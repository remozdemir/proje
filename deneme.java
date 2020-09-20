import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

import java.sql.Connection;


public class deneme {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/dbtest?autoReconnect=true&useSSL=false";
		String username = "root";
		String password = "";
		
		
		try {
			Connection con= DriverManager.getConnection(url, username, password);
			System.out.println("Baðlantý baþarýlý");
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from variable");
			
			while(rs.next()) {
				System.out.println(rs.getString("rowid"));
			}
					
			
		}
			
		catch(SQLException e){
			System.out.println("Hata");
			e.printStackTrace();
		
		}
	}

}
