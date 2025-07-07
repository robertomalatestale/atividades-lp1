package org.aplicacao.lista5.sistemacontroleestacionamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VagaSemanalTest {

    VagaSemanal vagaSemanal = new VagaSemanal(9,"BRA2E19",2);

    @Test
    void deveLancarExcecaoSeNumeroDeSemanasNegativoOuZero(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> vagaSemanal.setSemanas(0));
    }

    @Test
    void deveCalcularValorDoAluguelCorretamente(){
        assertEquals(80,vagaSemanal.calcularValorAluguel());
    }

}