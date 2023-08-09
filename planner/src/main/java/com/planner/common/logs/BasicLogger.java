package com.planner.common.logs;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




public class BasicLogger {
	 private Logger allLog;  // 인스턴스 변수로 변경

    public BasicLogger() {
        allLog = LogManager.getLogger(Log4j2.class);  // 생성자에서 초기화
    }
	public static void main(String[] args) {
		Logger allLog = LogManager.getLogger(Log4j2.class);
		allLog.info("logTestString 출력 ::: " );
		allLog.info("------------------------로그 테스트 입니다-------------------------");
	}

	public String info(String s) {
		return s;
	}

	public String exception(String string, Exception e) {
		return e.toString();
	}
	

}
