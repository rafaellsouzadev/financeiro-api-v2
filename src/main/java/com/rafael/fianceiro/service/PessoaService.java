package com.rafael.fianceiro.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.rafael.fianceiro.model.Pessoa;
import com.rafael.fianceiro.model.repositories.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa atualizar(Pessoa pessoa, Long codigo) {
		Pessoa pessoaSalva = encontraPessoa(codigo);
		BeanUtils.copyProperties(pessoa, pessoaSalva, "codigo");
		return pessoaRepository.save(pessoaSalva);
	}

	

	public void atualizarPropriedadeAtivo(Long codigo, Boolean ativo) {
		Pessoa pessoaSalva = encontraPessoa(codigo);
		pessoaSalva.setAtivo(ativo);
		pessoaRepository.save(pessoaSalva);
	}
	
	private Pessoa encontraPessoa(Long codigo) {
		Pessoa pessoaSalva = pessoaRepository.findById(codigo) 
				.orElseThrow(() -> new EmptyResultDataAccessException(1));
		return pessoaSalva;
	}

}
