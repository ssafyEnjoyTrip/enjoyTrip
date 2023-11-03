package com.example.enjoyTrip.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.enjoyTrip.dao.UserDao;
import com.example.enjoyTrip.dto.UserDto;

@Service
public class UserServiceImpl implements UserService{

	UserDao dao;
	
	public UserServiceImpl(UserDao dao) {
		this.dao = dao;
	}

	@Override
	public List<UserDto> userList() {
		return dao.userList();
	}

	@Override
	public UserDto userDetail(String userId) {
		return dao.userDetail(userId);
	}

	@Override
	public int userInsert(UserDto dto) {
		return dao.userInsert(dto);
	}

	@Override
	public int userUpdate(UserDto dto) {
		return dao.userUpdate(dto);
	}

	@Override
	public int userDelete(String userId) {
		return dao.userDelete(userId);
	}

}
