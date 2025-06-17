package org.aplicacao.lista4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CidadeTest {

    @Test
    void deveRetornarNomeEstado() {
        Estado estado = new Estado();
        estado.setNome("MG");
        Cidade cidade = new Cidade(estado);
        assertEquals("MG", cidade.getNomeEstado());
    }

    @Test
    void deveRetornarExcecaoEstadoNuloConstrutor() {
        try {
            Cidade cidade = new Cidade(null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Estado invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoEstadoNulo() {
        try {
            Cidade cidade = new Cidade(new Estado());
            cidade.setEstado(null);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Estado invalido", e.getMessage());
        }
    }

}