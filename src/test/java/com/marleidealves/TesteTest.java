package com.marleidealves;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

//classe de teste completa e corrigida em JUnit 5 para a sua classe Teste, com o método calculo(a, b, c):

public class TesteTest {

    @Test
    public void testCalculoComValoresPositivos() {
        System.out.println("Teste com valores positivos");
        double x = 10.0;
        double y = 8.0;
        double z = 1.0;
        Teste instance = new Teste();
        double esperado = (x + y) / z; // 18.0
        double resultado = instance.calculo(x, y, z);
        assertEquals(esperado, resultado, 0.0001);
    }

    @Test
    public void testCalculoComDivisaoPorZero() {
        System.out.println("Teste com divisão por zero");
        Teste instance = new Teste();
        double resultado = instance.calculo(5.0, 5.0, 0.0);
        assertTrue(Double.isInfinite(resultado)); // Deve retornar Infinity
    }

    @Test
    public void testCalculoComValoresNegativos() {
        System.out.println("Teste com valores negativos");
        Teste instance = new Teste();
        double resultado = instance.calculo(-4.0, -6.0, 2.0); // (-4 + -6)/2 = -5.0
        assertEquals(-5.0, resultado, 0.0001);
    }

    @Test
    public void testCalculoComZeroNumerador() {
        System.out.println("Teste com numerador zero");
        Teste instance = new Teste();
        double resultado = instance.calculo(0.0, 0.0, 5.0); // (0+0)/5 = 0
        assertEquals(0.0, resultado, 0.0001);
    }
}

