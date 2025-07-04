package org.aplicacao.lista5.sistemareservahotel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuartoDuploTest {

    QuartoDuplo quartoDuplo = new QuartoDuplo(2,0);

    @Test
    void deveLancarExcecaoSeNumeroDeRefeicoesNegativo(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> quartoDuplo.setNumeroDeRefeicoes(-1));
    }

    @Test
    void deveCalcularValorDaReservaCorretamente(){
        assertEquals(160,quartoDuplo.getValorDaReserva());
    }

}