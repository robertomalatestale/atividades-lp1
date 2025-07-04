package org.aplicacao.lista5.sistemareservahotel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuartoTriploTest {

    QuartoTriplo quartoTriplo = new QuartoTriplo(2,0);

    @Test
    void deveLancarExcecaoSeNumeroDeRefeicoesNegativo(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> quartoTriplo.setNumeroDeRefeicoes(-1));
    }

    @Test
    void deveCalcularValorDaReservaCorretamente(){
        assertEquals(200,quartoTriplo.getValorDaReserva());
    }


}