package br.com.empresa.banco.conta;


public class ContaCorrente extends Conta {

	public void atualiza(double taxa){
		//this.saldo += this.saldo * taxa * 2;
		super.atualiza(taxa * 2);
	}

	public void deposita(double valor){
		this.saldo += valor - 0.10;
	}

}
