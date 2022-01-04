package com.Exercicios.RepeticaoELoops;
/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
import java.util.Scanner;
public class Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota = 0;

        while(true){
            System.out.println("Digite uma nota entre 0 e 10");
            nota = sc.nextInt();

            if (nota >= 0 && nota <= 10){
                System.out.println("Nota válida");
                break;
            }
            else if (nota < 0 || nota > 10){
                System.out.println("Nota inválida. Digite novamente");

            }
        }
    }
}
