<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>Survival</title>

	<script type="text/javascript" src="/survival/resources/js/jquery-3.2.1.min.js"></script>
	
	<!-- 부트스트랩 -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
	
	<script>
		$(function(){
			
		});
	</script>
		
	<style>
		 body {
			background-color: #cccccc;
			/* background-image: url("/home/resources/img/home.jpg"); */
   			background-position : center center;
   			background-attachment: fixed;
   			background-repeat : no-repeat;
   			background-size : cover;
		}
	</style>
</head>
<body>
	<jsp:include page="/WEB-INF/views/header.jsp" />

	<div id="main">
		<div id="remainAmt">
		</div>
		
		<div id="mainImg">
			<img src="/survival/resources/img/images.jpg" />
		</div>
	</div>
	
</body>
</html>