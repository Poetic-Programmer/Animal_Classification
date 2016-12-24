package com.mgd.classification;

public enum Phylum{
	NONE("None"),
	CHORDATA("Chordata");

	String name;

	Phylum(String name){
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
