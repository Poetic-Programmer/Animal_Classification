package com.mgd.classification;

public enum Genus{
	NONE("None"),
	ANAS("Anas");

	String name;

	Genus(String name){
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
