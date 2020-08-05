package com.servlet8;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/view")
public class ViewServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<StudentDetails> studentDetailss = new ArrayList<>();
		
		try {
			   Class.forName("com.mysql.jdbc.Driver");
			   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","pelehuku");
			   String sql="select name,email,gender from student_tbl";
			   PreparedStatement pstmt=conn.prepareStatement(sql);
			  
			   
			   //Fire the query
			   //CTR+SHIFT+O
			  ResultSet rs= pstmt.executeQuery();
			  while(rs.next()) { //here user is there
				   String name =rs.getString(1);
				   String email =rs.getString(2);
				   String gender =rs.getString(3);
				   
					StudentDetails studentDetails=new StudentDetails(name,email,gender);
					studentDetailss.add(studentDetails);
			  }
			  request.setAttribute("students", studentDetailss);
			   request.getRequestDispatcher("view.jsp").forward(request, response);
			   
		}catch (Exception e) {
				e.printStackTrace();
		}
	
}
		
		
		
		
		
		


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
