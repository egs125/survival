package com.sangmin.survival.spending.ctr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sangmin.survival.spending.svc.SpendingSvc;

@RequestMapping("/spending")
@Controller("spendingCtr")
public class SpendingCtr {
	
	@Autowired 
	private SpendingSvc svc;
	
	@RequestMapping("/dailySpending")
	public String dailySpending(Model model) throws Exception {
		return "/spending/dailySpending";
	}
	
}
