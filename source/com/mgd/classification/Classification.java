package com.mgd.classification;

public class Classification{
	private LivingStatus livingStatus;
	private Kingdom kingdom;
	private Phylum phylum;
	private Classes classes;
	private Order order;
	private Family family;
	private Genus genus;
	private Species species;

	public static class Builder{
		private LivingStatus livingStatus;
		private Kingdom kingdom;
		private Phylum phylum;
		private Classes classes;
		private Order order;
		private Family family;
		private Genus genus;
		private Species species;

		public Builder(){
			livingStatus = LivingStatus.NOT_LIVING;
			kingdom = Kingdom.NONE;
			phylum = Phylum.NONE;
			classes = Classes.NONE;
			order = Order.NONE;
			family = Family.NONE;
			genus = Genus.NONE;
			species = Species.NONE;
		}

		public Builder livingStatus (LivingStatus livingStatus){
			this.livingStatus = livingStatus;
			return this;
		}

		public Builder kingdom(Kingdom kingdom){
			this.kingdom = kingdom;
			return this;
		}

		public Builder phylum(Phylum phylum){
			this.phylum = phylum;
			return this;
		}

		public Builder classes(Classes classes){
			this.classes = classes;
			return this;
		}

		public Builder order(Order order){
			this.order = order;
			return this;
		}

		public Builder family(Family family){
			this.family = family;
			return this;
		}

		public Builder genus(Genus genus){
			this.genus = genus;
			return this;
		}

		public Builder species(Species species){
			this.species = species;
			return this;
		}

		public Classification build(){
			return new Classification(this);
		}
	}

	private Classification(Builder builder){
		livingStatus = builder.livingStatus;
		kingdom = builder.kingdom;
		phylum = builder.phylum;
		classes = builder.classes;
		order = builder.order;
		family = builder.family;
		genus = builder.genus;
		species = builder.species;
	}

	@Override 
	public String toString(){
		StringBuilder builder = new StringBuilder();

		builder.append("<------------------------CLASSIFICATION------------------------>\n");
		builder.append("Living Status: " + livingStatus.toString() + "\n");
		builder.append("Kingdom: " + kingdom.toString() + "\n");
		builder.append("Phylum: " + phylum.toString() + "\n");
		builder.append("Class: " + classes.toString() + "\n");
		builder.append("Order: " + order.toString() + "\n");
		builder.append("Family: " + family.toString() + "\n");
		builder.append("Genus: " + genus.toString() + "\n");
		builder.append("Species: " + species.toString() + "\n");
		builder.append("================================================================\n");

		return builder.toString();
	}
}

