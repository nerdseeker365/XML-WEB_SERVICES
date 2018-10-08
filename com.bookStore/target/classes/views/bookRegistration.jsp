<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- <link rel="stylesheet" type="text/css" href="src/main/webapp/WEB-INF/css/sstyle.css"/> -->
<style>
<%@
include
 
file="/WEB-INF//css/sstyle.css"%>
</style>
<script type="text/javascript">
function validate(){
    var f=document.getElementById("form");
    validateIsbn(f);
    validatePrice(f);
}
function validateIsbn(form){
    var error=document.getElementById("isbnError");

    var isbn=form["isbn"].value;
    error.innerHTML="";
     var regx = new RegExp('^[0-9]+$');
  if( isbn==null || isbn==""){
     error.innerHTML="please enter isbn no";
   }

else if(!isbn.match(regx)){
   error.innerHTML="please enter isbn no";
}
}

</script>
</head>
<body bgcolor="#c5d2e8">
<!-- <div style="font-family: verdana; text-align: center;"> -->
<!-- 		<h2 style="color: blue;">H-BOOK'S STORE</h2> -->
	</div>
	<ul>
		<li><a href="index.jsp">Home</a></li>
		<li><a href="viewallBook.htm">VIEW BOOK</a></li>
        <li><a href="addBook.htm">AddNewBook</a></li>		
		<li><a></a></li>
	</ul>
	<div style="font-family: verdana;text-align: center;color:blue;">
      <h2><i>H-BOOK'S STORE </i></h2></div>
	<div class="menu">
<div style="border-bottom: 1px solid white;"></div>
</div>
<div class="main">

	<form:form id="form" action="saveBook" method="post" modelAttribute="book"
		cssClass="form-horizontal registration">


		<%-- <form:errors path="*" cssClass="errorblock"></form:errors> --%>
		<table>
			<tr>
				<td><form:label path="isbn">ISBN</form:label></td>
				<td><form:input path="isbn" /></td>
				<td><form:errors path="isbn" cssClass="error" /></td>
				<td><font id="isbnError" style="color: red;">${isbnExistError} 
         </font></td>        
				
			</tr>
			<tr>
				<td><form:label path="bookName">Book Name</form:label></td>
				<td><form:input path="bookName" /></td>
				<td><form:errors id="demo" path="bookName" cssClass="error"></form:errors>
				</td>
			</tr>

			<tr>
				<td><form:label path="authorName">Author Name</form:label></td>
				<td><form:input path="authorName" /></td>
				<td><form:errors path="authorName" cssClass="error" /></td>
			</tr>
			<tr>
				<td><form:label path="bookPrice">Book Price</form:label></td>
				<td><form:input path="bookPrice" /></td>
				<td><form:errors path="bookPrice" cssClass="error" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="RESET" /></td>
				<td colspan="2"> <input type="submit" onclick="validate()" value="ADDBOOK"></td>
			</tr>
		</table>
	</form:form>
	
	</div>
	
	<div class="right">
	
</div>
</body>
</html>