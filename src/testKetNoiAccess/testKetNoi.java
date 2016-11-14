package testKetNoiAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testKetNoi {

	public static void main(String[] args) {
		Connection connection = null;
		// Đường dẫn tới csdl
		// Directory to database
		String dbPath = "D:\\SQLSERVER\\JAVA\\Access\\testKetNoi.accdb";
		String strConnect = "jdbc:ucanaccess://" + dbPath;
		try {
			connection = DriverManager.getConnection(strConnect);
			if (connection != null)
				System.out.println("Kết nối thành công. Chúc mừng bạn");
			else
				System.out.println("Kết nối thất bại. Vui lòng thử lại");
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.toString());
		}
	}
}
