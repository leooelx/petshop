package com.leo.demo.domain;

import javax.persistence.Entity;

import com.leo.demo.domain.enuns.SituacaoPagamento;

@Entity
public class PagCartao extends Pagamento {

	private static final long serialVersionUID = 1L;
	
	private Integer parcelas;
	
	public PagCartao() {
		
	}

	public PagCartao(Integer id, Double valor, SituacaoPagamento situacao, Servico servico, Integer parcelas) {
		super(id, valor, situacao, servico);
		this.setParcelas(parcelas);
	}

	public Integer getParcelas() {
		return parcelas;
	}

	public void setParcelas(Integer parcelas) {
		this.parcelas = parcelas;
	}
	
}