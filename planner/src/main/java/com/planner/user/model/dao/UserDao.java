package com.planner.user.model.dao;

import org.apache.ibatis.session.SqlSession;

import com.planner.user.model.vo.User;

public class UserDao {
	
	public int insertUser(SqlSession sqlSession, User u) {
		/*
		 * 기존에 순수 JDBC 과정 
		 * 
		 * int result = 0;
		 * PreparedStatement pstmt = null;
		 * String sql = prop.getProperty("insertMember");
		 * 
		 * try{
		 * 		pstmt = conn.prepareStatment(sql);
		 * 		pstmt.setString(1, m.getUserId());
		 * 		pstmt.setString(2, m.getUserPwd());
		 * 		.....
		 * 
		 * 		result = pstmt.executeUpdate();
		 * 
		 * } catch(XXX){
		 * 
		 * } finally{
		 *   close(pstmt);
		 * }
		 * 
		 * ==> sqlSession 에서 제공하는 메소드를 이용해서 sql 문 찾아서 실행 후 결과를 바로 받음
		 * ==> sqlSession.sql 문 종류에 맞는 메소드("매퍼의 별칭.해당sql고유id",  [그sql문을 완성시킬 객체]);
		 */
		return sqlSession.insert("userMapper.insertUser", u);
		
	}
	
	public User loginUser(SqlSession sqlSession, User u) {
		/*
		 * Member loginUser = null;
		 * PreparedStatement pstmt = null;
		 * ResultSet rset = null;
		 * 
		 * String sql = prop.getProperty("loginMember");
		 * 
		 * try{
		 * 		pstmt = conn.prepareStatement(sql);
		 * 		pstmt.setString(1, m.getUserId());
		 * 		pstmt.setString(2, m.getUserPwd());
		 * 
		 * 		rset = pstmt.executeQuery();
		 * 
		 * 		if(rset.next()){
		 * 			loginUser = new Member(rset.getInt("user_no"),
		 * 								   rset.getString("user_id"),
		 * 								   ...);
		 *  	}
		 * }catch(XXXX) {
		 * 
		 * }
		 * 
		 */
		// selectOne 메소드 : 조회결과가 없다면 null반환
		User loginUser = sqlSession.selectOne("UserMapper.loginUser", u);
		return loginUser;
	}
}
