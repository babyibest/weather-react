package com.by.base.utils;

import java.util.ArrayList;
import java.util.List;

public class Condition {
	/**
	 * �����������?AND
	 */
	public static final boolean PARAMETER_AND = true;

	/**
	 * �����������?OR
	 */
	public static final boolean PARAMETER_OR = false;

	/**
	 * ���ҵ���
	 */
	private Class objectClass = null;

	/**
	 * ��ѯ�������?And
	 */
	private List parameterAnd = new ArrayList();

	/**
	 * ��ѯ�������?Or
	 */
	private List parameterOr = new ArrayList();

	/**
	 * ����
	 */
	private Order order = null;

	/**
	 * ����
	 */
	private Group group = null;

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Condition() {
	}

	public Condition(Class objectClass) {
		this.objectClass = objectClass;
	}

	public Condition(Parameter parameter, boolean operType) {
		if (operType) {
			this.parameterAnd.add(parameter);
		} else {
			this.parameterOr.add(parameter);
		}
	}

	public Condition(Class objectClass, Parameter parameter, boolean operType) {
		this.objectClass = objectClass;
		if (operType) {
			this.parameterAnd.add(parameter);
		} else {
			this.parameterOr.add(parameter);
		}
	}

	public Condition(Class objectClass, List parameter, boolean operType) {
		this.objectClass = objectClass;
		if (operType) {
			this.parameterAnd = parameter;
		} else {
			this.parameterOr = parameter;
		}
	}

	public Condition(Class objectClass, List parameterAnd, List parameterOr) {
		this.objectClass = objectClass;
		this.parameterAnd = parameterAnd;
		this.parameterOr = parameterOr;
	}

	public List getParameterOr() {
		return parameterOr;
	}

	public void setParameterOr(List parameterOr) {
		this.parameterOr = parameterOr;
	}

	public List getParameterAnd() {
		return parameterAnd;
	}

	public void setParameterAnd(List parameterAnd) {
		this.parameterAnd = parameterAnd;
	}

	public Class getObjectClass() {
		return objectClass;
	}

	public void setObjectClass(Class objectClass) {
		this.objectClass = objectClass;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	/**
	 * ���ò�ѯ���?And
	 * 
	 * @param par
	 */
	public void addParameterAnd(Parameter par) {
		this.parameterAnd.add(par);
	}

	/**
	 * ���ò�ѯ���?Or
	 * 
	 * @param par
	 */
	public void addParameterOr(Parameter par) {
		this.parameterOr.add(par);
	}

	/**
	 * ���ò�ѯ���?����
	 * 
	 * @param order
	 */
	public void addOrder(Order order) {
		this.order = order;
	}
	
	/**
	 * ���ò�ѯ���?����
	 * 
	 * @param group
	 */
	public void addGroup(Group group) {
		this.group = group;
	}
}
