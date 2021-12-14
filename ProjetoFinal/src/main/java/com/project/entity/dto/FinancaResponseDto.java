package com.project.entity.dto;

import java.io.Serializable;

import com.project.enums.Categorias;
import com.project.enums.Receita;

public class FinancaResponseDto implements Serializable {

	private long id;
	private long idUsuario;
	private Receita receita;
	private Categorias categoria;
	private String descricao;
}
