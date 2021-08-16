package ch13.domain.userinfo.dao.oracle;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoOraclaDao implements UserInfoDao {
	@Override
	public void insertUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Insert into Oracla DB userID = "+ userInfo.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Update into Oracla DB userID = "+ userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Delete into Oracla DB userID = "+ userInfo.getUserId());
	}
	
}
