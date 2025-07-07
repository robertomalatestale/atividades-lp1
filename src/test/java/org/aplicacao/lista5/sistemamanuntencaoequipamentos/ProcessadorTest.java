package org.aplicacao.lista5.sistemamanuntencaoequipamentos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcessadorTest {

    @Test
    void deveCalcularCustoManuntencaoCompletoCorretamente(){
        Processador processador = new Processador(120,50);
        assertEquals(170,processador.getValorManuntencao());
    }

}