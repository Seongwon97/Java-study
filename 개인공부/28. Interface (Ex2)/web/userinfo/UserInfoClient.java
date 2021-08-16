package ch13.web.userinfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOraclaDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		// properties는 파일 내에 쌍으로 된 것들을 읽어올 수 있는 기능 
		// ex) <id = tjddnjs>에서 id와 tjddnjs을 둘 다 읽어올 수 있다.
		
		prop.load(fis);
		// file을 로드
		
		String dbType = prop.getProperty("DBTYPE");
		// DBTYPE에 해당하는 값을 읽어온다.
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("12345");
		userInfo.setPassword("12~12");
		userInfo.setUserName("James");
		
		UserInfoDao userInfoDao = null;
		
		if (dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOraclaDao();
		}
		else if (dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMysqlDao();
		}
		else {
			System.out.println("DB error");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}

}
