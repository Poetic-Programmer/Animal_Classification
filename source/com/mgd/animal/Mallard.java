package com.mgd.animal;

import com.mgd.classification.*;
import com.mgd.classification.Classification.Builder;

public class Mallard extends Animal{
	public Mallard(){
		super(new Classification.Builder().
			livingStatus(LivingStatus.LIVING)
			.kingdom(Kingdom.ANIMALIA)
			.phylum(Phylum.CHORDATA)
			.classes(Classes.AVES)
			.order(Order.ANSERIFORMES)
			.family(Family.ANATIDAE)
			.genus(Genus.ANAS)
			.species(Species.A_PLATYRHYNCHOS)
			.build());
	}
}
