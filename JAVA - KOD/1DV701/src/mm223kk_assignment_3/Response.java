package mm223kk_assignment_3;
// Import needed libraries.
import java.io.DataOutputStream;
import java.io.File;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.StringTokenizer;

/**
 * This class handles a response for the requests.
 * @author Sami Mwanje, mm223kk@student.lnu.se
 */
public class Response {

	private Socket socket;	// Current socket
	private File root;		// Current root
	private Errors Errors;	// Error handling class.

	Response(Socket socket, File root){
		this.socket = socket;
		this.root = root;
		this.Errors = new Errors(socket, root);
	}
	

/**
* This method is generates at response from a request.
* @param formatedLocation - The path that the browser requested.
*/
public void genResponse(StringTokenizer requestTokens) {
	 	String formatedLocation = formatePath(requestTokens.nextToken());
		try {	
		    byte[] requestedFile = null;																// Hold the requested file data in byes.
		    if(formatedLocation.contains("?") && formatedLocation.contains("="))
		    	formatedLocation = formatedLocation.substring(0,formatedLocation.indexOf("?"));
		    	    		
		    if(new File(root.getPath()+"\\"+formatedLocation).isDirectory())							// Check if location is a directory.
		    	formatedLocation += "\\index.html";	    												// Set response to index.html if it is a directory.
		    requestedFile = Files.readAllBytes(Paths.get(root.getPath()+"\\"+formatedLocation));		// Go to requested path.			  		    
	 	    PrintWriter head = new PrintWriter(socket.getOutputStream());
	 		DataOutputStream data = new DataOutputStream(socket.getOutputStream());
	
	 		head.println("HTTP/1.1 200 OK");											// Response code.
	 		head.println("Server: NetworkServer Mm223kk_assignment: 2.0");				// Server Information.
	 		head.println("Date: " + new Date());										// Current Time.
	 		head.println("Content-Type: "+requestType(formatedLocation));				// Set the type.
	 		head.println("Content-Length: " + requestedFile.length);					// Content size (bytes).
	 		head.println();																// New line between response header, and response data.
	 		head.flush();																// Clear the stream.
	 	    data.write(requestedFile);													// Write the data to the header.
	 	    data.flush();																// Clear the stream.
	 	    // Close the input streams and socket.
	 	    head.close();																// Close the header stream.
	 	    data.close();																// Close the data stream.
	 	    socket.close();																// Close the socket.		
		} catch (Exception e) {
			System.out.println("HTTP/1.1 404 Not Found: "+formatedLocation +" was not found.");
			Errors.errorHandle("404 Not Found", "Error 404: requested page not found."); // Send 404 error message to user.
		}
	}


	/**
	 * This method is used to make the file path java-friendly.
	 * It changes single slashed to two backslashes.
	 * @param requestLocation - The path which is requested.
	 * @return	- Returns the formated path.
	 */
	private String formatePath(String requestLocation) {
			String formatedLocation = "";
			if(requestLocation != null) {
				    formatedLocation = requestLocation.replaceAll("/", "\\\\");									// Replace all slashes with slashes that java can read.
				    while( formatedLocation.charAt(0) == '.')
				    	formatedLocation = formatedLocation.substring( 1, formatedLocation.length() - 1);		// Remove dots in the beginning.
				    return formatedLocation;
			}else
					return "";																					// Return an empty string.
	}
	
	 /**
	  * Function used to extract the type of the requested file from the request URL.
	  * This type will be used for the response header "Content-type:".
	  * @param formatedLocation	- The path that the user is requesting.
	  * @return	- Returns the type of the end file such as, .JPG, .HTML and son on.
	  */
	private String requestType(String formatedLocation) {	
			    String type =  formatedLocation.substring(formatedLocation.lastIndexOf(".")+1, formatedLocation.length());		// Get the type of the requested file.	   
			    // Handle the types.
		 	    if(type.equals("html") || type.equals("css") || type.equals("htm"))												// HTML,htm and css file.
		 	    	return ("text/"+type);																		
		 	    else if(type.equals("png") || type.equals("jpg") || type.equals("jpeg") )				 						// Image files.
		 	    	  return ("image/png");
		 	    else if(type.equals("js"))										
		 	    	return ("application/javascript");																			// JavaScript file
		 	    else
		 	    	return ("text/plain");																						// Text file if none of them above.
	 }
	
}
