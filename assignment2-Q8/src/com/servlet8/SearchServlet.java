package com.servlet8;

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


@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pemail=request.getParameter("email");
		String pname=request.getParameter("name");
		
		
		try {
			   Class.forName("com.mysql.jdbc.Driver");
			   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","pelehuku");
			   String sql="select name,email,gender from student_tbl where name=? or email=?";
			   PreparedStatement pstmt=conn.prepareStatement(sql);
			   pstmt.setString(1, pname);
			   pstmt.setString(2, pemail);
			   
			   //Fire the query
			   //CTR+SHIFT+O
			  ResultSet rs= pstmt.executeQuery();
			  if(rs.next()) { //here user is there
				   String name =rs.getString(1);
				   String email =rs.getString(2);
				   String gender =rs.getString(3);
				   
					StudentDetails studentDetails=new StudentDetails(name,email,gender);
					request.setAttribute("students", studentDetails);
				   request.getRequestDispatcher("searchResult.jsp").forward(request, response);
				   
			  }else {  //user is not there
				  request.setAttribute("magic", "Sorry not present in database");
				  request.getRequestDispatcher("home.jsp").forward(request, response);
			  }
		}catch (Exception e) {
				e.printStackTrace();
		}
	
}
		
		
		
		
		
		


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
