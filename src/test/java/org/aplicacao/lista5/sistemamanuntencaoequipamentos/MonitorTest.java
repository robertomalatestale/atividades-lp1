package org.aplicacao.lista5.sistemamanuntencaoequipamentos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonitorTest {

    Monitor monitor = new Monitor(400.0);

    @Test
    void deveLancarExcecaoSeValorDeMaoDeObraNegativoOuZero(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> monitor.setValorMaoDeObra(0));
    }

    @Test
    void deveCalcularCustoManuntencaoCompletoCorretamente(){
        assertEquals(400,monitor.getValorManuntencao());
    }

}