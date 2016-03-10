package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.DBConnector;


public class EditDAO {
	private Connection con;
	private String sql;
	private PreparedStatement ps;
	private ResultSet rs;
	private boolean res;
	private int count;
	public boolean insert(String newUserName, String newPass){
		System.out.println(newUserName + newPass);
		count = 0;
		res = true;
		try{
			con = DBConnector.getConnection("EditTest");
			sql = "INSERT INTO temp (user_name, pass) values (?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, newUserName);
			ps.setString(2, newPass);
			count = ps.executeUpdate();
			System.out.println(count);
			if(count == 0){
				res = false;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		System.out.println(res);
		System.out.println(count);
		return res;
	}

}
