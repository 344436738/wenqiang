package com.business.model;
import com.base.model.BaseModel;

public class StResumeModel extends BaseModel {
	

	
	

	//以下为非数据库字段，用于简历查询
	private String searchcondition;
	
	
	public String getSearchcondition() {
		return searchcondition;
	}
	public void setSearchcondition(String searchcondition) {
		this.searchcondition = searchcondition;
	}
	
}