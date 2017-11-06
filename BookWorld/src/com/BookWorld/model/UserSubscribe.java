package com.BookWorld.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_subscribe")
public class UserSubscribe {
	
	@Id
	@GeneratedValue
	@Column(name="subscribeId")
	private int subscribeId;
	
	@Column(name="userId")
	private int userId;
	
	@Column(name="bookId")
	private int bookId;

	public int getSubscribeId() {
		return subscribeId;
	}

	public void setSubscribeId(int subscribeId) {
		this.subscribeId = subscribeId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	
}
