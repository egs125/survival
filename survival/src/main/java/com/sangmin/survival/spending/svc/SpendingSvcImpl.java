package com.sangmin.survival.spending.svc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangmin.survival.spending.dao.SpendingDao;
import com.sangmin.survival.spending.vo.BudgetVO;
import com.sangmin.survival.spending.vo.SpendingVO;

@Service
public class SpendingSvcImpl implements SpendingSvc{
	
	@Autowired
	private SpendingDao dao;

	@Override
	public BudgetVO retrieveBudget(String id) {
		return dao.retrieveBudget(id);
	}
	
	@Override
	public int saveNewBudget(Map<String, Object> param) {
		return dao.saveNewBudget(param);
	}

	@Override
	public List<SpendingVO> retrieveSpendingList(String id) {
		return dao.retrieveSpendingList(id);
	}

	
}
