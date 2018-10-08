<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
<%@ include file="/WEB-INF//css/sstyle.css" %>
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<ul>
		<li><a href="index.jsp">Home</a></li>
		<li><a href="viewallBook.htm">VIEW BOOK</a></li>
        <li><a href="addBook.htm">AddNewBook</a></li>		
		<li><a></a></li>
	</ul>
<div style="font-family: verdana;text-align: center;color:blue;">
      <h2><i>H-BOOK STORE </i></h2></div>
	<div class="menu">
<div style="border-bottom: 1px solid grey;"></div>
<div style="border-bottom: 1px solid grey;"></div>
</div>
   <div class="main">
      <form:form action="update" method="post" modelAttribute="book">
	<table style="background-clip: ">
			<tr>
				<th>ISBN</th>
				<td> ${book.isbn} </td>
                <td><form:hidden path="isbn" /></td> 		
			</tr>
			<tr>
				<th>BookName</th>
				<td><form:input path="bookName" /></td>
			</tr>
			<tr>
				<th>BooKAuthor</th>
				<td><form:input path="authorName"/></td>
			</tr>
			<tr>
				<th>Price</th>
				<td><form:input path="bookPrice" /></td>
			</tr>
			<tr>
	
				<td><form:hidden path="isSwitch" /></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: center;"><input type="submit" value="upadte" />
			</tr>
	</table>
	</form:form>
	</div>
	<div class="right"></div>
</body>
</html>