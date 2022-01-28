package com.Desafios.Banco.bancoModificado.src.Modificacoes;

import java.util.Random;

public class GerarValoresBancos {
    protected int numeroGerado;

    public int getNumeroGerado() {
        return numeroGerado;
    }

    public void setNumeroGerado(int numeroGerado) {
        this.numeroGerado = numeroGerado;
    }

    public void gerarValores(){
        Random gerador = new Random();
        int numeroGerado = gerador.nextInt(99999);
        setNumeroGerado(numeroGerado);

        }
    }
