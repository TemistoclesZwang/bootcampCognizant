package com.Exercicios.Metodos.Exercicio1;

public class Main {
    public static void main(String[] args) {
        FormatadorDeSaida.formatarSaida("Resultados calculos: ");
        Calculadora.somar(10, 5);
        Calculadora.subtrair(10, 5);
        Calculadora.multiplicar(10, 5);
        Calculadora.dividir(10, 5);

        FormatadorDeSaida.formatarSaida("Resultado hora: ");
        Hora.mostrarHora();

        FormatadorDeSaida.formatarSaida("Emrpréstimo: ");
        Emprestimo.calcParcelas(1.000, 5);
    }
}
