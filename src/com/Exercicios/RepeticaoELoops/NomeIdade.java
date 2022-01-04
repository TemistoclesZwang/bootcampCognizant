package com.Exercicios.RepeticaoELoops;
import java.util.Scanner;
/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
public class NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inserirNomeAluno;
        int inserirIdadeAluno;

        while (true) {
            System.out.println("Insira o nome:");
            inserirNomeAluno = scan.next();
            if (inserirNomeAluno.equals("0")) break;

            System.out.println("Insira a idade:");
            inserirIdadeAluno = scan.nextInt();
        }
    }

}
