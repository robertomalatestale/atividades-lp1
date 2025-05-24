package org.aplicacao.lista3.exercicio8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicicletaTest {
    Bicicleta bicicleta = new Bicicleta("Caloi","BMX",1000);

    @Test
    void deveCalcularCustoCorretamente(){
        assertEquals(1200,bicicleta.calcularCusto());
    }
}