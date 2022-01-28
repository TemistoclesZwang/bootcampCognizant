package com.Desafios;

import java.io.IOException;
import java.util.Scanner;

public class Ex4_futuroPassado {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int c = leitor.nextInt();

//        if (a + b >= c || a + c >= b || b + c >= a || c == a ||  b == c   || a == b)  //tentativa1
        if (a + b == c || a + c == b || b + c == a || c == a || b == c || a == b) //tentativa2
        System.out.println("S");
		else
        System.out.println("N");
    }

}
