package com.Servlet;
import java.io.IOException;
import java.io.PrintWriter;

import com.DAO.userDAO;
import com.Db.DBConnect;
import com.User.UserDetails;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.DAO.userDAO;
import com.User.UserDetails;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email=request.getParameter("uemail");
		String password=request.getParameter("upassword");
		UserDetails us=new UserDetails();
		us.setEmail(email);
		us.setPassword(password); 
		
		userDAO dao=new userDAO(DBConnect.getConn());
		boolean f=dao.loginUser(us);
		if(f) {
			response.sendRedirect("home.jsp");
		}
		else {
			
		}
		
	}

}
