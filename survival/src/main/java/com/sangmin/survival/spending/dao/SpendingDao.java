package com.sangmin.survival.spending.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sangmin.survival.spending.vo.BudgetVO;

@Repository
public class SpendingDao {
	
	@Autowired
	private SqlSession sql;
	
	private static final String NAMESPACE = "spendingMapper.";

	public BudgetVO selectBudget(String id) {
		return sql.selectOne(NAMESPACE + "selectBudget", id);
	}
	
	public int saveNewBudget(Map<String, Object> param) {
		return sql.insert(NAMESPACE + "saveNewBudget", param);
	}

	
}
