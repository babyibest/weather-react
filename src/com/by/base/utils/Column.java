package com.by.base.utils;

public class Column {

	// �����?
	private String column;
	
	//����
	private String alias;

	// ��ѯ���?
	private int operator;

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Column() {
	}
	
	public Column(String column, int operator) {
		this.column = column;
		this.operator = operator;		
	}

	public Column(String column, int operator,String alias) {
		this.column = column;
		this.operator = operator;
		this.alias = alias;
	}

	public String getColumn() {
		return column;
	}

	public void setColumn(String column) {
		this.column = column;
	}

	public int getOperator() {
		return operator;
	}

	public void setOperator(int operator) {
		this.operator = operator;
	}

}
