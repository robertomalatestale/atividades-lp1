package org.aplicacao.lista5.sistemavideolocadora;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EmprestimoCatalogoTest {
    EmprestimoCatalogo emprestimoCatalogo = new EmprestimoCatalogo("Matrix",5);

    @Test
    void deveLancarExcecaoSeDiasEmprestimoForZeroOuNegativo() {
        assertThrows(IllegalArgumentException.class, () -> emprestimoCatalogo.setDiasAlugados(0));
    }

    @Test
    void deveCalcularValorCorretamente(){
        assertEquals(25,emprestimoCatalogo.calculaValor());
    }
}