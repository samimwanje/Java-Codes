
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JDBC {
	
	public static void main(String[] args) throws SQLException {


	String url = "jdbc:mysql://localhost:3306/reddit?useUnicode=true&characterEncoding=UTF-8";
	String username = "root";					// Set MySQL server username.
	String password = "root";					// Set MySQL server password.

	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
				
	}catch(ClassNotFoundException e) {
		
		
		e.printStackTrace();
	}
	
	BufferedReader br = null;
    JSONParser parser = new JSONParser();
	
	long startTime; 
	long endTime;
	long totalTime;
	
	try {
		
		Connection conn = DriverManager.getConnection(url, username, password);
		Statement st = conn.createStatement(); 
		
		try {

	        String currentJsonLine;

	        br = new BufferedReader(new FileReader("RC_2007-10.json"));
  
	        System.out.println("Importing data to " +url+"...");
	        startTime = System.currentTimeMillis();
	        while ((currentJsonLine = br.readLine()) != null) {
	           // System.out.println("Record:\t" + sCurrentLine);

	            Object obj;
	            try {
	                obj = parser.parse(currentJsonLine);
	                JSONObject jsonObject = (JSONObject) obj;
	                
	                String author = (String)jsonObject.get("author");
	                String body = ((String)jsonObject.get("body")).replace("'", "''").replace("\\", "\\\\"); // Fix special caracter error before importing to table..
	                String subreddit = (String)jsonObject.get("subreddit");

	                //******** For the autor table.
	                st.addBatch("INSERT IGNORE INTO author VALUES ("+"'"+author +"')" ); // Insert author name tuple into table.
	   
	                //******** For the comment table.
	                
	                st.addBatch("INSERT IGNORE INTO comment VALUES ("
	                		
	                		+"'"+(String)jsonObject.get("id")+"',"
	                		+"'"+(String) jsonObject.get("name")+"',"
	                		+"'" +body+"',"
	                		+"'"+jsonObject.get("score")+"',"
	                		+"'"+jsonObject.get("created_utc")+"',"
	                		+"'" +(String) jsonObject.get("parent_id") +"',"
	                		+"'" +author + "'," 
	                		+"'"+subreddit +"'"
	                		+")"
	                		
	                			); 
	                
	                // For the Subreddit table.    
	                st.addBatch("INSERT IGNORE INTO subreddit VALUES ("+"'"+(String)jsonObject.get("subreddit_id")+"',"+"'"+subreddit +"')" ); 							// Insert author name tuple into table.
	                 

	            } catch (ParseException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	        }
	        st.executeBatch();
	        endTime = System.currentTimeMillis();
	        System.out.println("Timer stopped");
	        System.out.println("------------------------------");
	        totalTime = endTime - startTime;
	        System.out.println("Timelapsed: " +totalTime +" ms");
	        System.out.println("Timelapsed: " +totalTime/(float)1000 +" s");

	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (br != null)br.close();
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	    }
		
		
		
		
		}
		catch(SQLException e) {
	
			e.printStackTrace();
	
		}
	
	}
	
}
