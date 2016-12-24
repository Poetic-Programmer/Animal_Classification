package com.mgd.animal;

import com.mgd.classification.*;

public abstract class Animal{
	protected Classification classification;

	protected Animal(Classification classification){
		this.classification = classification;
	}

	public void printClassification(){
		System.out.println(classification.toString());
	}
}
