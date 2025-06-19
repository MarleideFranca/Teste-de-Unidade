package com.marleidealves;

public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    // Construtor
    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    // Verifica se o triângulo é válido
    private boolean ehTrianguloValido() {
        return (ladoA > 0 && ladoB > 0 && ladoC > 0) &&
               (ladoA + ladoB > ladoC) &&
               (ladoA + ladoC > ladoB) &&
               (ladoB + ladoC > ladoA);
    }

    // Classifica o triângulo
    public String classificarTriangulo() {
        if (!ehTrianguloValido()) {
            return "Triângulo inválido";
        } else if (ladoA == ladoB && ladoB == ladoC) {
            return "Triângulo equilátero";
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            return "Triângulo isósceles";
        } else {
            return "Triângulo escaleno";
        }
    }
}
