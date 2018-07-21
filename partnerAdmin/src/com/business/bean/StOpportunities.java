package com.business.bean;
import com.base.bean.BaseBean;


public class StOpportunities extends BaseBean {
	
	
	private Integer customercompsizeid;
	private Integer issuserid;//   
	private Integer userid;//  
	
	//非数据库字段
	private String companyname;//商机推荐给的公司名称
	private Integer checkstatus;//确认状态
	private Integer paystatus;//支付状态
	private Double paynum;//奖金
	private Integer companyevaluate;//对公司评价状态
	
	
	StOpportunities(){}
	
	
	public StOpportunities(String customercompname, 
			Integer customercompsizeid,
			String customername,
			String customerposition,
			String customertel,
			String requirementstype,
			String requirementsdescribe,
			Integer companyid){
		this.customercompname=customercompname;
		this.customername=customername;
		this.customercompsizeid=customercompsizeid;
		this.customername=customername;
		this.customerposition=customerposition;
		this.customertel=customertel;
		this.requirementstype=requirementstype;
		this.recommenddescribe=requirementsdescribe;
		this.userid=companyid;		
	}
	private Integer status;//   
	public Integer getIssuserid() {
	public Integer getUserid() {
	public Integer getStatus() {
	public Integer getCustomercompsizeid() {
		return customercompsizeid;
	}
	public void setCustomercompsizeid(Integer customercompsizeid) {
		this.customercompsizeid = customercompsizeid;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public Integer getCheckstatus() {
		return checkstatus;
	}
	public void setCheckstatus(Integer checkstatus) {
		this.checkstatus = checkstatus;
	}
	public Integer getPaystatus() {
		return paystatus;
	}
	public void setPaystatus(Integer paystatus) {
		this.paystatus = paystatus;
	}
	public Double getPaynum() {
		return paynum;
	}
	public void setPaynum(Double paynum) {
		this.paynum = paynum;
	}
	public Integer getCompanyevaluate() {
		return companyevaluate;
	}
	public void setCompanyevaluate(Integer companyevaluate) {
		this.companyevaluate = companyevaluate;
	}
}