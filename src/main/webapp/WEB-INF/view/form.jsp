<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録画面</title>
</head>
<body>
	<h1>図書登録画面</h1>
	<form action="RegisterBookServlet" method="post">
		図書名：<input type="text" name="book_name"><br>
		著者：<input type="text" name="creater_name"><br>
		出版社:<input type="text" name="publisher"><br>
		ISBN:<input type="number" name="isbn"><br>
		<input type="submit" value="登録">
	</form>
	<a href ="./">戻る</a>
</body>
</html>