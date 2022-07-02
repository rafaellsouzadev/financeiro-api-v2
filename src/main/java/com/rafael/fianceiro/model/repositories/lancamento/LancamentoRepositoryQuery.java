package com.rafael.fianceiro.model.repositories.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.rafael.fianceiro.model.Lancamento;
import com.rafael.fianceiro.model.repositories.filters.LancamentoFilter;
import com.rafael.fianceiro.model.repositories.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {
	
	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);

}
