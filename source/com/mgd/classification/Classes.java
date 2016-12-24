package com.mgd.classification;

public enum Classes{
	NONE("None"),
	AVES("Aves");

	String name;

	Classes(String name){
		this.name = name;
	}

	public void print(){
		System.out.println(name);
	}

	@Override
	public String toString(){
		return name;
	}
}
