package com.marleidealves;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrianguloTest {

    @Test
    public void testTrianguloEscalenoValido() {
        Triangulo t = new Triangulo(3, 4, 5);
        assertEquals("Triângulo escaleno", t.classificarTriangulo());
    }

    @Test
    public void testTrianguloIsoscelesValido() {
        Triangulo t = new Triangulo(5, 5, 3);
        assertEquals("Triângulo isósceles", t.classificarTriangulo());
    }

    @Test
    public void testTrianguloEquilateroValido() {
        Triangulo t = new Triangulo(4, 4, 4);
        assertEquals("Triângulo equilátero", t.classificarTriangulo());
    }

    @Test
    public void testLadoComValorZero() {
        Triangulo t = new Triangulo(0, 4, 5);
        assertEquals("Triângulo inválido", t.classificarTriangulo());
    }

    @Test
    public void testLadoComValorNegativo() {
        Triangulo t = new Triangulo(-3, 4, 5);
        assertEquals("Triângulo inválido", t.classificarTriangulo());
    }

    @Test
    public void testSomaDeDoisLadosIgualAoTerceiro() {
        Triangulo t = new Triangulo(2, 2, 4);
        assertEquals("Triângulo inválido", t.classificarTriangulo());
    }
}
