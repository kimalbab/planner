package com.planner.common.template;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Template {
	
	/*
	 * 기존 JDBC
	 * public static Connection getConnection(){
	 * 		// driver.properties 파일 읽어들여서
	 *		// 해당 DB와 접속된 Connection 객체 생성해서 반환
	 * }
	 * 
	 * public static void close(JDBC용객체){
	 *		// 전달받은 JDBC용 객체 반납
	 * }
	 * 
	 * public static void commit|rollback(Connection) {
	 * 		// 트랜잭션 처리
	 * }
	 */
	
	public static SqlSession getSqlSession() {
		// mybatis-config.xml 파일 읽어들여서
		// 해당 DB와 접속된 SqlSession 객체 생성해서 반환
		SqlSession sqlSession = null;
		
		// SqlSession 생성하기 위해서 => SqlSessionFactory 객체 필요
		// SqlSessionFactory 생성하기 위해서 => SqlSessionFactoryBuilder 객체 필요
		
		try {
			// /config/mybatis-config.xml 파일을 읽어들이기 위한 입력용스트림
			// 만약 여기서 classNotFoundException 이 뜬다면 propertyes > Depolyment Assembly > Java Build Path Entries > maven 통채로 추가
			InputStream stream = Resources.getResourceAsStream("/config/mybatis-config.xml");
			sqlSession = new SqlSessionFactoryBuilder().build(stream).openSession(false);
			System.out.println("connected");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return sqlSession;
		
	}
	
	public SqlSession getSqlSessionForClass() {
		SqlSession sqlSession = Template.getSqlSession();
		return sqlSession;
	}

	public void commitAndClose(SqlSession sqlSession, int result) {
		if(result > 0) {
			sqlSession.commit();
		}
		sqlSession.close();
	}

	public void close(SqlSession sqlSession) {
		sqlSession.close();
	}


}
