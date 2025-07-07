package org.aplicacao.lista5.sistemamanuntencaoequipamentos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpressoraTest {

    Impressora impressora = new Impressora(120,50);

    @Test
    void deveLancarExcecaoSeValorDasPecasTrocadasNegativo(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> impressora.setValorTotalPecasTrocadas(-0.01));
    }

    @Test
    void deveCalcularCustoManuntencaoCompletoCorretamente(){
        assertEquals(170,impressora.getValorManuntencao());
    }


}