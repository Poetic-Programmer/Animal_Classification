package com.mgd.classification;

public enum Order{
	NONE("None"),
	ANSERIFORMES("Anseriformes");

	String name;

	Order(String name){
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
