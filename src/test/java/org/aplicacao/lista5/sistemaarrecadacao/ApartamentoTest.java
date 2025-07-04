package org.aplicacao.lista5.sistemaarrecadacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApartamentoTest {

    Apartamento apartamento = new Apartamento(50,5);

    @Test
    void deveLancarExcecaoSeMetragemQuadradaDoApartamentoNegativaOuNula(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> apartamento.setMetragemQuadradaApartamento(0));
    }

    @Test
    void deveLancarExcecaoSeAndarNegativoOuZero(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> apartamento.setAndar(0));
    }

    @Test
    void deveCalcularValorDoApartamentoCorretamenteAteQuintoAndar(){
        assertEquals(1000,apartamento.calcularValor());
    }

    @Test
    void deveCalcularValorDoApartamentoCorretamenteAposQuintoAndar(){
        apartamento.setAndar(9);
        assertEquals(1000,apartamento.calcularValor());
    }
}