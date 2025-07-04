package org.aplicacao.lista5.sistemacontroletransportadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteNormalTest {

    FreteNormal freteNormal = new FreteNormal(100);

    @Test
    void deveLancarExcecaoSeValorNegativoOuZero(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> freteNormal.setValor(0));
    }

    @Test
    void deveCalcularCustoTotalCorrretamente(){
        assertEquals(100,freteNormal.calcularValorTotalEntrega());
    }
}