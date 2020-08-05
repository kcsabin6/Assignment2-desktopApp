package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/indd")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pemail=request.getParameter("email");
		String ppassword=request.getParameter("password");
		
		
		try {
			   Class.forName("com.mysql.jdbc.Driver");
			   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","pelehuku");
			   String sql="select email,password from login_tbl where email=? and password=?";
			   PreparedStatement pstmt=conn.prepareStatement(sql);
			   pstmt.setString(1, pemail);
			   pstmt.setString(2, ppassword);
			   
			   //Fire the query
			   //CTR+SHIFT+O
			  ResultSet rs= pstmt.executeQuery();
			  if(rs.next()) { //here user is there
				   String email =rs.getString(1);
				   String password =rs.getString(2);
				   
				   
				   UserDetails userDetails=new UserDetails(email, password);
				   //adding profileDTO object inside request scope with namemagic
				   request.setAttribute("magic", userDetails);
				   
				   request.getRequestDispatcher("result.html").forward(request, response);
				   
			  }else {  //user is not there
				  request.setAttribute("magic1", "Sorry , username and password are not correct");
				  request.getRequestDispatcher("invalid.html").forward(request, response);
			  }
		}catch (Exception e) {
				e.printStackTrace();
		}
	
}
		
		
		
		
		
		


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
