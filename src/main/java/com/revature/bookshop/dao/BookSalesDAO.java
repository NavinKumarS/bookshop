package com.revature.bookshop.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.revature.bookshop.model.BookSales;
import com.revature.bookshop.util.ConnectionUtil;

public class BookSalesDAO {
	
	/* Author can able to view- how many books sold */
	/* Weekly */
	
	public void bookSalesWeekly(LocalDate searchDate) throws Exception {
		// 1. Get the connection
        JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
 
        // 2. Query
		String sql = "select isbn, orderDate from bookSales where (orderDate <= ? AND orderDate >= DATEADD (day , 7 , ?))";
		
		// 3. Set the input and Query execute
		List<BookSales> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<BookSales>(BookSales.class), searchDate, searchDate);
		System.out.println(books);
	}
	
	/* Monthly */
	public void bookSalesMonthly(LocalDate searchDate) throws Exception {
		// 1. Get the connection
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
 
        // 2. Query
		String sql = "select isbn, orderDate from bookSales where (MONTH(?))";
		
		// 3. Set the input and Query execute
		List<BookSales> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<BookSales>(BookSales.class), searchDate);
		System.out.println(books);

	}
	
	/* Yearly */
	public void bookSalesYearly(LocalDate searchDate) throws Exception {
		// 1. Get the connection
		JdbcTemplate jdbcTemplate = ConnectionUtil.getJdbcTemplate();
 
        // 2. Query
		String sql = "select isbn, orderDate from bookSales where (YEAR(?))";
		
		// 3. Set the input and Query execute
		List<BookSales> books = jdbcTemplate.query(sql, new BeanPropertyRowMapper<BookSales>(BookSales.class), searchDate);
		System.out.println(books);
	}
}

