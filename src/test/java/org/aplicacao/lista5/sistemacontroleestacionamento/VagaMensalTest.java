package org.aplicacao.lista5.sistemacontroleestacionamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VagaMensalTest {

    VagaMensal vagaMensal = new VagaMensal(10,"BRA2E19",3);

    @Test
    void deveLancarExcecaoSeNumeroDeSemanasNegativoOuZero(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> vagaMensal.setMeses(0));
    }

    @Test
    void deveCalcularValorDoAluguelCorretamente(){
        assertEquals(450,vagaMensal.calcularValorAluguel());
    }

}