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
import jakarta.servlet.http.HttpSession;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("uemail");
		String password = request.getParameter("upassword");
		UserDetails us = new UserDetails();
		us.setEmail(email);
		us.setPassword(password);

		userDAO dao = new userDAO(DBConnect.getConn());
		UserDetails user= dao.loginUser(us);
		if (user!=null) {
			response.sendRedirect("home.jsp");
		} else {
			HttpSession session=request.getSession();
			session.setAttribute("Login-Failed", "Invalid Password and Email");
			response.sendRedirect("login.jsp");
		}
	}
}