<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<title>My Home</title>
	
	<script type="text/javascript" src="/survival/resources/js/jquery-3.2.1.min.js"></script>
	
	<!-- 부트스트랩 -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
	
	
	<script>
	
	$(function(){
		//OPEN 클릭 시 사이드메뉴 펼침
		$("#topBar span").on("click", function(){
			$("#sideNav").attr("style", "width:250px");
			$("#main").attr("style", "margin-left:250px");
		});
		
		//사이드메뉴의 X 버튼 클릭 시 사이드메뉴 접음
		$("#sideNav span").on("click", function(){
			$("#sideNav").attr("style", "width:0");
			$("#main").attr("style", "margin-left:0");
		});
		
		//로그인 버튼 클릭 시
		$("#login").on("click", function(){
			location.href = "/survival/user/loginView";
		});
		
		//로그아웃 버튼 클릭 시
		$("#logout").on("click", function(){
			var choice = confirm("정말로 로그아웃하시겠습니까?");
			if(choice == true){
				location.href = "/survival/user/logout";
			}else{
				return false;
			}			
		});	
	});
		
	</script>
	
	<style>
		.sidenav {
		    height: 100%;
		    width: 0;
		    position: fixed;
		    z-index: 100;
		    top: 0;
		    left: 0;
		    background-color: #111;
		    overflow-x: hidden;
		    transition: 0.5s;
		    padding-top: 60px;
		}
		
		.sidenav a {
		    padding: 8px 8px 8px 32px;
		    text-decoration: none;
		    font-size: 25px;
		    color: #818181;
		    display: block;
		    transition: 0.3s;
		}
		
		.sidenav a:hover {
		    color: #f1f1f1;
		}
		
		.sidenav .closebtn {
		    position: absolute;
		    top: 0;
		    right: 25px;
		    font-size: 36px;
		    margin-left: 50px;
		    cursor : pointer;
		}
			
		#topBar {
			width : 100%;
			height: 40px;
			background-color : black;
			font-weight : bold;
		}
		
		#topBar span {
			font-size : 30px;
			cursor : pointer;
			color : #f1f1f1;
		}
		
		#user {
			float : right;
			color : #f1f1f1;
		}
		
		#user button {
			margin : 0 auto;
			border : 1px solid #f1f1f1;
			background-color : black;
			color : #f1f1f1;
			height : 40px;
			width : 70px;
		}
		
		@media screen and (max-height: 450px) {
		  .sidenav {padding-top: 15px;}
		  .sidenav a {font-size: 18px;}
		}
	</style>
</head>
<body>

	<div id="sideNav" class="sidenav">
	  <span class="closebtn">&times;</span>
	  <a href="/main">HOME</a>
	  <a href="#">ABOUT</a>
	  <a href="#">SPENDINGS</a>
	  	<a href="/survival/spending/dailySpending">DAILY</a>
	  	<a href="/survival/spending/weeklySpending">WEEKLY</a>
	  	<a href="/survival/spending/monthlySpending">MONTHLY</a>
	  	<a href="/survival/spending/yearlySpending">YEARLY</a>
	  <a href="#">BUDGETS</a>
	  <a href="#">DEBTS</a>
	  <a href="#">RECEIVABLES</a>
	  <a href="#">INVESTS</a>
	</div>
	
	<div id="topBar">
		<span> &#9776;</span> 
		&nbsp;&nbsp;&nbsp;
		<span class="glyphicon glyphicon-piggy-bank"> LET'S SURVIVE</span>
		
		<div id="user">
		<c:choose>
			<c:when test="${loginUser ne null }">
				Welcome back ${loginUser.nm} ! &nbsp&nbsp&nbsp <button id="logout">Logout</button>
			</c:when>
			<c:otherwise>
				<button id="login" >LOGIN</button>
			</c:otherwise>
		</c:choose>
			
		</div>		
	</div>
	
</body>
</html>