package com.example.enjoyTrip.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.enjoyTrip.dto.UserDto;

@Mapper
public interface UserDao {
	
	List<UserDto> userList();
	UserDto userDetail(String userId); // 상세
	int userInsert(UserDto dto); // 등록
	int userUpdate(UserDto dto); // 수정
	int userDelete(String userId); // 삭제
	
	//로그인 체크
	UserDto loginCheck(UserDto dto);
	
}
