package com.planner.user.model.service;

import org.apache.ibatis.session.SqlSession;

import com.planner.common.template.Template;
import com.planner.user.model.dao.UserDao;
import com.planner.user.model.vo.User;

public class UserServiceImpl implements UserService {
	
	private UserDao uDao = new UserDao();
	private Template t = new Template();
	
	@Override
	public int insertUser(User u) {
		/*
		 * 기존의 방식
		 * Connection conn = JDBCTemplate.getConnection();
		 * int result = new MemberDao().insertMember(conn, m);
		 * if(result>0) { 
		 * 		JDBCTemplate.commit(conn);
		 * }else{
		 * 		JDBCTemplate.rollback(conn);
		 * }
		 * JDBCTemplate.close(conn);
		 * 
		 * return result;
		 */
		
		// mybatis-config.xml + xxx-mapper.xml 읽기 
		SqlSession sqlSession = t.getSqlSessionForClass();
		int result = uDao.insertUser(sqlSession, u);
		t.commitAndClose(sqlSession, result);
		return result;
		
	}

	
	@Override
	public User loginUser(User u) {
		SqlSession sqlSession = t.getSqlSessionForClass();
		User loginUser = uDao.loginUser(sqlSession, u);
		t.close(sqlSession);
		return loginUser;
	}

}
