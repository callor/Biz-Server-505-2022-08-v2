package com.callor.todo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.todo.model.AuthorityVO;
import com.callor.todo.model.UserVO;
import com.callor.todo.service.UserService;

@Service("userServiceV1")
public class UserServiceImplV1 implements UserService{
	
	
	@Override
	public void create_user_table() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create_auth_table() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AuthorityVO> select_auths(String username) {
		return null;
	}

	@Override
	public List<UserVO> selectAll() {
		return null;
	}

	@Override
	public UserVO findById(String id) {
		return null;
	}

	@Override
	public int insert(UserVO vo) {
		return 0;
		
	}

	@Override
	public int update(UserVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int role_insert(List<AuthorityVO> auths) {
		// TODO Auto-generated method stub
		return 0;
	}

}
