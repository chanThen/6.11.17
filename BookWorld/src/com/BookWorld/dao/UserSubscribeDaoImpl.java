package com.BookWorld.dao;

import com.BookWorld.model.UserSubscribe;
import com.BookWorld.util.HibernateUtil;

public class UserSubscribeDaoImpl implements UserSubscribeDao {
	
	HibernateUtil hibernateUtil =  new HibernateUtil();
	
	@Override
	public String addToSubscribeList(UserSubscribe userSubscribe) {
		
		hibernateUtil.openCurrentSessionwithTransaction();
		hibernateUtil.getCurrentSession().save(userSubscribe);
		hibernateUtil.closeCurrentSessionwithTransaction();
		return "Success";
	}

	@Override
	public UserSubscribe checkForSubscription(int bookId, int userId) {
		
		hibernateUtil.openCurrentSessionwithTransaction();
		UserSubscribe userSubscribe = (UserSubscribe) hibernateUtil.getCurrentSession().createQuery("from UserSubscribe where bookId='"+bookId+"' and userId = '"+userId+"'").uniqueResult();
		hibernateUtil.closeCurrentSessionwithTransaction();
		return userSubscribe;
	}

}
