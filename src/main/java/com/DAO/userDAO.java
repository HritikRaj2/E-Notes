package com.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
			String query = "INSERT INTO user(Name, Email, Password) VALUES (?, ?, ?)";
			PreparedStatement ps=c.prepareStatement(query);
			ps.setString(1,us.getName());
			ps.setString(2,us.getEmail());
			ps.setString(3,us.getPassword());
			int i=ps.executeUpdate();
			if (i==1) {
				f=true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
	public UserDetails loginUser(UserDetails us) {
		UserDetails user=null;
		try {
			String query="select *from user where email=? and password=?";
			PreparedStatement ps=c.prepareStatement(query);
			ps.setString(1,us.getEmail());
			ps.setString(2,us.getPassword());
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				user=new UserDetails();
				user.setName(rs.getString("Name"));
				user.setEmail(rs.getString("Password"));
				user.setPassword("Password");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return user;
	}
}
