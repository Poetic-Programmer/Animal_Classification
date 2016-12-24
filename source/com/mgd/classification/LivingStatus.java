package com.mgd.classification;

public enum LivingStatus{
	NONE("None"), LIVING("Living"), NOT_LIVING("Not Living");

	String status;

	LivingStatus(String status){
		this.status = status;
	}

	@Override
	public String toString(){
		return status;
	}
}
