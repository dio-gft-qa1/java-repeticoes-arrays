package com.dio.exercicios.loops;

/*
Calcule um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5! = 120 (5 x 4 x 3 x 2 x 1)
 */

import java.util.Scanner;

public class ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número para saber seu fatorial: ");
        int fatorial = scan.nextInt();
        int resultado = 1;

        for(int i = fatorial; i >= 1 ; i--) {
            resultado *= i;
        }

        System.out.println(fatorial + "! = " + resultado);


    }


}
