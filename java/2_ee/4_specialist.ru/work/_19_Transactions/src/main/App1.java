package main;

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
		
		{// 1. Transaction:
			System.out.println("----1. Transaction:----");

			// get connection
			Connection conn = null;
			try {
				conn = DriverManager.getConnection(CONNECTION_STRING);
				
				// 1. set auto commit false
				conn.setAutoCommit(false);
				
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
				
				// 2. do commit
				conn.commit();
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				
				// 3. if there is an exception than rollback
				try {
					conn.rollback();
				} catch (SQLException e1) {
					System.out.println(e1.getMessage());
				}
			}
		}
		
		{// 2. TransactionIsolation: TRANSACTION_READ_UNCOMMITTED
			System.out.println("----2. TransactionIsolation: TRANSACTION_READ_UNCOMMITTED----");

			// get connection
			Connection conn = null;
			try {
				conn = DriverManager.getConnection(CONNECTION_STRING);
				
				// read uncommitted datas from other operations
				conn.setTransactionIsolation(Connection.TRANSACTION_READ_UNCOMMITTED);
				
				/*
		 				A			B
		 			---------------------
		 				-			-
		 				-			W
		 				R			-		read uncommitted data(dirty read)
		 				-		  commit
		 				commit		-		 
				 */
				
				
				// 1. set auto commit false
				conn.setAutoCommit(false);
				
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
				
				// 2. do commit
				conn.commit();
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				
				// 3. if there is an exception than rollback
				try {
					conn.rollback();
				} catch (SQLException e1) {
					System.out.println(e1.getMessage());
				}
			}
		}
		
		{// 2. TransactionIsolation: TRANSACTION_READ_COMMITTED
			System.out.println("----2. TransactionIsolation: TRANSACTION_READ_COMMITTED----");

			// get connection
			Connection conn = null;
			try {
				conn = DriverManager.getConnection(CONNECTION_STRING);
				
				// read only committed datas from other operations
				conn.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
				
				/*
				 		A			B
				 	---------------------
				 		R			-
				 		-			W
				 		-			commit
				 		R			-		 dirty reads after commit
				 */
				
				// 1. set auto commit false
				conn.setAutoCommit(false);
				
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
				
				// 2. do commit
				conn.commit();
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				
				// 3. if there is an exception than rollback
				try {
					conn.rollback();
				} catch (SQLException e1) {
					System.out.println(e1.getMessage());
				}
			}
		}
		
		{// 3. TransactionIsolation: TRANSACTION_REPEATABLE_READ
			System.out.println("----3. TransactionIsolation: TRANSACTION_REPEATABLE_READ----");

			// get connection
			Connection conn = null;
			try {
				conn = DriverManager.getConnection(CONNECTION_STRING);
				
				// read only committed datas from other operations
				conn.setTransactionIsolation(Connection.TRANSACTION_REPEATABLE_READ);
				
				/*
				 		A			B
				 	---------------------
				 	1	R			-
				 	2	-			W
				 	3	-			commit
				 	4	R			-		 read same data like line 1
				 							 zasisyaet ot updatov rannee procitannyh strok no
				 							 ne garantiruet esli budet insert novaya stroka
				 							 kotaraya sootvetstvuyet vashey uslovii, oni 
				 							 toje pridut vmeste s rannim selektom
				 */
				
				// 1. set auto commit false
				conn.setAutoCommit(false);
				
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
				
				// 2. do commit
				conn.commit();
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				
				// 3. if there is an exception than rollback
				try {
					conn.rollback();
				} catch (SQLException e1) {
					System.out.println(e1.getMessage());
				}
			}
		}
		
		{// 4. TransactionIsolation: TRANSACTION_SERIALIZABLE
			System.out.println("----3. TransactionIsolation: TRANSACTION_SERIALIZABLE----");

			// get connection
			Connection conn = null;
			try {
				conn = DriverManager.getConnection(CONNECTION_STRING);
				
				// read only committed datas from other operations
				conn.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
				
				/*
				 		A			B
				 	---------------------
				 		R			-
				 		-			-
				 		-			-
				 		R			-
				 	  commit		-
				 	  	-			W
				 	  	-		  commit
				 	  	-			-      work posledovatelno
				 	
				 */
				
				// 1. set auto commit false
				conn.setAutoCommit(false);
				
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
				
				// 2. do commit
				conn.commit();
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
				
				// 3. if there is an exception than rollback
				try {
					conn.rollback();
				} catch (SQLException e1) {
					System.out.println(e1.getMessage());
				}
			}
		}

		scanner.close();
	}

}
