package com.business.model;
import java.util.List;

import com.base.model.BaseModel;
import com.business.bean.StDictionary;

public class StDictionaryModel extends BaseModel {
	

	
	
	private List<StDictionary> bean;
	public List<StDictionary> getBean() {
		return bean;
	}
	public void setBean(List<StDictionary> bean) {
		this.bean = bean;
	}
	
}