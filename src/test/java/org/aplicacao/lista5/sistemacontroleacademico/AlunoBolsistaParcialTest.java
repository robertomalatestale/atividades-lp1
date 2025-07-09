package org.aplicacao.lista5.sistemacontroleacademico;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoBolsistaParcialTest {

    AlunoBolsistaParcial alunoBolsistaParcial = new AlunoBolsistaParcial("Rogerio","2024000313", "Rua Doze" , 120, 120, 50);

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