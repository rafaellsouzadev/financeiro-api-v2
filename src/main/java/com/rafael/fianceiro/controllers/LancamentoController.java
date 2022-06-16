package com.rafael.fianceiro.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.fianceiro.model.Lancamento;
import com.rafael.fianceiro.model.repositories.LancamentoRepository;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoController {

	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Lancamento> buscarPorCodigo(@PathVariable Long codigo) {
		Optional<Lancamento> lancamento =  lancamentoRepository.findById(codigo);
		return ResponseEntity.of(lancamento);
	}
	
	@GetMapping
	public ResponseEntity<List<Lancamento>> listaLancamento() {
		List<Lancamento> lancamentos = lancamentoRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(lancamentos);
	}
}
