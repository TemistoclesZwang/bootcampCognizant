package com.Exercicios.RepeticaoELoops;
/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
*/
import java.util.Scanner;
public class Tabuada {

    public static void main(String[] args) {
        gerarTabuada();
        
    }

    public static int entradaDados() {
        System.out.println("Digite um número: ");
        Scanner sc = new Scanner(System.in);
        int escolhaUsuario;
        escolhaUsuario = sc.nextInt();
        return escolhaUsuario;
    }

    public static void gerarTabuada() {
        int escolhaUsuario = entradaDados();

        for (int i = 1; i <= 10; i++) {
            System.out.println(escolhaUsuario + " X " + i + " = " + escolhaUsuario * i);
        }

    }

}
