package premier_projet;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class ConMysql {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost:3306/cinema";
		String login = "root";
		String pw = "root";
		Connection cn = null;
		Statement st = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			cn = (Connection) DriverManager.getConnection(url, login, pw);
			st = (Statement) cn.createStatement();

			String req = "select * from films";
			getFilms(st, cn, req);
			getGenre(st, cn, "select * from genre");

			cn.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void getFilms(Statement st, Connection cn, String req) throws SQLException {

		ResultSet rs = st.executeQuery(req);
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "  " + rs.getInt(2) + "  " + rs.getString(3) + " " + rs.getString(4) + " "
					+ rs.getInt(5) + " " + rs.getInt(6));

		}
	}

	public static void getGenre(Statement st, Connection cn, String req) throws SQLException {

		ResultSet rs = st.executeQuery(req);
		while (rs.next()) {
			System.out.println(rs.getInt(1) + "  " + rs.getString(3));

		}
	}
}
