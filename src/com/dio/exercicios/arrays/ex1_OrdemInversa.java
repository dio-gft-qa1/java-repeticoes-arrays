package com.dio.exercicios.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-nos na ordem inversa.
 */

public class ex1_OrdemInversa {
    public static void main(String[] args) {

         int[] vetor = {6, 7, 9, -4, 75, 12};

        System.out.println("Vetor: ");
         int count = 0;
         while(count < (vetor.length)) {
             System.out.print(vetor[count] + " ");
             count++;
         }

        System.out.println("\nVetor: ");

         for(int i = (vetor.length-1); i >= 0; i--) {
             System.out.print(vetor[i] + " ");
         }
    }
}
