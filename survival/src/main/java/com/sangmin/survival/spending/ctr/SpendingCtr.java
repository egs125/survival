package com.sangmin.survival.spending.ctr;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sangmin.survival.spending.svc.SpendingSvc;
import com.sangmin.survival.spending.vo.BudgetVO;
import com.sangmin.survival.spending.vo.SpendingVO;
import com.sangmin.survival.user.vo.UserVO;

@RequestMapping("/spending")
@Controller("spendingCtr")
public class SpendingCtr {
	
	@Autowired 
	private SpendingSvc svc;
	
	@RequestMapping("/dailySpending")
	public String dailySpending(HttpSession session, Model model) throws Exception {
		String id = ((UserVO) session.getAttribute("loginUser")).getId();
		BudgetVO budget = svc.retrieveBudget(id);
		if(null != budget) {
			List<SpendingVO> list = svc.retrieveSpendingList(id);
			budget.setSpendingList(list);
		}
		session.setAttribute("budget", budget);
		return "/spending/dailySpending";
	}
	
	@RequestMapping("/setNewBudget")
	public String saveNewBudget(HttpSession session, Model model, @RequestParam String budget) throws Exception {
		
		Map<String, Object> param = new HashMap<String, Object>();
		String loc = "";
		
		param.put("id", ((UserVO) session.getAttribute("loginUser")).getId());
		param.put("budget", budget);
		int result = svc.saveNewBudget(param);
		if(result > 0) loc="/survival/success";
		else loc = "/survival/fail";
		
		return loc;
	}
	
}
