package com.sangmin.survival.user.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sangmin.survival.user.vo.UserVO;

import common.dao.AbstractDAO;

@Repository
public class UserDao extends AbstractDAO{

	@Autowired private SqlSession sql;
	private static final String NAMESPACE = "userMapper.";

	public UserVO userLogin(UserVO userVO) {
		return sql.selectOne(NAMESPACE + "userLogin", userVO);
	}

}
