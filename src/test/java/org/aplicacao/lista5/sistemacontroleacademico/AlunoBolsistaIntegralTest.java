package org.aplicacao.lista5.sistemacontroleacademico;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoBolsistaIntegralTest {

    AlunoBolsistaIntegral alunoBolsistaIntegral = new AlunoBolsistaIntegral("Robson","2024000349","Rua Horácio", 12);

    @Test
    void deveRetornarValorDaMensalidadeComo0(){
        assertEquals(0,alunoBolsistaIntegral.getValorMensalidade());
    }
}