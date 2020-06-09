package br.com.serviceDesk.agentes;

import br.com.serviceDesk.interfaces.GerenciarAtendente;

public class Atendente extends Pessoa implements GerenciarAtendente{
	
	public String loginServiceDesk;
	public String senhaServiceDesk;
	
	public String getLoginServiceDesk() {
		return loginServiceDesk;
	}

	public void setLoginServiceDesk(String loginServiceDesk) {
		this.loginServiceDesk = loginServiceDesk;
	}

	public String getSenhaServiceDesk() {
		return senhaServiceDesk;
	}

	public void setSenhaServiceDesk(String senhaServiceDesk) {
		this.senhaServiceDesk = senhaServiceDesk;
	}

	@Override
	public void abreOs() {}
	
	@Override
	public void fazAniversario() {}
	
}