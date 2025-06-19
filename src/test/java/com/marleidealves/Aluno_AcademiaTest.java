package com.marleidealves;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Aluno_AcademiaTest {

    // Teste 1: Cálculo de IMC com peso e altura positivos
    @Test
    public void testCalculoIMCValido() {
        Aluno_Academia aluno = new Aluno_Academia("Teste", "M", 70, 1.75, 30);
        double imc = aluno.calcularIMC();
        assertEquals(22.8571, imc, 0.0001); // peso/(altura*altura) = 70/(1.75*1.75)
    }

    // Teste 2: Cálculo de IMC com peso ou altura negativos ou zero -> deve lançar exceção
    @Test
    public void testCalculoIMCAlturaZeroOuNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Aluno_Academia("Teste", "F", 60, 0, 25).calcularIMC();
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Aluno_Academia("Teste", "F", 60, -1.7, 25).calcularIMC();
        });
    }

    // Teste 3: VIP homem idade >= 40 com IMC < 30
    @Test
    public void testVIPHomemIdadeMaiorIgual40() {
        Aluno_Academia aluno = new Aluno_Academia("Emanuel", "M", 80, 1.8, 45); // IMC = 24.69 < 30
        assertTrue(aluno.isVIP());
    }

    // Teste 4: VIP homem idade < 40 com IMC < 28
    @Test
    public void testVIPHomemIdadeMenor40() {
        Aluno_Academia aluno = new Aluno_Academia("Gilson", "M", 70, 1.8, 30); // IMC = 21.6 < 28
        assertTrue(aluno.isVIP());
    }

    // Teste 5: Homem que não é VIP
    @Test
    public void testHomemNaoVIP() {
        Aluno_Academia aluno = new Aluno_Academia("Robson", "M", 90, 1.7, 50); // IMC = 31.14 > 30
        assertFalse(aluno.isVIP());
    }

    // Teste 6: VIP mulher idade >= 40 com IMC < 28
    @Test
    public void testVIPMulherIdadeMaiorIgual40() {
        Aluno_Academia aluno = new Aluno_Academia("Marleide", "F", 65, 1.7, 45); // IMC = 22.49 < 28
        assertTrue(aluno.isVIP());
    }

    // Teste 7: VIP mulher idade < 40 com IMC < 26
    @Test
    public void testVIPMulherIdadeMenor40() {
        Aluno_Academia aluno = new Aluno_Academia("Amanda Caroline", "F", 55, 1.7, 30); // IMC = 19.03 < 26
        assertTrue(aluno.isVIP());
    }

    // Teste 8: Mulher que não é VIP
    @Test
    public void testMulherNaoVIP() {
        Aluno_Academia aluno = new Aluno_Academia("Rafaela", "F", 75, 1.6, 50); // IMC = 29.29 > 28 (idade >= 40)
        assertFalse(aluno.isVIP());
    }
}
