<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="dto.Book" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>図書一覧</title>
</head>
<body>
	<h3>図書一覧</h3>
	<table border="1">
		<tr>
			<th>図書ID</th>
			<th>図書名</th>
			<th>著者</th>
			<th>出版社</th>
			<th>ISBN</th>
		</tr>
	<%

	  List<Book> list =(ArrayList<Book>)request.getAttribute("bookList");
		for(Book s : list) {%>
		<tr>
			<td><%=s.getId() %></td>
			<td><%=s.getBook_name() %></td>
			<td><%=s.getCreater_name() %></td>
			<td><%=s.getPublisher() %></td>
			<td><%=s.getIsbn() %></td>
		</tr>
	<%} %>
	</table>
	
	<a href="./">戻る</a>
</body>
</html>