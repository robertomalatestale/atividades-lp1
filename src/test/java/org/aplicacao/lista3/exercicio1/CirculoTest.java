package org.aplicacao.lista3.exercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    Circulo circulo = new Circulo(1.0);

    @Test
    void deveLancarExcecaoSeRaioNegativoOuZeroNoConstrutor(){
        try {
            Circulo circulo1 = new Circulo(0);
            fail();
        }catch (IllegalArgumentException e) {
            assertEquals("Raio inválido, deve ser positivo",e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSeRaioNegativoOuZero(){
        try{
        circulo.setRaio(0);
        fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Raio inválido, deve ser positivo",e.getMessage());
        }
    }

    @Test
    void deveCalcularAreaCirculoCorretamente(){
        assertEquals(Math.PI,circulo.calcularArea());
    }

    @Test
    void deveCalcularPerimetroCirculoCorretamente(){
        assertEquals(Math.PI*2,circulo.calcularPerimetro());
    }

}