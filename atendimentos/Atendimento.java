package br.com.serviceDesk.atendimentos;

import java.util.Date;

public class Atendimento {

	public String situacao;
	public OrdemServico ordemServico;
	public Date dataRegistro;
	public String historicoAtendimento;
	public int idAtendimento;
	
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public OrdemServico getOrdemServico() {
		return ordemServico;
	}
	public void setOrdemServico(OrdemServico ordemServico) {
		this.ordemServico = ordemServico;
	}
	public Date getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	public String getHistoricoAtendimento() {
		return historicoAtendimento;
	}
	public void setHistoricoAtendimento(String historicoAtendimento) {
		this.historicoAtendimento = historicoAtendimento;
	}
	public int getIdAtendimento() {
		return idAtendimento;
	}
	public void setIdAtendimento(int idAtendimento) {
		this.idAtendimento = idAtendimento;
	}
	
}
