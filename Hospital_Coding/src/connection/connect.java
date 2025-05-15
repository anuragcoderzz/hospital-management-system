
package connection;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Administrator
 */
public class connect {
     static Connection con=null;
    public static Connection conn()
    {
     try
     {
          Class.forName("oracle.jdbc.driver.OracleDriver");
         con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bca","bca");
         System.out.println("Connection Created...... ");
     }
     catch(Exception e){
      e.printStackTrace();
            System.out.println("connnection not created");
            JOptionPane.showMessageDialog(null, "Sorry!, Please check the Connection  and Database");

    }
    return con;
    }

}
