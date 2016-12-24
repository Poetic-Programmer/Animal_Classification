package com.mgd.classification;

public enum Family{
	NONE("None"),
	ANATIDAE("Anatidae");

	String name;

	Family(String name){
		this.name = name;
	}

	void print(){
		System.out.println(name);
	}

	@Override
	public String toString(){
		return name;
	}
}

