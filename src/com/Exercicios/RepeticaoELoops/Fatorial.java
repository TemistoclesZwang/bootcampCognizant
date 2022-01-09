package com.Exercicios.RepeticaoELoops;
/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

import java.util.List;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        calcularFatorial();
    }


    public static int entradaDados() {
        Scanner sc = new Scanner(System.in);
        int entrada = 0;
        System.out.println("Digite um número inteiro: ");
        entrada = sc.nextInt();
        return entrada;

    }

    public static void calcularFatorial() {
        int entrada = entradaDados();
        int contador = 1;

        for (int i = entrada; i >= 1; i--) {
            contador = contador * i;
            System.out.println(contador);
        }
    }
}
