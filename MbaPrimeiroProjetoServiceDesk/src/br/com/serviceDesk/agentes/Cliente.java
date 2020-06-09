package br.com.serviceDesk.agentes;

public class Cliente extends Pessoa{

	public int idCliente;
	public String loginCliente;
	public String senhaCliente;
	public Pessoa pessoa;
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getLoginCliente() {
		return loginCliente;
	}
	public void setLoginCliente(String loginCliente) {
		this.loginCliente = loginCliente;
	}
	public String getSenhaCliente() {
		return senhaCliente;
	}
	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}
