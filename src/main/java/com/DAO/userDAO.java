package com.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.User.UserDetails;
public class userDAO {
	private Connection c;

	public userDAO(Connection c) {
		super();
		this.c = c;
	}
	public boolean addUser(UserDetails us)
	{
		boolean f=false;
		try {
			String query="insert into user values(???)";
			PreparedStatement ps=c.prepareStatement(query);
			ps.setString(1,us.getName());
			ps.setString(2,us.getEmail());
			ps.setString(3,us.getPassword());
			int i=ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
}
