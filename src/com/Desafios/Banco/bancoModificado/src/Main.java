package com.Desafios.Banco.bancoModificado.src;

import java.util.ArrayList;
import java.util.List;
import com.Desafios.Banco.bancoModificado.src.Modificacoes.ListaBancos;

public class Main {

	public static void main(String[] args) {

//		instanciando os bancos
		Banco banco1 = new Banco();
		banco1.setNome("Nubank");

		Banco banco2 = new Banco();
		banco2.setNome("Itau");

		Banco banco3 = new Banco();
		banco3.setNome("Santander");


//?		teste da classe ListaBancos
		//instanciando a classe
		ListaBancos minhaListaBancoTeste = new ListaBancos();

		//Instanciando a lista
		List<Banco> listaLocalDosBancos = new ArrayList<Banco>();
		listaLocalDosBancos.add(banco1);
		listaLocalDosBancos.add(banco2);
		listaLocalDosBancos.add(banco3);

		minhaListaBancoTeste.setListaBancos(listaLocalDosBancos);
		String pegarNomeBanco0 = minhaListaBancoTeste.getListaBancos().get(0).getNome();
		String pegarNomeBanco1 = minhaListaBancoTeste.getListaBancos().get(1).getNome();
		String pegarNomeBanco2 = minhaListaBancoTeste.getListaBancos().get(2).getNome();

		System.out.println(pegarNomeBanco0 +'\n'+ pegarNomeBanco1+'\n'+ pegarNomeBanco2);
	}



}
