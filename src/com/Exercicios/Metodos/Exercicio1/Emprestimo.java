package com.Exercicios.Metodos.Exercicio1;

public class Emprestimo {
    public static double calcParcelas(double valor, int numeroParcelas) {
        double parcelas = (valor / numeroParcelas) * 0.05;
//        return parcelas;
        return calcJuros(parcelas);
    }

    public static double calcJuros(double parcelas) {
        double juros = parcelas + 0.02;
        System.out.println("Resultado: " + juros);
        return juros;

    }
}