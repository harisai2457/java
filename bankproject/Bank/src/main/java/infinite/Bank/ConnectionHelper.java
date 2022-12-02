package infinite.Bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionHelper {
			public static Connection getConnection() throws ClassNotFoundException, SQLException {
				ResourceBundle rb = ResourceBundle.getBundle("db");
				String driver = rb.getString("driver");
				String ur1 = rb.getString("url");
				String user = rb.getString("user");
				String pwd = rb.getString("password");
				Class.forName(driver);
				Connection con = DriverManager.getConnection(ur1, user, pwd);
				
				return con;
			}
}

				
