package org.aplicacao.lista5.sistemavideolocadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmprestimoLancamentoTest {
    EmprestimoLancamento emprestimoLancamento = new EmprestimoLancamento("Matrix",5,10);

    @Test
    void deveLancarExcecaoSeValorDiarioNegativoOuZero(){
        assertThrows(IllegalArgumentException.class,()-> emprestimoLancamento.setValorDiario(0));
    }

    @Test
    void deveCalcularValorCorretamente(){
        assertEquals(50.0,emprestimoLancamento.calculaValor());
    }

}