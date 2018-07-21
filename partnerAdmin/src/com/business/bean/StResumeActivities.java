package com.business.bean;
import java.util.Date;

import com.base.bean.BaseBean;


public class StResumeActivities extends BaseBean {
	
	
	@Override
	public String toString() {
		return "StResumeActivities [id=" + id + ", title=" + title
				+ ", homeimg=" + homeimg + ", startdate=" + startdate
				+ ", enddate=" + enddate + ", uploadleast=" + uploadleast
				+ ", intro=" + intro + ", introContent=" + introContent
				+ ", uploadnum=" + uploadnum + ", industryid=" + industryid
				+ ", signupend=" + signupend + ", uploadstart=" + uploadstart
				+ ", uploadend=" + uploadend + ", downloadstart="
				+ downloadstart + ", t1=" + t1 + ", t2=" + t2 + ", t3=" + t3
				+ ", t4=" + t4 + ", t5=" + t5 + ", t6=" + t6 + ", joinnum="
				+ joinnum + "]";
	}
	private Integer id;//   
		return t5;
	}
	public void setT5(String t5) {
		this.t5 = t5;
	}
	public String getT6() {
		return t6;
	}
	public void setT6(String t6) {
		this.t6 = t6;
	}
	private java.util.Date startdate;//   
	
	private Date signupend; //报名截止时间
	
	private Date uploadstart; //上传开始时间
	private Date uploadend; //上传截止时间
	private Date downloadstart; //下载开始时间
	
	private  String t1;
	private  String t2;
	private  String t3;
	private  String t4;
	private  String t5;
	private  String t6;
	
	public String getT1() {
		return t1;
	}
	public void setT1(String t1) {
		this.t1 = t1;
	}
	public String getT2() {
		return t2;
	}
	public void setT2(String t2) {
		this.t2 = t2;
	}
	public String getT3() {
		return t3;
	}
	public void setT3(String t3) {
		this.t3 = t3;
	}
	public String getT4() {
		return t4;
	}
	public void setT4(String t4) {
		this.t4 = t4;
	}
	public Date getSignupend() {
		return signupend;
	}
	public void setSignupend(Date signupend) {
		this.signupend = signupend;
	}
	public Date getUploadstart() {
		return uploadstart;
	}
	public void setUploadstart(Date uploadstart) {
		this.uploadstart = uploadstart;
	}
	public Date getUploadend() {
		return uploadend;
	}
	public void setUploadend(Date uploadend) {
		this.uploadend = uploadend;
	}
	public Date getDownloadstart() {
		return downloadstart;
	}
	public void setDownloadstart(Date downloadstart) {
		this.downloadstart = downloadstart;
	}
	//以下是非数据库字段，用于统计企业报名数
	private Integer joinnum;
	public Integer getJoinnum() {
		return joinnum;
	}
	public void setJoinnum(Integer joinnum) {
		this.joinnum = joinnum;
	}
}