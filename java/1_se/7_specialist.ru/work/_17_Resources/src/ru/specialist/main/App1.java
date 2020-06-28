package ru.specialist.main;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import ru.specialist.dal._1_DBConnection;
import ru.specialist.dal._2_DBConnection;

public class App1 {

	public static void main(String[] args) {
		{// 1.
			System.out.println("----1:");
			_1_DBConnection conn = new _1_DBConnection();
			conn.execute();
			conn = null;
		}
		
		{// 2.
			System.out.println("----2:");
			_1_DBConnection conn = new _1_DBConnection();
			conn.execute();
			conn = null;
			
			System.gc();	// remove all created  objects
			try {
				Thread.sleep(500);	//  wait removing created objects
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		
		{// 3.
			System.out.println("----3:");
			_2_DBConnection conn = new _2_DBConnection();
			conn.execute();
			
			try {
				conn.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		
		{// 4.
			System.out.println("----4:");
			_2_DBConnection conn = new _2_DBConnection();
			try{
				conn.execute();
			}finally {
				try {
					conn.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
			
		}
		
		{// 5. try with resources
			System.out.println("----5:");
			
			try(_2_DBConnection conn = new _2_DBConnection();
					_2_DBConnection conn2 = new _2_DBConnection()){
				conn.execute();
				conn2.execute();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
