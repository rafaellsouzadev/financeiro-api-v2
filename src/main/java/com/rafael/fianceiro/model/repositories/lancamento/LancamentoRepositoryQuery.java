package com.rafael.fianceiro.model.repositories.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.rafael.fianceiro.model.Lancamento;
import com.rafael.fianceiro.model.repositories.filters.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	
	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);

}
