<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Planner</title>
</head>
<body>
	<jsp:include page="common/default.jsp"/>
	
	<c:choose>
		<c:when test="${ empty sessionScope.loginUser }">
			<!-- 로그인 전 -->
			<script>
				alert("wow");
			</script>
			<jsp:forward page="user/login.jsp"/>
		</c:when>
		<c:otherwise>
			<!-- 로그인 후 -->
			<h4>메인페이지입니다.</h4>
			<h4>${ loginUser.name }님 환영합니다.</h4>
		</c:otherwise>
	</c:choose>
</body>
</html>