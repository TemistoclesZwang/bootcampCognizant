package com.Desafios;

import java.io.IOException;
import java.util.Scanner;

public class Ex6_PositivoNegativo {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente

        int positivos = 0;
        int negativos = 0;
        int par = 0;
        int impar = 0;


//continue a solução
        for (int i = 0; i < 5; i++) {
            int numero = leitor.nextInt();

            if (numero % 2 == 0) {
                par += 1;
            } else {
                impar += 1;
            }

            if (numero > 0) { //positivo
                positivos += 1;
            } else if (numero < 0) { //negativo
                negativos += 1;
            }
//insira suas variaveis corretamente
        }
        System.out.println(par + " par(es)");
        System.out.println(impar + " impar(es)");
        System.out.println(positivos + " positivo(s)");
        System.out.println(negativos + " negativo(s)");

    }
}