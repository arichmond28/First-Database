import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class main {
  private static final String URL = "jdbc:mysql://localhost:3306/mydatabase";
  private static final String USER = "root"; // replace with your username
  private static final String PASSWORD = "yourpassword"; // replace with your password

  public static void main(String[] args) {
    try {
      // Establish connection to the database
      Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
      System.out.println("Connected to the database.");

      // SQL query to read data from the table
      String query = "SELECT * FROM mytable";

      // Prepare and execute the query
      PreparedStatement statement = connection.prepareStatement(query);
      ResultSet resultSet = statement.executeQuery();

      // Process the result set
      while (resultSet.next()) {
        String lastNameFirstName = resultSet.getString("LastNameFirstName");
        int playerID = resultSet.getInt("playerID");
        int year = resultSet.getInt("yeaR_");
        int pa = resultSet.getInt("pa");
        float kPercent = resultSet.getFloat("k_percent");
        float bbPercent = resultSet.getFloat("bb_percent");
        float woba = resultSet.getFloat("woba");
        float xwOBA = resultSet.getFloat("xwOBA");
        float laSweetSpotPercent = resultSet.getFloat("LAsweetspot_percent");
        float barrelPercent = resultSet.getFloat("barrel_percent");
        float hardHitPercent = resultSet.getFloat("hard_hit_percent");
        float ev50 = resultSet.getFloat("ev50");
        float adjustedEv50 = resultSet.getFloat("adjusted_ev50");
        float whiffPercent = resultSet.getFloat("whiff_percent");
        float swingPercent = resultSet.getFloat("swing_percent");

        // Print the data (or process it as needed)
        System.out.println("Player: " + lastNameFirstName + ", Year: " + year + ", PA: " + pa +
            ", K%: " + kPercent + ", BB%: " + bbPercent + ", wOBA: " + woba +
            ", xwOBA: " + xwOBA + ", LA Sweet Spot%: " + laSweetSpotPercent +
            ", Barrel%: " + barrelPercent + ", Hard Hit%: " + hardHitPercent +
            ", EV50: " + ev50 + ", Adjusted EV50: " + adjustedEv50 +
            ", Whiff%: " + whiffPercent + ", Swing%: " + swingPercent);
      }

      // Close the connection
      connection.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
