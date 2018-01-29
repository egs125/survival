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
			var canvas = document.getElementById("can");
			var ctx = canvas.getContext("2d");
			var lastend = -1.57;
			var data = [200, 60, 15]; // If you add more data values make sure you add more colors
			var myTotal = 0; // Automatically calculated so don't touch
			var myColor = ['red', 'green', 'blue']; // Colors of each slice

			for (var e = 0; e < data.length; e++) {
			  myTotal += data[e];
			}

			for (var i = 0; i < data.length; i++) {
			  ctx.fillStyle = myColor[i];
			  ctx.beginPath();
			  ctx.moveTo(canvas.width / 2, canvas.height / 2);
			  // Arc Parameters: x, y, radius, startingAngle (radians), endingAngle (radians), antiClockwise (boolean)
			  ctx.arc(canvas.width / 2, canvas.height / 2, canvas.height / 2, lastend, lastend + (Math.PI * 2 * (data[i] / myTotal)), false);
			  ctx.lineTo(canvas.width / 2, canvas.height / 2);
			  ctx.fill();
			  lastend += Math.PI * 2 * (data[i] / myTotal);
			}
		});
	</script>
		
	<style>
		 /* body {
			background-color: #cccccc;
			background-image: url("/home/resources/img/home.jpg");
   			background-position : center center;
   			background-attachment: fixed;
   			background-repeat : no-repeat;
   			background-size : cover;
		}
	 */
	</style>
</head>
<body>
	<jsp:include page="/WEB-INF/views/header.jsp" />
	
	<canvas id="can" width="200" height="200" />
	
</body>
</html>