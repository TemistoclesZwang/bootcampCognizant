package com.Exercicios.Arrays;
/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
import java.util.Scanner;
public class Consoantes {
    public static void main(String[] args) {

        int tamanho = 6;
        int totalConsoantes = 0;

        Scanner sc = new Scanner(System.in);
        String vetor [] = new String[tamanho];

        for (int i = 0; i < tamanho; i++){
            String letra = sc.next();
            totalConsoantes += verificaConsoante(letra);

        }
        System.out.println("Total de consoantes: " + totalConsoantes);

    }
    static int verificaConsoante(String letra){
       if (!(letra.equalsIgnoreCase("a") ||
               letra.equalsIgnoreCase("e") ||
               letra.equalsIgnoreCase("i") ||
               letra.equalsIgnoreCase("o") ||
               letra.equalsIgnoreCase("u")))
           return 1;
       else{
           return 0;
       }
    }
}
