package com.sangmin.survival.spending.svc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangmin.survival.spending.dao.SpendingDao;
import com.sangmin.survival.spending.vo.BudgetVO;

@Service
public class SpendingSvcImpl implements SpendingSvc{
	
	@Autowired
	private SpendingDao dao;

	@Override
	public BudgetVO selectBudget(String id) {
		return dao.selectBudget(id);
	}
	
	@Override
	public int saveNewBudget(Map<String, Object> param) {
		return dao.saveNewBudget(param);
	}

	
}
