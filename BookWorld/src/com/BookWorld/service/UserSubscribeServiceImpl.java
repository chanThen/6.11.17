package com.BookWorld.service;

import com.BookWorld.dao.UserSubscribeDao;
import com.BookWorld.dao.UserSubscribeDaoImpl;
import com.BookWorld.model.UserSubscribe;

public class UserSubscribeServiceImpl implements UserSubscribeService {

	UserSubscribeDao userSubscribeDao = new UserSubscribeDaoImpl();

	@Override
	public UserSubscribe checkForSubscription(int bookId, int userId) {
		
		return userSubscribeDao.checkForSubscription(bookId, userId);
	}

	@Override
	public String addToSubscribeList(UserSubscribe userSubscribe) {
		
		return userSubscribeDao.addToSubscribeList(userSubscribe);
	}

	
}
