package com.example.enjoyTrip.service;

import java.util.List;

import com.example.enjoyTrip.dto.UserDto;

public interface UserService {
	List<UserDto> userList();
	UserDto userDetail(String userId); // 상세
	int userInsert(UserDto dto); // 등록
	int userUpdate(UserDto dto); // 수정
	int userDelete(String userId); // 삭제
	UserDto loginCheck(UserDto dto);
	
}
