package com.sangmin.survival.spending.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SpendingDao {
	
	@Autowired
	private SqlSession sql;
	
	private static final String NAMESPACE = "spendingMapper.";
}
