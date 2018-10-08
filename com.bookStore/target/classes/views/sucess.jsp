<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
<%@ include file="/WEB-INF//css/sstyle.css" %>
</style>
</head>
<body>
<div style="font-family: verdana; text-align: center;">
		<h2 style="color: blue;"> H-BOOK's STORE</h2>
	</div>
	<ul>
		<li><a href="index.jsp">Home</a></li>
		<li><a href="viewallBook.htm">VIEW BOOK</a></li>
        <li><a href="addBook.htm">AddNewBook</a></li>		
		<li><a></a></li>
	</ul>

<h2 style="color:Green;"> ${bookname}</h2>
<h2 style="color:Green;"> ${msg}</h2>
<table>
<tr><th>ISBN</th><th>BookName</th><th>BooKAuthor</th><th>Price</th></tr>
<%-- <c:forEach items="${book}" var="book" > --%>
<tr>
<td>${book.isbn}</td>
<td>${book.bookName}</td>
<td>${book.authorName}</td>
<td>${book.bookPrice}</td>
</tr>
<%-- </c:forEach> --%>
</table>
     <% %>
<h2 style="color:Green;">Click Here to See All the Book Collection<a href="viewallBook.htm"> <button style="color:blue;"type="button">Click</button></a></h2> 
</body>
</html>