package org.aplicacao.lista3.exercicio8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotoTest {
    Moto moto = new Moto("Honda","XRE 190",15.000);

    @Test
    void deveCalcularCustoCorretamente(){
        assertEquals(25.500,moto.calcularCusto());
    }
}