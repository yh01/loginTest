package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.EditDTO;
import util.DBConnector;

public class EditCompletionDAO {
	private Connection con;
	private String sql;
	private PreparedStatement ps;
	private ResultSet rSet;
	private boolean res;
	private int count;
	public void sessionGetAndSelct(int sessionUserId, EditDTO dto){
		try{
			con = DBConnector.getConnection("EditTest");
			sql = "SELECT * FROM temp WHERE user_id = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, sessionUserId);
			rSet = ps.executeQuery();
			if(rSet.next()){
				dto.setUserName(rSet.getString("user_name"));
				dto.setPassword(rSet.getString("pass"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public boolean insert(String userName, String pass){
		System.out.println(userName + pass);
		count = 0;
		res = true;
		try{
			con = DBConnector.getConnection("EditTest");
			sql = "INSERT INTO user (user_name, pass) values (?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, userName);
			ps.setString(2, pass);
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
	public void putSession(String pass, EditDTO dto){
		try{
			con = DBConnector.getConnection("EditTest");
			sql = "SELECT user_id  FROM user WHERE pass = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, pass);
			rSet = ps.executeQuery();
			if(rSet.next()){
				dto.setUserId(rSet.getInt("user_id"));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	public void resetTemp(){
		try{
			con = DBConnector.getConnection("EditTest");
			sql = "DELETE FROM temp";
			ps.executeUpdate(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
