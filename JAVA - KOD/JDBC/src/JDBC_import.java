
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC_import {
	
	public static void main(String[] args) throws SQLException {


	String url = "jdbc:mysql://localhost:3306/redditnocons?useUnicode=true&characterEncoding=UTF-8";
	String username = "root";					// Set MySQL server username.
	String password = "root";					// Set MySQL server password.

	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
				
	}catch(ClassNotFoundException e) {
		
		
		e.printStackTrace();
	}
	

	
	try {
		
		Connection conn = DriverManager.getConnection(url, username, password);
		Statement st = conn.createStatement(); 
		
		ResultSet rs = st.executeQuery(
			
				" (SELECT SUM(c_score) AS SCORE, c_user"+
						"FROM comment"
						+"GROUP BY c_user"
						+"ORDER BY  SCORE DESC"
						+"LIMIT 1)"
						+"UNION "
						+"(SELECT SUM(c_score) AS SCORE, c_user"
						+"FROM redditnocons.COMMENT"
						+"GROUP BY c_user"
						+"ORDER BY  SCORE ASC"
						+"LIMIT 1)"
				
				); 
		
		while ( rs.next() ) {
            String result = rs.getString("score");
            System.out.println(result);
        }
		conn.close();
		
		}
		catch(SQLException e) {
	
			e.printStackTrace();
	
		}
	
	}
	
}
