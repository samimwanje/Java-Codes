package assignment3;

// Libraries used
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class premierleague {

   public static void main(String[] args) throws SQLException {

      Scanner scanner = new Scanner(System.in); // Creating keyboard reading object.		
      String query = ""; // String value that hold the sql query.

      // Loop where the menu interface will be loaded.
      while (true) {

        displayMenu(); // Load the menu lines.
         int input = 0;

         String userString = scanner.nextLine();
         // Check if user has entered the correct value.
         while (!(checkInput(userString)) || ((Integer.parseInt(userString) > 6) || (Integer.parseInt(userString) < 1))) {
            System.out.print("ERROR ONLY 1-6: ");
            
            userString = scanner.nextLine();

         }

         input = Integer.parseInt(userString); // Waiting for user input before continue.

         System.out.println("\n");

         // Switch function used to read the user input a choose preferred query.
         switch (input) {
         case 1:
            query = "SELECT  team_name AS team, wins, coach_name AS coach, arena\r\n" +
               "FROM team\r\n" +
               "JOIN coach\r\n" +
               "ON team.team_name = team_team_name\r\n" +
               "ORDER BY wins DESC\r\n" +
               "";

            break;
         case 2:

            query = "SELECT  player_name AS name,position, yellow_c AS YC, wins, team_name\r\n" +
               "FROM players\r\n" +
               "JOIN team\r\n" +
               "ON team_team_name = team_name\r\n" +
               "ORDER BY yellow_c DESC, player_name\r\n" +
               "LIMIT 16;\r\n" +
               "";

            break;
         case 3:
            query = "SELECT  team_team_name as team, SUM(yellow_c) as YCards, SUM(red_c) as RCards\r\n" +
               "FROM players\r\n" +
               "WHERE yellow_c > 0\r\n" +
               "GROUP BY team_team_name\r\n" +
               "ORDER BY yCards DESC, RCards DESC\r\n" +
               "";

            break;
         case 4:

            query = "SELECT Club, Played, Won, Drawn,  Lost, GF,  GA, Points, coach_name AS Coach, join_date AS Joined\r\n" +
               "FROM BPL_TABLE JOIN (SELECT coach_name, join_date, team_team_name\r\n" +
               "FROM coach) AS coach ON Club = coach.team_team_name\r\n" +
               "ORDER BY Points DESC\r\n" +
               "";

            break;
         case 5:

            query = "SELECT DISTINCT(Club), Played, Won, Drawn, Lost, GF, GA, Points, `Top Scorer`, MAX(Goals) AS Goals\r\n" +
               "FROM BPL_table\r\n" +
               "JOIN TOP_SCORERS AS TOP_SCORERS \r\n" +
               "ON Club = TOP_SCORERS.team\r\n" +
               "GROUP BY  `Top Scorer`\r\n" +
               "ORDER BY Goals DESC\r\n" +
               "LIMIT 20\r\n" +
               "";

            break;
         case 6:
            System.out.println("Program is now closing...");
            scanner.close();
            System.exit(0);

         }

         runQuery(query); // Calls the function which runs and outprints the query.

         //	System.out.println("-------------------------------------------------------------------------------------------------------------");

         // Waiting for user to press any key before continue.
         System.out.print("Press enter to continue: ");
         while (true) {

            try {
               System.in.read();
               break;
            } catch (Exception e) {}

         }

         //System.out.println("-------------------------------------------------------------------------------------------------------------\n\n");

      }

   }

   /**
    * This function is used to check if the user has,enter the correct input  corresponding to the menu.
    * Since the input should be a number, the user input,
    * is being checked.
    * @param s - The input from the user.
    * @return - Returns if the input is a matching value.
    */
   public static boolean checkInput(String s) {

      try {
         Integer.parseInt(s);
         return true;
      } catch (NumberFormatException ex) {

         System.out.print("-------------------------------------------------------------------------------------------------------------\n\n");
         return false;

      }

   }

   /**
    * This function is used to display the menu lines.
    */
   public static void displayMenu() {

      System.out.println("Which query do you want to load?");
      System.out.println("-------------------------------------------------------------------------------------------------------------");

      // Displaying all the menu choices.
      System.out.println("1. List all the teams with their wins, corresponding coach and home arena, order by descending.\n");
      System.out.println("2. List top 16 players which have the most yellow cards with their name, position, yellow cards, number of wins and team name.\n");
      System.out.println("3. Display the total red and yellow cards each club has. List them in descending order with club name and corresponding yellow and red cards.\n");
      System.out.println("4. Display the current premier league table with coach name and his join date.\n");
      System.out.println("5. Display the current premier league table with the top 20 goal scorers with their number of goals, corresponding club, name etc.\n");
      System.out.println("6. Close porgram.\n");
      System.out.print("OPTION: ");

   }

   /**
    * This function is used to login to a sql-server,
    * make a query call, and display the return to the user.
    * @param query - Takes in a query string from the menu.
    */
   public static void runQuery(String query) {

      // Login with database details.
      String database = "premierleague"; // Loaded database
      String url = "jdbc:mysql://localhost:3306/" + database; // The MySQL adress.
      String username = "root"; // The MySQL server username.
      String password = "root"; // The MySQL server password.

      try {

         Class.forName("com.mysql.cj.jdbc.Driver");

      } catch (ClassNotFoundException e) {

         e.printStackTrace();
      }

      try {

         Connection conn = DriverManager.getConnection(url, username, password); // Connect to database with login information
         ResultSet rs = conn.createStatement().executeQuery(query);

         // Used for a more viewer friendly ouput.
         int column = 1;
         int colmnSize = rs.getMetaData().getColumnCount();

         while (column <= colmnSize) {

            String columnName = rs.getMetaData().getColumnLabel(column); // Receives the name of the column.
            int columnL = columnName.length(); // Used for a more viewer friendly output.
            System.out.print(columnName);

            // Used for a more viewer friendly output.	
            if (columnL > 23)
               System.out.print("\t");
            else if (columnL < 23 && columnL > 15)
               System.out.print("\t\t");
            else if (columnL < 15 && columnL > 4)
               System.out.print("\t\t\t");
            else if (columnL < 4 && columnL > 2)
               System.out.print("\t\t\t");
            else
               System.out.print("\t\t\t\t");

            column++;
         }

         System.out.println();
         column = 1;
         while (column <= colmnSize) {

            System.out.print("----------------------------");
            column++;
         }

         System.out.println();

         System.out.println();

         while (rs.next()) {

            for (int i = 1; i <= colmnSize; i++) {

               System.out.print(rs.getString(i)); //Prints current value.
               int stringLength = rs.getString(i).length(); // Length of current value.

               // Used for a more viewer friendly output.				      
               if (stringLength > 23)
                  System.out.print("\t");
               else if (stringLength > 15)
                  System.out.print("\t\t");
               else if (stringLength > 8)
                  System.out.print("\t\t\t");
               else if (stringLength < 7)
                  System.out.print("\t\t\t");
               else
                  System.out.print("\t\t\t\t");

            }

            System.out.println();
            column = 1;
            while (column <= colmnSize) {

               System.out.print("----------------------------");
               column++;
            }

            System.out.println();
         }

         conn.close();

      } catch (SQLException e) {

         e.printStackTrace();

      }

   }

}