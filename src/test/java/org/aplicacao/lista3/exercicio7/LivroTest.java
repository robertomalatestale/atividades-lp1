package org.aplicacao.lista3.exercicio7;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    Livro livro = new Livro("A Espera de Um Milagre", LocalDate.of(1996,3,28),LocalDate.of(2025,5,25));

    @Test
    void deveCalcularDataDevolucaoCorretamente(){
        assertEquals(LocalDate.of(2025,6,9),livro.calcularDataDevolucao());
    }
}