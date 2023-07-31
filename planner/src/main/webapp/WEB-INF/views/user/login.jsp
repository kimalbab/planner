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
<jsp:include page="../common/default.jsp"/>
<body class="d-flex align-items-center justify-content-center" style="min-height: 100vh;">
  <div class="container">
    <div class="row justify-content-center">
      <div class="col-md-6 col-lg-4">
        <h1 class="text-center mb-4">LOGIN</h1>
        <form action="login" method="post">
          <div class="form-group">
            <label for="inputId">ID</label>
            <input type="text" class="form-control" id="id" name="id" required>
          </div>
          <div class="form-group">
            <label for="inputPassword">Password</label>
            <input type="password" class="form-control" id="password" name="password" required>
          </div>
          <button type="submit" class="btn btn-primary btn-block">로그인</button>
        </form>
        <div class="text-center mt-3">
          <a href="#" class="btn btn-link">회원가입</a>
        </div>
      </div>
    </div>
  </div>
</body>
</html>