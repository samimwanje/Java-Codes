package mm223kk_assignment_3;
//Needed libraries, only built in.
import java.io.*;
import java.net.*;
import java.util.StringTokenizer;

/**
 * This class handles all the requests to the server.
 * @author Sami Mwanje, mm223kk@student.lnu.se
 */
public class Request implements Runnable{
	
	private Socket socket;		// Current socket
	private Errors Errors;		// Error handling class.
	private Response Response;	// The response class.
	private Post Post;			// The class handling post of a file.
	private final int MAXIMUM_UPLOAD_SIZE = 1024*1024*100;	// The maximum allowed image size in bytes. Default set to 100 MB.
	
	Request(Socket socket, File root){
		this.socket = socket;
		this.Errors = new Errors(socket, root);
		this.Response = new Response(socket, root);
		this.Post = new Post(socket, root);
	}
	
	/**
	 * This method handles the header from the request,
	 * It routes the incoming header to the correct method,
	 * and takes some important values from the header.
	 */
	public void handleHeader() {
	 	try {	
	 		BufferedReader request = new BufferedReader(new InputStreamReader(socket.getInputStream()));   			// Receive request data.
	 		String requestLocation =  request.readLine();															// The method used and the requested path.
		    String requestHeader = null;																			// String holding request header.		    
		    String contentLength ="";
		    // Go through request header.
		    while ((requestHeader = request.readLine()) != null){
		    	if(requestHeader.contains("Content-Length:"))														//Get the length of current Content.
		    		contentLength = requestHeader;		    	
		    	if(requestHeader.isEmpty())
		    		break;
		    } 
		    contentLength = contentLength.substring(contentLength.indexOf(" ")+1,contentLength.length());			// Get the length of the contentLength.
		    if(requestLocation == null)	// Quit if the location data does not exist.
		    	return;		    

		    // Make sure to only filter important requests.
		    if( !requestLocation.contains(".css") && !requestLocation.contains(".js") && !requestLocation.contains(".jpg")  && !requestLocation.contains("favicon.png") )	// Filter the known types.
		    		System.out.println("\n" +requestLocation.substring(0,requestLocation.indexOf("HTTP/")) +"request by "+ socket.getInetAddress().getHostAddress() + ":" + socket.getPort());	// Log in console.
		    
	        StringTokenizer requestTokens = new StringTokenizer(requestLocation);  
	        String requestMethod = requestTokens.nextToken();										// Get the used request method.

		    if(requestMethod.equals("GET"))
		    	Response.genResponse(requestTokens);												// Fix the requested path and generate a response.
		    else if(requestMethod.equals("POST")) {
		    	try {
		    		if( Long.parseLong(contentLength) >= MAXIMUM_UPLOAD_SIZE) 						// Trying to parse. Checks if the data is too large.
		    			Post.tooLarge();															// Discard the file.	
		    		else 
		    			Post.handlePost( Integer.parseInt(contentLength));							// Try to upload the file.
		    	}catch(Exception e){ Errors.internalError(); }										// Send internal error to the client.
		    	
		    }else {
		    	System.out.println("405 Method "+requestMethod+" Not Allowed.");
		    	Errors.errorHandle("405 Method Not Allowed","Error 405 Method" +requestMethod +"Not Allowed.\n Please use GET or POST.");																// If the requested method is not allowed, then display an error.
		    }
	 	} catch (Exception e) {
	 		e.printStackTrace();
	 		Errors.internalError();																	 // If something happens here, send an internal error to the user.
		}
	}

	@Override
	/*
	 * Gives incoming user their own thread.
	 */
	public void run() {
		try {
            handleHeader();	 			// Handle the client's request here.
        } catch (Exception e) {
            e.printStackTrace();
        } finally {						// Ensure that the socket is always closed, even if an exception is thrown during the request handling.
            try {      
                socket.close();			// close the socket when you are done with it.
            } catch (Exception e) {
                e.printStackTrace(); 	// If something goes wrong while closing socket.
            }
        }
	}
}