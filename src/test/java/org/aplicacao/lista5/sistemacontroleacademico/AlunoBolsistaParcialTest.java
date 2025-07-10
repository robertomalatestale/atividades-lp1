package org.aplicacao.lista5.sistemacontroleacademico;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoBolsistaParcialTest {

    Curso curso = new Curso("INF2004",60,"Curso de Modelagem de Sistemas");
    AlunoBolsistaParcial alunoBolsistaParcial = new AlunoBolsistaParcial("Rogerio","2024000313", "Rua Doze" , 120, 120, curso, 50);

    @Test
    void deveLancarExcecaoSeValorDescontoNegativoOuZero(){
        assertThrows(IllegalArgumentException.class, ()-> alunoBolsistaParcial.setPercentualDesconto(0));
    }

    @Test
    void deveLancarExcecaoSeValorDescontoMaiorQue50(){
        assertThrows(IllegalArgumentException.class, ()-> alunoBolsistaParcial.setPercentualDesconto(50.01));
    }

    @Test
    void deveRetornarValorMensalidadeCorretamente(){
        assertEquals(60,alunoBolsistaParcial.getValorMensalidade());
    }
}