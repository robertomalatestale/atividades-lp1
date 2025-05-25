package org.aplicacao.lista3.exercicio4;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class VooTest {

    Voo voo = new VooDomestico("Rio de Janeiro","João Pessoa",2000, LocalDate.now());

    @Test
    void deveLancarExcecaoSeOrigemNaoForPreenchida(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()-> voo.setOrigem("  "));
    }

    @Test
    void deveLancarExcecaoSeDestinoNaoForPreenchido(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()-> voo.setDestino("  "));
    }

    @Test
    void deveLancarExcecaoSeDistanciaForNegativaOuZero(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()-> voo.setDistancia(0));
    }

    @Test
    void deveLancarExcecaoSeDataForNula(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()-> voo.setData(null));
    }
}