package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.LoginDTO;
import util.DBConnector;

public class LoginDAO {
	LoginDTO dto = new LoginDTO();
	public boolean selectDB(String user_name, String pass){
		boolean result = false;
		try{
			Connection con = DBConnector.getConnection("loginTest");
			String sql = "select * from user where user_name = ? and pass = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user_name);
			ps.setString(2, pass);
			ResultSet rSet = ps.executeQuery();

			if(rSet.next()){
				String userName = rSet.getString("user_name");
				String userPass = rSet.getString("pass");
				dto.setUser_name(userName);
				dto.setPass(userPass);
				result = true;
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	public LoginDTO getLoginDTO(){
		return dto;
	}
}
