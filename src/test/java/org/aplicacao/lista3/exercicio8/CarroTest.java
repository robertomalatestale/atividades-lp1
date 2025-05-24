package org.aplicacao.lista3.exercicio8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    Carro carro = new Carro("Toyota","Prius",20.000);

    @Test
    void deveCalcularCustoCorretamente(){
        assertEquals(40.000,carro.calcularCusto());
    }

}