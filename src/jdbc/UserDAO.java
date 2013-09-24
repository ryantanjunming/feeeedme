package jdbc;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {
	
	void addUser(UserDTO user) throws SQLException;
	
	UserDTO getUserById(int userId) throws SQLException;
	
	List<UserDTO> getUserByUserName(String userName) throws SQLException;
	
	List<UserDTO> getAllUsers() throws SQLException;
	
	boolean authenticateLogin(String username, String password) throws SQLException;
	
	// Add more shit that we need to perform on user table
}
