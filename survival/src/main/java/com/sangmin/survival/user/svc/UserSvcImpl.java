package com.sangmin.survival.user.svc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sangmin.survival.user.dao.UserDao;
import com.sangmin.survival.user.vo.UserVO;

@Service
public class UserSvcImpl implements UserSvc {
	
	@Autowired UserDao dao;

	@Override
	public UserVO userLogin(UserVO userVO) {
		return dao.userLogin(userVO);
	}
	
	
	
}
