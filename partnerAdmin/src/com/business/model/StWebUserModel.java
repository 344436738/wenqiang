package com.business.model;
import java.io.File;
import java.sql.Blob;

import com.base.model.BaseModel;

public class StWebUserModel extends BaseModel {
	

	
	private String companyname;//
	private String qq;//
	private String email;//
	private String website;//
	private String wechat;//
	private String logo;//路径
	
	
	//以下为非数据库字段 用于查询
	private Integer industryid;
	private Integer userid;//企业id
	private java.util.Date startdate;//开始日期
	private java.util.Date enddate;//结束日期
	
	//积分消费获得
	private java.util.Date gettime;//
	private String reson;//
	private Double getscore;// 
	private Double exchangescore;// 
	
	
	private Integer resumeNumber;//简历个数
	
	private Integer resumeAdoptNumber;//通过简历个数
	
	public Integer getResumeNumber() {
		return resumeNumber;
	}
	public void setResumeNumber(Integer resumeNumber) {
		this.resumeNumber = resumeNumber;
	}
	public Integer getResumeAdoptNumber() {
		return resumeAdoptNumber;
	}
	public void setResumeAdoptNumber(Integer resumeAdoptNumber) {
		this.resumeAdoptNumber = resumeAdoptNumber;
	}

	public Double getExchangeIntegral() {
		return exchangeIntegral;
	}
	public void setExchangeIntegral(Double exchangeIntegral) {
		this.exchangeIntegral = exchangeIntegral;
	}
	public Double getCurrentIntegration() {
		return currentIntegration;
	}
	public void setCurrentIntegration(Double currentIntegration) {
		this.currentIntegration = currentIntegration;
	}

	private Double exchangeIntegral;//兑换机分 统计
	
	private  Double currentIntegration;//当前积分
	
	
	public java.util.Date getGettime() {
		return gettime;
	}
	public void setGettime(java.util.Date gettime) {
		this.gettime = gettime;
	}
	public String getReson() {
		return reson;
	}
	public void setReson(String reson) {
		this.reson = reson;
	}
	public Double getGetscore() {
		return getscore;
	}
	public void setGetscore(Double getscore) {
		this.getscore = getscore;
	}
	public Double getExchangescore() {
		return exchangescore;
	}
	public void setExchangescore(Double exchangescore) {
		this.exchangescore = exchangescore;
	}
	public String getWechat() {
		return wechat;
	}
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	
		return industryid;
	}
	public void setIndustryid(Integer industryid) {
		this.industryid = industryid;
	}
	public void setScore(Double score) {

	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public java.util.Date getStartdate() {
		return startdate;
	}
	public void setStartdate(java.util.Date startdate) {
		this.startdate = startdate;
	}
	public java.util.Date getEnddate() {
		return enddate;
	}
	public void setEnddate(java.util.Date enddate) {
		this.enddate = enddate;
	}

	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	
	
}