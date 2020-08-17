package com.livraria.cadastro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.livraria.cadastro.model.Livro;
import com.livraria.cadastro.repository.LivroRepository;

@RestController
@RequestMapping("/api")
public class LivroController {
	
	@Autowired
	LivroRepository livrosRepository;
	
	@GetMapping("listar")
	public List<Livro> listarLivros(){
		return livrosRepository.findAll();
	}
	
	@PostMapping("cadastrar")
	@ResponseStatus(HttpStatus.CREATED)
	public Livro adicionar(@RequestBody Livro livros) {
		return livrosRepository.save(livros);
	}
	
	@PutMapping("/atualizar/{livrosId}")
	public ResponseEntity<Livro> atualizar(@PathVariable long livrosId,
			@RequestBody Livro livros){
		if(!livrosRepository.existsById(livrosId)) {
			return ResponseEntity.notFound().build();
		}
		livros.setCodigo(livrosId);
        livros = livrosRepository.save(livros);
        return ResponseEntity.ok(livros);
	}
	
	@DeleteMapping("/remover/{livrosId}")
	public ResponseEntity<Void> remover(@PathVariable long livrosId){
		if(!livrosRepository.existsById(livrosId)) {
			return ResponseEntity.notFound().build();
		}
        livrosRepository.deleteById(livrosId);
        return ResponseEntity.noContent().build();		
	}


}
