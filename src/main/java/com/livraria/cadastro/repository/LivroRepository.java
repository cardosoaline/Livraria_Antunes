package com.livraria.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.livraria.cadastro.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
	

}
