package com.revature.bookshop.model;

public class BookInventory {
	
	private long isbn;
	private int quantity;
	
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "BookInventory [isbn=" + isbn + ", quantity=" + quantity + "]";
	}
}
	

	