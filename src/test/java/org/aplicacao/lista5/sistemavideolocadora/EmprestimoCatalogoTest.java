package org.aplicacao.lista5.sistemavideolocadora;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class EmprestimoCatalogoTest {

    Cliente cliente = new Cliente("Wellington", "3495-2");
    EmprestimoCatalogo emprestimoCatalogo = new EmprestimoCatalogo("Matrix",5, cliente);

    @Test
    void deveLancarExcecaoSeDiasEmprestimoForZeroOuNegativo() {
        assertThrows(IllegalArgumentException.class, () -> emprestimoCatalogo.setDiasAlugados(0));
    }

    @Test
    void deveLancarExcecaoSeNaoAssociarUmCliente() {
        assertThrows(IllegalArgumentException.class, () -> emprestimoCatalogo.setCliente(null));
    }

    @Test
    void deveCalcularValorCorretamente(){
        assertEquals(25,emprestimoCatalogo.calculaValor());
    }
}