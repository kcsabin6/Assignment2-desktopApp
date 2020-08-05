<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Home</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js">
	</script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

<style type="text/css">

.semere {
	display: block;
	margin-left: auto;
	margin-right: auto;
}
</style>


<!-- <script type="text/javascript">
function clearMsg(){
	document.getElementById("emessage").innerHTML="";
	document.getElementNyId("studentImage").src="img/student.png";
}

function validateLogin(){
	//string
	var uname=document.getElementById("username").value;
	if(uname.length==0){
		//document.getElementById("emessage") -span object
		//alert("Username cannot be empty");
		document.getElementById("emessage").innerHTML="Username cannot be empty";
		document.getElementById("studentImage").src="img/validate.jpg";
		return;
	}
	var pass=document.getElementById("password").value;
	if(pass.length==0){
		
		document.getElementById("emessage").innerHTML="Password cannot be empty";
		document.getElementById("studentImage").src="img/validate.jpg";
		return;
	}
	//submitting manually using Javascript
	document.authform.submit();
}
</script> -->



</head>
<body>
	<header style="background-color: #03a9f4; height: 30px;">
	   <b>Address : = ${applicationScope.address}</b> 
	   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	
	 </header>
	<div  class="container">
	     <hr style="border-top: 5px solid rgba(103,58,183,1);"/>
		<img id="studentImage"  src="img/student.png" class="semere"  style="height: 200px;">
		<form  name="authform" action="view" method="post">
		<div  class="semere"   style="width: 50%">
		 
		 <span  id="message"  style="color:red;font-size: 16px;font-weight: bold;">
		   <marquee scrolldelay="100" direction="right">  ${magic}</marquee>  
		 </span>
		   <hr/>
		 			<br/><span  id="emessage"  style="color:blue;font-size: 16px;font-weight: bold;">
		 </span><br/>
		            <h1>Home Page</h1>
		            
		
		<a href="insert.jsp"><button type="button" class="btn btn-info">Add Student</button></a>
		<br/><hr/>
		<button type="submit" class="btn btn-info">View Student</button>
		<br/><hr/>
		<a href="search.jsp"><button type="button" class="btn btn-info">Search Student</button></a>
		<br/><hr/>
		</div>
		</form>
	</div>

</body>
</html>