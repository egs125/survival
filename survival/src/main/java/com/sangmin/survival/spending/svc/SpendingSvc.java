package com.sangmin.survival.spending.svc;

import java.util.List;
import java.util.Map;

import com.sangmin.survival.spending.vo.BudgetVO;
import com.sangmin.survival.spending.vo.SpendingVO;

public interface SpendingSvc {

	int saveNewBudget(Map<String, Object> param);

	BudgetVO retrieveBudget(String id);

	List<SpendingVO> retrieveSpendingList(String id);

	int setBudget(Map<String, Object> params);

}
