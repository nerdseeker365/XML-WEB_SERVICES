<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
<%@ include file="/WEB-INF//css/sstyle.css" %>
</style>
<script type="text/javascript">

function confSubmit(form) {
if (confirm("Are you sure you want to Delete this Book?")) {
form.submit();
}

else {
//  alert("You decided to not  the form!");
}
}
</script>

</head>
<body>
	<div style="font-family: verdana; text-align: center;">
					<h2 style="color: blue;">H-BOOKs STORE</h2></div>			
		<ul>
		 <li><a href="index.jsp">Home</a></li>
		  <li><a href="viewallBook.htm">VIEW BOOK</a></li>
		  <li><a href="addBook.htm">AddNewBook</a></li>	
			<li></li>
		</ul>
	</div>

	<%    String deleteMsg=request.getParameter("deleteMsg");
	       if(deleteMsg!= null){
	    	   out.println("<h2 style='color:Green;''>"+deleteMsg+"</h2>");
	       }
	       
	%>
			<form action="search" >
				<input type="text" name="searchValue" required /> 
				<input type="submit" value="Search" /> 
			</form>
<%-- <h2 style="color:red;">${request.getParameter("deleteMsg")} </h2> --%>
	<form action="delectDetail" method="post">
		<table>
			<tr>
				<th>ISBN</th>
				<th>BookName</th>
				<th>BooKAuthor</th>
				<th>Price</th>
<!-- 				<th>isSwitch</th> -->
				<th>Edit</th>
				<th>Delete</th>
			</tr>
			<c:forEach items="${list}" var="book">
				<tr>
					<td>${book.isbn}</td>
					<td>${book.bookName}</td>
					<td>${book.authorName}</td>
					<td>${book.bookPrice}</td>
<%-- 					<td>${book.isSwitch}</td> --%>
					<td> <a href="edit?isbn=${book.isbn}">Edit</a></td>
					<td><input type="radio" name="delete" value="${book.isbn}">
				</tr>
			</c:forEach>
			<tr> 
			   <h2 style="color:Red;">${message} </h2>
				<td colspan="6" style="text-align: center;">
<!-- 				<input type="submit" value="Delete" onclick="confSubmit(this.form)" /></td> -->
			<input type="button" onClick="confSubmit(this.form);" value="Delete">
			</tr>
		</table>
		
</body>
</html>
  
