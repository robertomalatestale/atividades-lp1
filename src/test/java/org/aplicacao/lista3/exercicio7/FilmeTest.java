package org.aplicacao.lista3.exercicio7;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class FilmeTest {
    Filme filme = new Filme("MIB Homens de Preto", LocalDate.of(1997,7,11),LocalDate.of(2025,5,25));

    @Test
    void deveCalcularDataDevolucaoCorretamente(){
        assertEquals(LocalDate.of(2025,5,30),filme.calcularDataDevolucao());
    }

}