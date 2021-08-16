package ch13.domain.userinfo.dao;

import ch13.domain.userinfo.UserInfo;

public interface UserInfoDao {
	// User에 대한 DB operation을 할때 구현해야하는 것인 ~~가 있다를 나타내는 것
	
	void insertUserInfo(UserInfo userInfo);
	void updateUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
}
