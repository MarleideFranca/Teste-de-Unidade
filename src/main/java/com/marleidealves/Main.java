package com.marleidealves;

// Arquivo separado da classe Prova
public class Main {
    public static void main(String[] args) {
        int[] numeros = {5, 12, 3, 20, 7};
        int resultado = Prova.vetor(5, numeros);
        System.out.println("Maior valor: " + resultado); // Deve imprimir 20
    }
}
