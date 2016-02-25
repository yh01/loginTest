package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.GoLoginSuccess2DTO;
import util.DBConnector;

public class GoLoginSuccess2DAO {
	public boolean selectToUser(int user_id, GoLoginSuccess2DTO dto) {

		boolean result = false;

		Connection con = DBConnector.getConnection("loginTest");

		String sql = "SELECT * FROM user WHERE user_id = ? ";

		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, user_id);
			ResultSet resultSet = stmt.executeQuery();

			if (resultSet.next()) {
				dto.setUser_name(resultSet.getString("user_name"));
				dto.setPass(resultSet.getString("pass"));
				dto.setCredit_number(resultSet.getString("credit_number"));
				dto.setAddress(resultSet.getString("address"));

				result = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;

	}

}
