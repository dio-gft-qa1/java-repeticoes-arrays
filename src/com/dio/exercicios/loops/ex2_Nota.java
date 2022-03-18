package com.dio.exercicios.loops;
/*
Faça um programa que peça uma nota entre zero e dez.
Mostre uma mensagem caso o valor seja inválido e continue
pedindo até que o usuário informe um valor válido.
 */

import java.util.Scanner;

public class ex2_Nota {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int note;

        System.out.println("Digite uma nota de 0 a 10: ");
        note = scan.nextInt();


        while(note < 0 | note > 10) {
            System.out.println("Nota inválida! Digite novamente: ");
            note = scan.nextInt();
        }

        System.out.println("Nota lançada com sucesso!");

    }

}
