package com.sangmin.survival.spending.svc;

import java.util.Map;

import com.sangmin.survival.spending.vo.BudgetVO;

public interface SpendingSvc {

	int saveNewBudget(Map<String, Object> param);

	BudgetVO selectBudget(String id);

}
