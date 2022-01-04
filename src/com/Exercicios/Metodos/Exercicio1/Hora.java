package com.Exercicios.Metodos.Exercicio1;

import java.time.LocalDateTime;

public class Hora {
    public static void mostrarHora() {
        int horario = LocalDateTime.now().getHour();
        if (horario >= 0 && horario < 12) {
            System.out.println("Bom dia");
        }
        if (horario >= 12 && horario < 18) {
            System.out.println("Boa tarde");
        }
        if (horario >= 18 && horario < 24) {
            System.out.println("Boa noite");
        }
    }

}
