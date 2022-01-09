package com.Exercicios.RepeticaoELoops;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
import java.util.Scanner;
import java.util.Arrays;

public class MaiorNumMedia {
    public static void main(String[] args) {
        lerEEncontrarMaior();
    }

    public static int[] entradaEOrdem() { //Lê os 5 números e organiza eles em ordem crescente
        int[] numeros = new int[5];

        int i = 0;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o elemento" + i + ": ");
            numeros[i] = (sc.nextInt());
            i++;
        }while (i < numeros.length);

        Arrays.sort(numeros);
        return numeros;
    }
    public static int lerEEncontrarMaior() {
        int[] numeros = entradaEOrdem();
        System.out.println("Maior número: " + numeros[numeros.length - 1]);
        return numeros[numeros.length - 1];
    }
//        System.out.println(numeros[numeros.length - 1]);
//            for (int i = 0; i < numeros.length; i++) {
//                System.out.println(numeros[i]);
//            }
}
