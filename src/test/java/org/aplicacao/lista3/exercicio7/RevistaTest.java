package org.aplicacao.lista3.exercicio7;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class RevistaTest {

    Revista revista = new Revista("Veja",LocalDate.of(2001,1,11),LocalDate.of(2025,5,25));

    @Test
    void deveCalcularDataDevolucaoCorretamente(){
        assertEquals(LocalDate.of(2025,6,1),revista.calcularDataDevolucao());
    }
}