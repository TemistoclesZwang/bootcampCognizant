package com.Desafios;

public class Ex5_tracinhosSaida {
    public static void main(String[] args) {

        String horizontal = "";
        String verticalComEspaco = "";

        for (int i = 0; i < 39; i++) {
            horizontal+="-"; //tracos horizontais
            if (i == 0 || i == 38) {
                verticalComEspaco+="|";
            }
            else {
                verticalComEspaco+=" ";
            }
        }
//saida
        System.out.println(horizontal);
        for (int i = 0; i < 5; i++) {
            System.out.println(verticalComEspaco);
        }
        System.out.println(horizontal);

    }
}
