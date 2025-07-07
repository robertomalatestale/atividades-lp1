package org.aplicacao.lista5.sistemacontroleestacionamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VagaDiariaTest {
    VagaDiaria vagaDiaria = new VagaDiaria(3,"BRA2E19",6);

    @Test
    void deveLancarExcecaoSeNumeroDaVagaNegativo(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> vagaDiaria.setNumero(-1));
    }

    @Test
    void deveLancarExcecaoSePlacaNaoPreenchida(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> vagaDiaria.setPlacaVeiculo("   "));
    }

    @Test
    void deveLancarExcecaoSeNumeroDeDiariasNegativoOuZero(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> vagaDiaria.setDias(0));
    }

    @Test
    void deveCalcularValorDoAluguelCorretamente(){
        assertEquals(60,vagaDiaria.calcularValorAluguel());
    }

}