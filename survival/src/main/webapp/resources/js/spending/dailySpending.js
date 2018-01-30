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
	
	$('#saveBtn').on('click', function(){
		resetBudget();
	});
	
	$('#cancelBtn').on('click', function(){
		$('#spendingBar').attr('style', 'margin-top:0px;');
		$('#list').attr('style', 'margin-top:0px;');
		$('#changeAmt').attr('style', 'display:none;');
	});
});

function setProgressBar(){
	
	var percent = "50%";
	$('#spendingBar > div').attr('style', 'width:' + percent);
	$('#spendingPer').text(percent);
}

function setNewBudget(){

	var budget = $('#dailyBudgetAmt').val();
	if(budget == null || budget == ''){
		alert("예산금액을 설정해주세요!");
		return false;
	}
	
	var form = $('<form></form>');
	form.attr('action', 'setNewBudget');
	form.attr('method', 'post');
		
	var el = $('<input type="hidden" value="' + budget + '" name="budget">');
	form.appendTo('body');
	form.append(el);
	form.submit();
}


function resetBudget(){
	
	
	$('#changeAmt').attr('style', 'display:none;');
}