package com.revature.bookshop.model;

public class BookRatings {
	private long isbn;
	private int userID;
	private double rating;
	
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "BookRatings [isbn=" + isbn + ", userID=" + userID + ", rating=" + rating + "]";
	}
}
