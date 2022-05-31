package com.mycompany.lab.banco.digital.oo.master;


public class Main {

	public static void main(String[] args) {
		Cliente wanderley = new Cliente();
		wanderley.setNome("Wanderley");
		
		Conta cc = new ContaCorrente(wanderley);
		Conta poupanca = new ContaPoupanca(wanderley);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
