<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>
<script type="text/javascript" src="js/bootstrap.js"></script>
</head>
<body>
<div>
	<div class="jumbotron">
  <h1>리스트페이지</h1>
  <p>사원리스트</p>
  <p><a class="btn btn-primary btn-lg" href="add.bit" role="button">리스트</a></p>
</div>
<table class="table">
	<tr>
		<th>사번</th>
		<th>이름</th>
		<th>날짜</th>
		<th>금액</th>
	</tr>
	<c:forEach items="${list }" var="bean">
		<tr>
			<td>${bean.sabun }</td>
			<td>${bean.name }</td>
			<td>${bean.nalja }</td>
			<td>${bean.pay }</td>
		</tr>
</c:forEach>
</table>	
</div>
</body>
</html>






