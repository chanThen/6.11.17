package com.BookWorld.service;

import com.BookWorld.model.UserSubscribe;

public interface UserSubscribeService {

	String addToSubscribeList(UserSubscribe userSubscribe);

	UserSubscribe checkForSubscription(int bookId, int userId);
}