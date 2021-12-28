package br.com.teste.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Digite o primeiro numero: ");
        a = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        b = scanner.nextInt();

        int somar = somar(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);

        System.out.println("Soma: " + somar);
        System.out.println("Subtração: " + subtrair);
        System.out.println("Multiplicação: " + multiplicar);
        System.out.println("Divisão: " + dividir);
        }

    public static int somar ( int a, int b){
        return a + b;
    }
    public static int subtrair ( int a, int b){
        return a - b;
    }

    public static int multiplicar ( int a, int b){
        return a * b;
    }
    public static int dividir ( int a, int b){
        return a / b;
    }



}
