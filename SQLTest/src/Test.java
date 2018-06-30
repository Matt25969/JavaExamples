
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test {

	public static void main(String[] args) {

		Connection con = null;
		Statement st = null;
		ResultSet rs = null;

		String url = "jdbc:mysql://localhost:3306/mydb";
		String user = "root";
		String password = "password";

		try {

			con = DriverManager.getConnection(url, user, password);
			st = con.createStatement();

			if (rs.next()) {

				System.out.println(rs.getString(1));

				rs = st.executeQuery("select * from author");
				writeResultSet(rs);

				System.out.println(rs);
			}

		} catch (SQLException ex) {

			Logger lgr = Logger.getLogger(Test.class.getName());
			lgr.log(Level.SEVERE, ex.getMessage(), ex);

		} finally {

			try {

				if (rs != null) {
					rs.close();
				}

				if (st != null) {
					st.close();
				}

				if (con != null) {
					con.close();
				}

			} catch (SQLException ex) {

				Logger lgr = Logger.getLogger(Test.class.getName());
				lgr.log(Level.WARNING, ex.getMessage(), ex);
			}
		}
	}

	private static void writeResultSet(ResultSet resultSet) throws SQLException {
		// ResultSet is initially before the first data set
		while (resultSet.next()) {
			// It is possible to get the columns via name
			// also possible to get the columns via the column number
			// which starts at 1
			// e.g. resultSet.getSTring(2);
			String user = resultSet.getString("Age");
			String website = resultSet.getString("DOB");
			String summary = resultSet.getString("Name");

			String comment = resultSet.getString("id");
			System.out.println("User: " + user);
			System.out.println("Website: " + website);
			System.out.println("summary: " + summary);

			System.out.println("Comment: " + comment);
		}
	}
}