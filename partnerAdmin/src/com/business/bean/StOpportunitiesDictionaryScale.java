package com.business.bean;
import com.base.bean.BaseBean;


public class StOpportunitiesDictionaryScale extends BaseBean {
	
	
	
	//非数据库字段，用于填写页面数据
	private Integer scaleid;
	private double cashback;
	
	
	
	public double getCashback() {
		return cashback;
	}
	public void setCashback(double cashback) {
		this.cashback = cashback;
	}
	public Integer getScaleid() {
		return scaleid;
	}
	public void setScaleid(Integer scaleid) {
		this.scaleid = scaleid;
	}
	
}