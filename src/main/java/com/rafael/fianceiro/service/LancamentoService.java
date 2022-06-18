package com.rafael.fianceiro.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafael.fianceiro.model.Lancamento;
import com.rafael.fianceiro.model.Pessoa;
import com.rafael.fianceiro.model.repositories.LancamentoRepository;
import com.rafael.fianceiro.model.repositories.PessoaRepository;
import com.rafael.fianceiro.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Lancamento salvar(Lancamento lancamento) {
		Optional<Pessoa> pessoa = pessoaRepository.findById(lancamento.getPessoa().getCodigo());
		if (pessoa.isEmpty() || pessoa.get().isInativo()) {
			throw new PessoaInexistenteOuInativaException();
		}		
		return lancamentoRepository.save(lancamento);
	}

}
