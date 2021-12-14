package com.project.entity.dto;

import java.io.Serializable;

import com.project.enums.Categorias;
import com.project.enums.Receita;

public class FinancaRequestDto implements Serializable {

	private long id;
	private long idUsuario;
	private Receita receita;
	private long valor;
	private Categorias categoria;
	private String descricao;
}
