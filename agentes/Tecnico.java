package br.com.serviceDesk.agentes;

import br.com.serviceDesk.interfaces.GerenciarTecnico;

public class Tecnico extends Pessoa implements GerenciarTecnico{

	public Pessoa pessoa;
	public String registroAtendimento;
	public int idTecnico;
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public String getRegistroAtendimento() {
		return registroAtendimento;
	}
	public void setRegistroAtendimento(String registroAtendimento) {
		this.registroAtendimento = registroAtendimento;
	}
	public int getIdTecnico() {
		return idTecnico;
	}
	public void setIdTecnico(int idTecnico) {
		this.idTecnico = idTecnico;
	}

	@Override
	public void atenderChamado() {}

	@Override
	public void fazAniversario() {}
}