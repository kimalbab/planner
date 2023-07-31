package com.planner.user.model.service;

import com.planner.user.model.vo.User;

public interface UserService {
	
	// 인터페이스의 모든 메소드는 추상메소드 (미완성 메소드)로만 작성해야 함
	
	// 1. 회원가입 
	int insertUser(User u);
	
	// 2. 로그인 처리
	User loginUser(User u);
	

}
