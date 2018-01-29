package com.sangmin.survival.spending.svc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangmin.survival.spending.dao.SpendingDao;

@Service
public class SpendingSvcImpl implements SpendingSvc{
	
	@Autowired
	private SpendingDao dao;
}
