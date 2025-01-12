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

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Set response content type
        resp.setContentType("text/html");

        // Get form parameters
        String name = req.getParameter("fname");
        String email = req.getParameter("uemail");
        String pass = req.getParameter("password");

        // Create UserDetails object
        UserDetails us = new UserDetails();
        us.setName(name);
        us.setEmail(email);
        us.setPassword(pass);

        // Get DAO instance and add user
        userDAO dao = new userDAO(DBConnect.getConn());
        boolean f = dao.addUser(us);

        // Respond to the client
        PrintWriter out = resp.getWriter();
        if (f) {
            out.print("User Registered Successfully");
        } else {
            out.print("Data not inserted");
        }
    }
}
