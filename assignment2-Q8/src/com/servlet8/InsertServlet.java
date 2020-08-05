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


@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pname=request.getParameter("name");
		String pemail=request.getParameter("email");
		String pgender=request.getParameter("gender");
		
		
		try {
			   Class.forName("com.mysql.cj.jdbc.Driver");
			   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","pelehuku");
			   String sql = "insert into student_tbl(name,email,gender) values(?,?,?)";
			   PreparedStatement pstmt=conn.prepareStatement(sql);
			   pstmt.setString(1, pname);
			   pstmt.setString(2, pemail);
			   pstmt.setString(3, pgender);
			   
			  int init = pstmt.executeUpdate();
			   System.out.println("Rows inserted = " + init);
				   
				   if(init>0) {
				   request.setAttribute("magic", "Sucessfully added data indatabase ");
				   }
				   else {
					   request.setAttribute("magic","Error in data addition in database ");
				   }
				   request.getRequestDispatcher("home.jsp").forward(request, response);
				   
			  
			  
		}catch (Exception e) {
				e.printStackTrace();
		}
	
}
		
		
		
		
		
		


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
