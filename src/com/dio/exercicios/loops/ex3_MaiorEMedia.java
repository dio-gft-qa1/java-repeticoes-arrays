package com.dio.exercicios.loops;
/*
Faça um programa que leia 5 números e informe o maior número e a média desses números.
 */

import java.util.Scanner;

public class ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;
        int biggest = 0;
        int total = 0;

        int counter = 0;
        do {
            System.out.println("Digite um número: ");
            number = scan.nextInt();

            if (number > biggest) biggest = number;

            counter += 1;
            total += number;
        } while(counter < 5);

        System.out.println("Maior: " + biggest);
        System.out.println("Média: " + (total/5));

    }
}
