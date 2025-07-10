package org.aplicacao.lista5.sistemareservahotel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {

    @Test
    void deveLancarExcecaoSeQuartoDaReservaNaoPreenchido(){
        assertThrows(IllegalArgumentException.class, ()-> new Reserva(null));
    }

}