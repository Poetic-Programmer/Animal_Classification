package com.mgd.classification;

public enum Kingdom{
	NONE("None"),
	ANIMALIA("Animalia"),
	PLANTAE("Pantae"),
	FUNGI("Fungi"),
	MONERA("Monera"),
	PROTISTA("Protista");

	String name;

	Kingdom(String name){
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
