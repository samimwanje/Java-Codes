package problemA;

import java.util.Scanner;

public class ProblemAmain {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);     // Used to read from the users input.
        
    //  System.out.print("Name: ");                 // Asks user for name.
        
        String name = input.next();                 // Waiting for user to enter name.
        
        String compressedName = "";                 // String holding compressed name.
        
        char temp;                                  // Char variable holding current char.
        
        for(int i = 0; i < name.length(); i++) {
            
            temp = name.charAt(i);                  // Saves current char.
                    
            // Checks if current char is equal to next char in name. If current char is the last, add the last.
            if( ( ( i != name.length()-1 ) && name.charAt(i+1) != temp ) || (i == name.length()-1  ) )  
                compressedName += name.charAt(i);                                                       // Adds current char to compressed string.
                    
        
        }
        
        
        System.out.println(compressedName); // Output of compressed name.
        
        
        input.close();      // Close scanner
        System.exit(0);     // Exit system.

    }

}
