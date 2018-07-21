package com.business.model;
import com.base.model.BaseModel;

public class StOpportunitiesRecommendModel extends BaseModel {
	

	
	private Integer companyevaluate;//
	private String oppname;
	private Integer issuserid;//推荐人id
	//以下为非数据库字段
	
	private Integer customercompsizeid;
	
	
	public Integer getCustomercompsizeid() {
		return customercompsizeid;
	}
	public void setCustomercompsizeid(Integer customercompsizeid) {
		this.customercompsizeid = customercompsizeid;
	}
	public Integer getIssuserid() {
		return issuserid;
	}
	public void setIssuserid(Integer issuserid) {
		this.issuserid = issuserid;
	}
	public Integer getPersonevaluate() {
		return personevaluate;
	}
	public void setPersonevaluate(Integer personevaluate) {
		this.personevaluate = personevaluate;
	}
	public Integer getCompanyevaluate() {
		return companyevaluate;
	}
	public void setCompanyevaluate(Integer companyevaluate) {
		this.companyevaluate = companyevaluate;
	}
	public String getOppname() {
		return oppname;
	}
	public void setOppname(String oppname) {
		this.oppname = oppname;
	}
	public Integer getGradeid() {
		return gradeid;
	}
	public void setGradeid(Integer gradeid) {
		this.gradeid = gradeid;
	}
	
	public Double getPaynum() {
		return paynum;
	}
	public void setPaynum(Double paynum) {
		this.paynum = paynum;
	}
	
}