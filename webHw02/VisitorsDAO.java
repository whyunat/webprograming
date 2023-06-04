package hw02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class VisitorsDAO {
	Connection conn = null;
	PreparedStatement pstmt;
	
	final String JDBC_DRIVER = "org.h2.Driver";
	final String JDBC_URL = "jdbc:h2:tcp://localhost/~/jwbookdb";
	
	public void open() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(JDBC_URL,"jwbook","1234");
		}catch (Exception e) {e.printStackTrace();}
	}
	
	public void close() {
		try {
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
			}
	}
	
	public void insert(Visitors v) {
		open();
		String sql =
				"INSERT INTO Visitors(username, email, mdy, title) values(?,?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, v.getUsername());
			pstmt.setString(2, v.getEmail());
			pstmt.setDate(3, v.getMdy());
			pstmt.setString(4, v.getTitle());
			
			pstmt.executeUpdate();
		} catch(Exception e) {e.printStackTrace();}
		  finally {close();}
	}
	
	public List<Visitors> getAll(){
		open();
		List<Visitors> students = new ArrayList<>();
		
		try {
			pstmt = conn.prepareStatement("select * from student");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Visitors v = new Visitors();
				v.setAid(rs.getInt("aid"));
				v.setUsername(rs.getString("username"));
				v.setEmail(rs.getString("email"));
				v.setMdy(rs.getDate("mdy"));
				v.setTitle(rs.getString("title"));
				
				visitors.add(v);
			}
		} catch (Exception e) {e.printStackTrace();}
		  finally {close();}
		return visitors;
	}
}
