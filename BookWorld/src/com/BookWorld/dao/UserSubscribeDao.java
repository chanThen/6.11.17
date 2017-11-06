package com.BookWorld.dao;

import com.BookWorld.model.UserSubscribe;

public interface UserSubscribeDao {

	String addToSubscribeList(UserSubscribe userSubscribe);

	UserSubscribe checkForSubscription(int bookId, int userId);

}
