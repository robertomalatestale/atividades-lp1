package org.aplicacao.lista3.exercicio4;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class VooDomesticoTest {

    VooDomestico vooDomestico = new VooDomestico("Rio de Janeiro","João Pessoa",2000, LocalDate.now());

    @Test
    void deveCalcularPrecoCorretamente(){
        assertEquals(400,vooDomestico.calcularPreco());
    }
}