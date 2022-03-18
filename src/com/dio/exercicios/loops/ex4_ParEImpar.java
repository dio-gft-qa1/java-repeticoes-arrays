package com.dio.exercicios.loops;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números ímpares
 */

import java.util.Scanner;

public class ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number, count;
        int even = 0, odd = 0;

        System.out.println("Digite a quantidade de números a serem inseridos");
        count = scan.nextInt();

        while(count > 0) {
            System.out.println("Digite um número: ");
            number = scan.nextInt();

            if ((number % 2) == 0) even++;
            else odd++;

            count--;
        }

        System.out.println("Quantidade de pares: " + even);
        System.out.println("Quantidade de ímpares: " + odd);
    }
}
