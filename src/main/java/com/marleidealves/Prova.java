package com.marleidealves;

public class Prova {

    // Retorna o maior valor entre os n primeiros elementos do vetor vet.
    public static int vetor(int n, int[] vet) {
        int val = vet[0];

        for (int j = 1; j < n; j++) {
            if (val < vet[j]) {
                val = vet[j]; 
            }
        }

        return val;
    }
}
