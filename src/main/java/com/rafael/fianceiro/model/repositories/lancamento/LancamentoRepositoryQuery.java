package com.rafael.fianceiro.model.repositories.lancamento;

import java.util.List;

import com.rafael.fianceiro.model.Lancamento;
import com.rafael.fianceiro.model.repositories.filters.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	
	List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);

}
