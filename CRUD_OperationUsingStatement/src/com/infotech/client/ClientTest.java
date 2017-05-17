package com.infotech.client;

import java.sql.Connection;
import java.sql.Statement;

import com.infotech.util.DBUtil;

public class ClientTest {

	public static void main(String[] args) {
		//createEmployee();
		//updateEmployeeEmailById();
		deleteEmployeeById();
	}

	private static void deleteEmployeeById() {
		try(Connection connection = DBUtil.getConnection();Statement st = connection.createStatement();) {
			
			String SQLINSERT = "DELETE FROM employee_table WHERE employee_id=2";
			int executeUpdate = st.executeUpdate(SQLINSERT);
			if(executeUpdate ==1){
				System.out.println("Employee is deleted..");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void updateEmployeeEmailById() {
		try(Connection connection = DBUtil.getConnection();Statement st = connection.createStatement();) {
			
			String SQLINSERT = "UPDATE employee_table set email='martin.cs2017@yahoo.com' WHERE employee_id=1";
			int executeUpdate = st.executeUpdate(SQLINSERT);
			if(executeUpdate ==1){
				System.out.println("Email is updated..");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void createEmployee() {
		try(Connection connection = DBUtil.getConnection();Statement st = connection.createStatement();) {
			
			String SQLINSERT = "INSERT INTO employee_table(employee_name,email,salary,date_of_joining,bonus) "
					+ "VALUES('Paul','paul.cs2009@yahoo.com',60000.00,'2017-05-17',400.00)";
			int executeUpdate = st.executeUpdate(SQLINSERT);
			if(executeUpdate ==1){
				System.out.println("Employee is created..");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
