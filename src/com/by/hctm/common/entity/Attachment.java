/*
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized
 * by MyEclipse Hibernate tool integration.
 *
 * Created Sat Aug 13 11:02:11 CST 2005 by MyEclipse Hibernate Tool.
 */
package com.by.hctm.common.entity;

import java.io.Serializable;

import com.by.base.entity.BaseAttachment;

/**
 * A class that represents a row in the ATTACHMENT table. You can customize the
 * behavior of this class by editing the class, {@link Attachment()}. WARNING:
 * DO NOT EDIT THIS FILE. This is a generated file that is synchronized * by
 * MyEclipse Hibernate tool integration.
 */
public class Attachment extends BaseAttachment implements Serializable {
	/**
	 * The cached hash code value for this instance. Settting to 0 triggers
	 * re-calculation.
	 */
	private int hashValue = 0;

	/** The composite primary key value. */
	private java.lang.Long attachmentId;

	/** The value of the simple attachmenetName property. */
	private java.lang.String attachmenetName;

	/** The value of the simple attachmentType property. */
	private java.lang.String attachmentType;

	/** The value of the simple attachmentTypeId property. */
	private java.lang.Long attachmentTypeId;

	/** The value of the simple attachmentField property. */
	private java.lang.String attachmentField;

	/** The value of the simple writer property. */
	private java.lang.String writer;
	
	/** The value of the simple writeDate property. */
	private java.util.Date writeDate;

	/** The value of the simple remark property. */
	private java.lang.String remark;
	
	/** The value of the simple remark1 property. */
	private java.lang.String remark1;
	
	/** The value of the simple remark2 property. */
	private java.lang.String remark2;
	
	
	/** 非实例化属性 */
	// 路径
	private String contextPath ;
 
	/**
	 * Simple constructor of AbstractAttachment instances.
	 */
	public Attachment() {
	}

	/**
	 * Constructor of AbstractAttachment instances given a simple primary key.
	 * 
	 * @param attachmentId
	 */
	public Attachment(java.lang.Long attachmentId) {
		this.setAttachmentId(attachmentId);
	}

	/**
	 * Return the simple primary key value that identifies this object.
	 * 
	 * @return java.lang.Long
	 */
	public java.lang.Long getAttachmentId() {
		return attachmentId;
	}

	/**
	 * Set the simple primary key value that identifies this object.
	 * 
	 * @param attachmentId
	 */
	public void setAttachmentId(java.lang.Long attachmentId) {
		this.hashValue = 0;
		this.attachmentId = attachmentId;
	}

	/**
	 * Return the value of the ATTACHMENET_NAME column.
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getAttachmenetName() {
		return this.attachmenetName;
	}

	/**
	 * Set the value of the ATTACHMENET_NAME column.
	 * 
	 * @param attachmenetName
	 */
	public void setAttachmenetName(java.lang.String attachmenetName) {
		this.attachmenetName = attachmenetName;
	}

	/**
	 * Return the value of the ATTACHMENT_TYPE column.
	 * 
	 * @return java.lang.String
	 */
	public java.lang.String getAttachmentType() {
		return this.attachmentType;
	}

	/**
	 * Set the value of the ATTACHMENT_TYPE column.
	 * 
	 * @param attachmentType
	 */
	public void setAttachmentType(java.lang.String attachmentType) {
		this.attachmentType = attachmentType;
	}

	/**
	 * Return the value of the ATTACHMENT_TYPE_ID column.
	 * 
	 * @return java.lang.Long
	 */
	public java.lang.Long getAttachmentTypeId() {
		return this.attachmentTypeId;
	}

	/**
	 * Set the value of the ATTACHMENT_TYPE_ID column.
	 * 
	 * @param attachmentTypeId
	 */
	public void setAttachmentTypeId(java.lang.Long attachmentTypeId) {
		this.attachmentTypeId = attachmentTypeId;
	}

	/**
	 * Implementation of the equals comparison on the basis of equality of the
	 * primary key values.
	 * 
	 * @param rhs
	 * @return boolean
	 */
	public boolean equals(Object rhs) {
		if (rhs == null)
			return false;
		if (!(rhs instanceof Attachment))
			return false;
		Attachment that = (Attachment) rhs;
		if (this.getAttachmentId() != null && that.getAttachmentId() != null) {
			if (!this.getAttachmentId().equals(that.getAttachmentId())) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Implementation of the hashCode method conforming to the Bloch pattern
	 * with the exception of array properties (these are very unlikely primary
	 * key types).
	 * 
	 * @return int
	 */
	public int hashCode() {
		if (this.hashValue == 0) {
			int result = 17;
			int attachmentIdValue = this.getAttachmentId() == null ? 0 : this
					.getAttachmentId().hashCode();
			result = result * 37 + attachmentIdValue;
			this.hashValue = result;
		}
		return this.hashValue;
	}

	public java.util.Date getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(java.util.Date writeDate) {
		this.writeDate = writeDate;
	}

	public java.lang.String getAttachmentField() {
		return attachmentField;
	}

	public void setAttachmentField(java.lang.String attachmentField) {
		this.attachmentField = attachmentField;
	}

	public java.lang.String getWriter() {
		return writer;
	}

	public void setWriter(java.lang.String writer) {
		this.writer = writer;
	}

	public java.lang.String getRemark() {
		return remark;
	}

	public void setRemark(java.lang.String remark) {
		this.remark = remark;
	}

	public java.lang.String getRemark1() {
		return remark1;
	}

	public void setRemark1(java.lang.String remark1) {
		this.remark1 = remark1;
	}

	public java.lang.String getRemark2() {
		return remark2;
	}

	public void setRemark2(java.lang.String remark2) {
		this.remark2 = remark2;
	}

	public String getContextPath() {
		return contextPath;
	}

	public void setContextPath(String contextPath) {
		this.contextPath = contextPath;
	}
}
