package com.dio.exercicios.loops;

/*
Desenvolva um gerador de tabuada, capaz de gerar
a tabuada de qualquer número interiro entre 1 e 10.
O usuário deve informar de qual número ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo.

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10;
...
5 x 10 = 50;
 */

import java.util.Scanner;

public class ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number;

        System.out.println("Digite um número de 1 a 10 para saber a tabuada: ");
        number = scan.nextInt();

        if (number >= 1 & number <= 10) {
            for (int count = 1; count < 10; count++) {
                System.out.println(number + " X " + count + " = " + count*number);
            }
        } else {
            System.out.println("Número inválido. Tente novamente.");
        }
    }
}
