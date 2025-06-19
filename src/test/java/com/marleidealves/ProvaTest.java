package com.marleidealves;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProvaTest {

    @Test
    public void testVetor(){
       int[] vet = {89, 90, 84, 91};
       int r = Prova.vetor(vet.length, vet);
       assertEquals(91, r); // I preenchido corretamente
    }
}

