<%@ taglib prefix = "cc"  uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
 <title>View Page !!!!!!!!!!!</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
  
  <style>
.zoom {
  transition: transform .9s; /* Animation */
  margin: 0 auto;
}
.zoom:hover {
  transform: scale(2.0); /* (200% zoom - Note: if the zoom is too large, it will go outside of the viewport) */
}
</style>
</head>
<body>
   <header  style="height: 30px;background-color: #21c9ff;">
  
   </header>
    <div  class="container">
         <!-- sessionScope  is called implicit EL object -->
         <img src="img/student.png"  style="height: 139px">
                
                
   				  	 <hr/>
   				  	 
         <hr/>
        <table class="table table-bordered" >
    <thead>
      <tr>
        <th>Name</th>
        <th>Email</th>
         <th>Gender</th>
        
      </tr>
    </thead>
    <tbody>
    
    <cc:forEach  items="${students}"  var="stdetls">
      <tr>
        <td>${stdetls.name}</td>
        <td>${stdetls.email}</td>
        <td>${stdetls.gender}</td>
        
      </tr>
      </cc:forEach>
    </tbody>
  </table>
    </div>
   
  
</body>
</html>