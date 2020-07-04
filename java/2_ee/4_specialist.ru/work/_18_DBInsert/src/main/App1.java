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

		{// 1. insert:
			System.out.println("----1. insert:----");

			// get connection
			try (Connection conn = DriverManager.getConnection(CONNECTION_STRING)) {
				
				System.out.print("name: ");
				String title = scanner.nextLine();

				System.out.print("length: ");
				int length = scanner.nextInt();

				if (scanner.hasNextLine()) {
					scanner.nextLine();
				}

				System.out.print("description: ");
				String desc = scanner.nextLine();
				
				// create statement
				String sql = "INSERT INTO courses (title, length, description)"
						+ " VALUES(?,?,?)";
				PreparedStatement cmd = conn.prepareStatement(sql);
				
				cmd.setString(1, title);
				cmd.setInt(2, length);
				cmd.setString(3, desc);
				
				if (cmd.executeUpdate() == 1) {
					System.out.println("Added");
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		
		{// 2. RETURN_GENERATED_KEYS:
			System.out.println("----2. RETURN_GENERATED_KEYS:----");

			// get connection
			try (Connection conn = DriverManager.getConnection(CONNECTION_STRING)) {
				
				System.out.print("name: ");
				String title = scanner.nextLine();

				System.out.print("length: ");
				int length = scanner.nextInt();

				if (scanner.hasNextLine()) {
					scanner.nextLine();
				}

				System.out.print("description: ");
				String desc = scanner.nextLine();
				
				// create statement
				String sql = "INSERT INTO courses (title, length, description)"
						+ " VALUES(?,?,?)";
				PreparedStatement cmd = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				
				cmd.setString(1, title);
				cmd.setInt(2, length);
				cmd.setString(3, desc);
				
				if (cmd.executeUpdate() == 1) {
					ResultSet keys = cmd.getGeneratedKeys();
					keys.next();
					int key = keys.getInt(1);
					System.out.printf("Course added. Id: %d", key);
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}

//		{// 3. when insert, update, delete use cmd.executeUpdate:
//			System.out.println("\n----3. when insert, update, delete use cmd.executeUpdate:----");
//
//			System.out.print("name: ");
//			String name = scanner.nextLine();
//
//			System.out.print("length: ");
//			int L = scanner.nextInt();
//
//			if (scanner.hasNextLine()) {
//				scanner.nextLine();
//			}
//
//			System.out.print("description: ");
//			String desc = scanner.nextLine();
//
//			// get connection
//			try (Connection conn = DriverManager.getConnection(CONNECTION_STRING)) {
//
//				CallableStatement sp = conn.prepareCall("call insertCourse(?,?,?)");
//
//				// IN params
//				sp.setString(1, name);
//				sp.setInt(2, L);
//				sp.setString(3, desc);
//
//				sp.executeUpdate();
//
//				// OUT params
//
//			} catch (SQLException e) {
//				System.out.println(e.getMessage());
//			}
//		}

		scanner.close();
	}

}
