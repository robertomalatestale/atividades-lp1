package org.aplicacao.lista5.sistemacontroletransportadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteNormalTest {

    Cliente cliente = new Cliente("José","1452");
    FreteNormal freteNormal = new FreteNormal(100, cliente);

    @Test
    void deveLancarExcecaoSeValorNegativoOuZero(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> freteNormal.setValor(0));
    }

    @Test
    void deveLancarExcecaoSeClienteNaoPreenchido(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> freteNormal.setCliente(null));
    }

    @Test
    void deveCalcularCustoTotalCorrretamente(){
        assertEquals(100,freteNormal.calcularValorTotalEntrega());
    }
}