<%@ page language="java" contentType="text/html; charset=utf-8" 
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:url value="/" var="root"></c:url>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<script type="text/javascript">
		window.location.replace("home.bit");
	</script>
</head>
<body>
<h2>Hello World!</h2>
<h3>contextPath: ${root }</h3>
<h3>contextPath: ${pageContext.request.contextPath }</h3>
<!-- / 유무의 차이가 있음. 제이에스티엘이거나 밑의것을 쓰거나! 보통 위의 패턴을 따라가는듯. -->
</body>
</html>

















