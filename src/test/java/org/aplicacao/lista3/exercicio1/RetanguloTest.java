package org.aplicacao.lista3.exercicio1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RetanguloTest {
    Retangulo retangulo = new Retangulo(1.0,1.0);

    @Test
    void deveLancarExcecaoSeLarguraNegativaOuZeroNoConstrutor(){
        try {
            Retangulo retangulo1 = new Retangulo(0,1);
            fail();
        }catch (IllegalArgumentException e) {
            assertEquals("Largura tem que ser positiva",e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSeAlturaNegativaOuZeroNoConstrutor(){
        try {
            Retangulo retangulo1 = new Retangulo(1,0);
            fail();
        }catch (IllegalArgumentException e) {
            assertEquals("Altura tem que ser positiva",e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSeAlturaNegativoOuZero(){
        try{
            retangulo.setAltura(0.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Altura tem que ser positiva",e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSeLarguraNegativoOuZero(){
        try{
            retangulo.setLargura(0.0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Largura tem que ser positiva",e.getMessage());
        }
    }

    @Test
    void deveCalcularAreaCorretamente(){
        assertEquals(1.0,retangulo.calcularArea());
    }

    @Test
    void deveCalcularPerimetroCorretamente(){
        assertEquals(4.0,retangulo.calcularPerimetro());
    }
}