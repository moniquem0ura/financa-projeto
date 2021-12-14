package com.project.enums;


public enum Categorias {
	
	Lazer("lazer"),
	Transporte("transporte"),
	Comida("comida"),
	Pagamento("pagamento");
	
	
	private final String description;
	
	
	Categorias (String description ) {this.description = description;}
	
	public String getDescription() { return description;}
}

