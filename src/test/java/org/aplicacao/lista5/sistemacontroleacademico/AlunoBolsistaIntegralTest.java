package org.aplicacao.lista5.sistemacontroleacademico;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoBolsistaIntegralTest {

    Curso curso = new Curso("INF2004",60,"Curso de Modelagem de Sistemas");
    AlunoBolsistaIntegral alunoBolsistaIntegral = new AlunoBolsistaIntegral("Robson","2024000349","Rua Horácio", 12,curso);

    @Test
    void deveRetornarValorDaMensalidadeComo0(){
        assertEquals(0,alunoBolsistaIntegral.getValorMensalidade());
    }
}