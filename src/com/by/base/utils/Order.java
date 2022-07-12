package com.by.base.utils;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	/**
	 * �������� asc
	 */
	public static final int SQL_ORDER_ASC = 1;

	/**
	 * �������� desc
	 */
	public static final int SQL_ORDER_DESC = 2;

	// �����?
	private List column = new ArrayList();

	public Order() {
	}

	public Order(List column) {
		this.column = column;
	}

	public Order(String column, int type) {
		this.column.add(new Column(column,type));
	}

	public List getColumn() {
		return column;
	}

	public void setColumn(List column) {
		this.column = column;
	}
	
	public void addOrder(String column, int type) {
		this.column.add(new Column(column,type));
	}
}
