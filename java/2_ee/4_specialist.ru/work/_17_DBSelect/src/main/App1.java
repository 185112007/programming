package main;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App1 {

	public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	public static final String CONNECTION_STRING = "jdbc:mysql://localhost/web?user=root&password=Pa$$w0rd";

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// load Driver class
		try {
			Class.forName(DRIVER_NAME);
		} catch (ClassNotFoundException e1) {
			System.out.println("Class not found exception");
		}

		{// 1. select all:
			System.out.println("----1. select all:----");

			// get connection
			try (Connection conn = DriverManager.getConnection(CONNECTION_STRING)) {
				// create statement
				Statement cmd = conn.createStatement();
				String sql = "SELECT title, length FROM courses ORDER BY title";
				// execute query
				ResultSet result = cmd.executeQuery(sql);

				while (result.next()) {
					String title = result.getString("title");
					int length = result.getInt("length");
					System.out.printf("%-50s : %d\n", title, length);
				}

				result.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}

		{// 2. select from courses where title like ?: here may be sql injection
			System.out.println("\n----2. select from courses where title like ?:----");

			System.out.print("Search: ");
			String search = scanner.nextLine();

			// get connection
			try (Connection conn = DriverManager.getConnection(CONNECTION_STRING)) {
				// create statement
				Statement cmd = conn.createStatement();
				String sql = "SELECT title, length FROM courses " + "WHERE title LIKE '%" + search
						+ "%' ORDER BY title";
				// execute query
				ResultSet result = cmd.executeQuery(sql);

				while (result.next()) {
					String title = result.getString("title");
					int length = result.getInt("length");
					System.out.printf("%-50s : %d\n", title, length);
				}

				result.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}

		{// 3. use PreparedStatement: no sql injection
			System.out.println("\n----3. use PreparedStatement: no sql injection----");

			System.out.print("Search: ");
			String search = scanner.nextLine();

			// get connection
			try (Connection conn = DriverManager.getConnection(CONNECTION_STRING)) {

				String sql = "SELECT title, length FROM courses WHERE title LIKE ? ORDER BY title";
				PreparedStatement cmd = conn.prepareStatement(sql);
				cmd.setString(1, "%" + search + "%");
				ResultSet result = cmd.executeQuery();

				while (result.next()) {
					String title = result.getString("title");
					int length = result.getInt("length");
					System.out.printf("%-50s : %d\n", title, length);
				}

				result.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}

		{// 4. use stored procedures: CallableStatement
			System.out.println("\n----4. use stored procedures: CallableStatement----");

			// get connection
			try (Connection conn = DriverManager.getConnection(CONNECTION_STRING)) {

				CallableStatement sp = conn.prepareCall("call countCourses(?)");

				// IN params
				// sp.set...(key, value);
				// ...

				sp.execute();

				// OUT params
				int count = sp.getInt(1);
				System.out.printf("count: %d\n", count);

			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}

		{// 5. resultSet.wasNull():
			System.out.println("\n----5. resultSet.wasNull()----");

			System.out.print("Search: ");
			String search = scanner.nextLine();

			// get connection
			try (Connection conn = DriverManager.getConnection(CONNECTION_STRING)) {

				String sql = "SELECT title, length FROM courses WHERE title LIKE ? ORDER BY title";
				PreparedStatement cmd = conn.prepareStatement(sql);
				cmd.setString(1, "%" + search + "%");
				ResultSet result = cmd.executeQuery();

				while (result.next()) {
					String title = result.getString("title");
					int length = result.getInt("length");
					if (!result.wasNull()) {
						System.out.printf("%-50s : %d\n", title, length);
					} else {
						System.out.printf("%-50s\n", title);
					}

				}

				result.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}

		scanner.close();
	}

}
