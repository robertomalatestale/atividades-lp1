package org.aplicacao.lista5.sistemavideolocadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmprestimoEspecialTest {

    EmprestimoEspecial emprestimoEspecial = new EmprestimoEspecial("Matrix",5,10);

    @Test
    void deveCalcularValorCorretamente(){
        assertEquals(50.0,emprestimoEspecial.calculaValor());
    }
}