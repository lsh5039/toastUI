package com.toast.grid;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Oracle {
	  //로깅을 위한 변수 선언
    private static final Logger logger= LoggerFactory.getLogger(Oracle.class);
    private static final String DRIVER
    ="oracle.jdbc.driver.OracleDriver";
    //연결문자열 jdbc:oracle:thin:@호스트:포트:sid
    private static final String URL
    ="jdbc:oracle:thin:@database-1.cideueqmfrk2.us-east-2.rds.amazonaws.com:1521:ORCL";
    private static final String USER="root";//아이디
    private static final String PW="dltmdgns1!";//
    
    @Test//Junit이 테스트하는 메소드
    public void test() throws ClassNotFoundException {
        Class.forName(DRIVER);//jdbc 드라이버 로딩
        
        //괄호안에 리소스 자동 삭제 
        try(Connection conn=DriverManager.getConnection(URL, USER, PW)){
            logger.info("오라클에 연결되었습니다");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
    
    

