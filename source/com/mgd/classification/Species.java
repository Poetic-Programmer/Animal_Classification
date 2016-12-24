package com.mgd.classification;

public enum Species{
	NONE("None"),
	A_PLATYRHYNCHOS("A. platyrhynchos");

	String name;

	Species(String name){
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
