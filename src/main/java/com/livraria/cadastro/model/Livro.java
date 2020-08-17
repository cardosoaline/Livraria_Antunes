package com.livraria.cadastro.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="livros")
@Getter @Setter @EqualsAndHashCode
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column(name="nome_livros")
	private String nomeLivros;
	
	@Column(name="autor")
	private String autor;
	
	@Column(name="editora")
	private String editora;
	
	@Column(name="categoria")
	private String categoria;
	
	@Column(name="data_publicacao")
	private Date dataPublicacao;
	
	@Column(name="preco")
	private Double preco;
	

}
