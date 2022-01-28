package com.Desafios.Banco.bancoModificado.src.Modificacoes;


public class RankearBancos {
    public static void main(String[] args) {
        Rankear();
    }
    public static int [] Rankear(){
        GerarValoresBancos gerar = new GerarValoresBancos();
        int [] valores = new int[3];

        for (int i = 0; i < 3; i++) {
            gerar.gerarValores();
            valores [i] = gerar.getNumeroGerado();
            System.out.println(valores[i] +"posicao" + i);

        }
        return valores;
    }
//!pegar a lista de todos os bancos aqui da clase ListaBancos
//!e relacionar cada banco com um valor da lista gerada pela classe rankear
}

