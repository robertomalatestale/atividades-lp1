package org.aplicacao.lista5.sistemareservahotel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuartoSingleTest {

    QuartoSingle quartoSingle = new QuartoSingle(2);

    @Test
    void deveLancarExcecaoSeDiasHospedadasZeroOuNegativo(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> quartoSingle.setDiasHospedados(0));
    }

    @Test
    void deveCalcularValorDaReservaCorretamente(){
        assertEquals(100,quartoSingle.getValorDaReserva());
    }

}