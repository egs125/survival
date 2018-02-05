/**
 * 
 */
$(function(){
	
	setProgressBar();
	
	$('#setBtn').on('click', function(){
		setNewBudget();		
	});
	
	$('#resetBtn').on('click',function(){
		$('#spendingBar').attr('style', 'margin-top:150px;');
		$('#list').attr('style', 'margin-top:150px;');
		$('#changeAmt').attr('style', 'display:block;');
	});
	
	$('#changeSaveBtn').on('click', function(){
		resetBudget();
	});
	
	$('#cancelBtn').on('click', function(){
		$('#spendingBar').attr('style', 'margin-top:0px;');
		$('#list').attr('style', 'margin-top:0px;');
		$('#changeAmt').attr('style', 'display:none;');
	});
	
	$('#spendSaveBtn').on('click', function(){
		
	});
});

function setProgressBar(){
	
	var budget =  $("#dailyBudget").val();
	var spending = $("#totalSpending").val();
	var percent = Math.round(spending / budget * 100);
	$('#spendingBar > div').attr('style', 'width:' + percent);
	$('#spendingPer').text(percent + "%");
}

function setNewBudget(){

	var budget = $('#dailyBudgetAmt').val();
	if(budget == null || budget == ''){
		alert("예산금액을 설정해주세요!");
		return false;
	}
	
	setBudget(budget);
	/*
	var form = $('<form></form>');
	form.attr('action', 'setNewBudget');
	form.attr('method', 'post');
		
	var el = $('<input type="hidden" value="' + budget + '" name="budget">');
	form.appendTo('body');
	form.append(el);
	form.submit();
	$('body').removeChild(form);*/
}


function resetBudget(){
	
	var budget = $('#newBudgetAmt').val();
	if(budget == null || budget == ''){
		alert("예산금액을 설정해주세요!");
		return false;
	}
	
	setBudget(budget);
}

function setBudget(budget){
	
	var param = {"budget" : budget};
	
	$.ajax({
		url  : "setBudget",
		type : "post",
		data : param,
		dataType : "json",
		async: true,
		success : function(data){
			console.log("success");
			console.log(data);
		},
		error : function(){
			console.log("error");
		},
		complete : function(data){
			console.log(data);
			$('#spendingBar').attr('style', 'margin-top:0px;');
			$('#list').attr('style', 'margin-top:0px;');
			$('#changeAmt').attr('style', 'display:none;');
		}
	});
}