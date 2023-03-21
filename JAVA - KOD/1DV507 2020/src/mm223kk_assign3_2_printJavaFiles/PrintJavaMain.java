/* 

		Studentmail: mmm223kk@student.lnu.se
		Username: mmm223kk
		Namn: Sami Mwanje.                     */
package mm223kk_assign3_2_printJavaFiles;


import java.io.File;
import java.io.FileReader;
import java.util.Scanner;


public class PrintJavaMain {
	static int p = 0;

	public static void main(String[] args) {
		
				printAllJavaFiles("src");				// Run method with String location.

	}

	
	
	/**
	 * This is a method that works in a recursively way.
	 * It will not stop calling it self until the folder (directory) has been fully scanned.
	 * If the folder contains a folder it will print it out and scan for files/folders in that folder and so on. Every file and it's folders are printed.
	 * @param directory this is the location for the folder/file that the method shall begin with.
	 */
	private static  void printAllJavaFiles(String directory )  {
		
		try {	// Error handling.
		File file = new File(directory);			// Create file object with suggested location.
		File[] files = file.listFiles();			// List all folders/files in the folder.
	
		for(File files1: files) {					// Walk through array, I am not sure if this is allowed but could not come up with another way at the moment.
			if( files1.isDirectory() ) {			// Check if current file is Directory
		
			System.out.println("Directory: " +files1.getName());		// If yes, print name 
			printAllJavaFiles(files1.getPath());						// And rerun method for this folder.
		
			} else if(files1.isFile() && files1.getName().contains(".java")) 	// Check if it's a .java file.
				System.out.println( "File: " +files1.getName() +", Rows: " +countLines(files1.getPath()));	// If yes, print the files and run the count method.
			
											}
		System.out.println(); 				 			// New line after last file has been printed.
		
		}catch  (Exception e){
			System.err.println("Error reading file/directory loction.");	} // Error handling.
		
				}
	
		/**
		 * This method reads a .java file and scans for how many rows the file contains.
		 * It uses the Scanner and FileReader class to scan for the rows. 
		 * @param java this is the location of the file. It works perfectly with the method printAllJavaFiles().
		 * @return	After counting how many rows, the number is returned to us.
		 */
		private static int countLines(String java) {
			
			int rows = 0;							// count lines.
		try { 															// Error handling.
			Scanner scanner = new Scanner(	new FileReader(java)	); //  New scanner and file object that reads the .java file.
		
	        
	        while (scanner.hasNextLine()) {							// Check if there is a line in .java file
	            scanner.nextLine();									// If there is go to next line.
	            rows++;											// And increase row.
	        }
	        
				} catch (Exception e) {
			System.err.println("Error reading file/directory loction."); // Error handling.
		}
		return rows;	
		
	}
}
