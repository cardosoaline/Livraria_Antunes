package com.livraria.cadastro.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="livros")
@Getter @Setter @EqualsAndHashCode
public class Livro {
	
	private Long codigo;
	
	private String nomeLivros;
	
	private String autor;
	
	private String editora;
	
	private String categoria;
	
	private Date dataPublicacao;
	
	private Double preco;
	



}
