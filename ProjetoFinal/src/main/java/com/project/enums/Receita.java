package com.project.enums;

public enum Receita {
	
	Despesas("pagamento"),
	Receita("receita");
	
	private final String receitas;
	
	
	Receita (String receitas) {this.receitas = receitas;}
	
	public String getDescription() { return receitas;}
}


