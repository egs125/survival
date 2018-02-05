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
	
	<link rel="stylesheet" href="/survival/resources/css/spending/dailySpending.css">
	<script type="text/javascript" src="/survival/resources/js/spending/dailySpending.js"></script>
	
</head>
<body>
	<jsp:include page="/WEB-INF/views/header.jsp" />
	
	<div id="body">
		<div id="goal">
		<c:if test="${budget.dailyBudget eq null }">
			<h2>아직 예산 설정을 하지 않으셨습니다.</h2>
			<br>
			<h4>일일 예산액을 설정하고 절약요정이 되어봅시다.</h4>
			<br><br>
			<div id="setAmount">
				나의 일일 예산액은  <input type="number" id="dailyBudgetAmt" />
				<br><br>
				<button id="setBtn">Set!</button> 
				<br><br>
				<a href="#">★얼마로 해야할지 잘 모르시겠다면 클릭!</a>
				<br>		
			</div>	
		</c:if>
		<c:if test="${budget.dailyBudget ne null }">
			<h2>오늘 예산  ${budget.dailyBudget}원 중   ${budget.totalAmt}원 사용 </h2>
			<input id="dailyBudget" type="hidden" value="${budget.dailyBudget}"/>
			<input id="totalSpending" type="hidden" value="  ${budget.totalAmt}"/>
			<button id="resetBtn">
				<span class="glyphicon glyphicon-cog"></span> 일일 예산 재설정
			</button>
	
  			<div id="changeAmt">
				현재 예산액  <input type="text" id="curBudgetAmt" value="${budget.dailyBudget}" readonly />
				<br>
				수정 예산액  <input type="number" id="newBudgetAmt" />
				<br><br>
				<button id="changeSaveBtn">Save</button> &nbsp;&nbsp; <button id="cancelBtn">Cancel</button>
				<br>		
			</div>				
		</div> <!-- end of div goal -->
		
		<div id="spendingBar" class="progress">
			<div class="progress-bar progress-bar-warning progress-bar-striped" role="progressbar" aria-valuenow="45" aria-valuemin="0" aria-valuemax="100">
		    	<span id="spendingPer"></span>
		  	</div>
		</div>
		
		<div id="list">
			<c:if test="${budget.spendingList ne null }">
				<div class="panel panel-default">
				<button id="spendSaveBtn">Save</button>	
				<table class="table">
					<tr><th>category</th><th>amount</th><th>date</th><th>memo</th><th>Delete</th></tr>
					<c:forEach var="list" items="${budget.spendingList}">
					<tr>
						<td><input name="category" type="text" value="${list.category}" /></td>
						<td><input name="amount" type="number" value="${list.amount}" /></td>
						<td><input name="date" type="date" value="${list.date}" /></td>
						<td><input name="memo" type="text" value="${list.memo}" /></td>
						<td><input type="button" value=""></td>
					</tr>	
					</c:forEach>
					<tr>
						<td><input name="category" type="text" /></td>
						<td><input name="amount" type="number" /></td>
						<td><input name="date" type="date" /></td>
						<td><input name="memo" type="text" /></td>
						<td><input type="button" value=""></td>
					</tr>
				</table>
				</div>
			</c:if>
		</div>
		</c:if> <!-- c:if test="${budget ne null }" end -->
	</div>
</body>
</html>