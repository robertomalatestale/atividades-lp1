package org.aplicacao.lista3.exercicio4;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class VooInternacionalTest {

    VooInternacional vooInternacional = new VooInternacional("Brasil","Estados Unidos", 5300, LocalDate.now());

    @Test
    void deveCalcularPrecoCorretamente(){
        assertEquals(13250,vooInternacional.calcularPreco());
    }

}