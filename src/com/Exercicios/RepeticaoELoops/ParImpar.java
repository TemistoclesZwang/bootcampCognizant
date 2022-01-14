package com.Exercicios.RepeticaoELoops;
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeNumeros = entradaDados();
        int contador = 0;
        int entradaNumero = 0;

        while (contador < quantidadeNumeros) {
            System.out.println("Digite o número: ");
            entradaNumero = sc.nextInt();
            encontrarParImpar(entradaNumero);
            contador++;

        }
    }

    public static int entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de números que quer analisar: ");
        int quantidadeNumeros = 0;
        quantidadeNumeros = sc.nextInt();
        return quantidadeNumeros;
    }

    public static void encontrarParImpar(int verificarNumero) {
        if (verificarNumero % 2 == 0) {
            System.out.println("O número é par");
        } else {
            System.out.println("O número é impar");
        }
    }

}
