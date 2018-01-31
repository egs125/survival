package com.sangmin.survival.spending.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sangmin.survival.spending.vo.BudgetVO;
import com.sangmin.survival.spending.vo.SpendingVO;

@Repository
public class SpendingDao {
	
	@Autowired
	private SqlSession sql;
	
	private static final String NAMESPACE = "spendingMapper.";

	public BudgetVO retrieveBudget(String id) {
		return sql.selectOne(NAMESPACE + "retrieveBudget", id);
	}
	
	public int saveNewBudget(Map<String, Object> param) {
		return sql.insert(NAMESPACE + "saveNewBudget", param);
	}

	public List<SpendingVO> retrieveSpendingList(String id) {
		return sql.selectList(NAMESPACE + "retrieveSpendingList", id);
	}

	
}
