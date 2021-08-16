package ch13.domain.userinfo.dao.mysql;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Insert into MySQL DB userID = "+ userInfo.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Update into MySQL DB userID = "+ userInfo.getUserId());
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("Delete into MySQL DB userID = "+ userInfo.getUserId());
	}

}
