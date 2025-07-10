package org.aplicacao.lista5.sistemavideolocadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmprestimoEspecialTest {

    Cliente cliente = new Cliente("Wellington", "3495-2");
    EmprestimoEspecial emprestimoEspecial = new EmprestimoEspecial("Matrix",5,cliente, 10);

    @Test
    void deveCalcularValorCorretamente(){
        assertEquals(50.0,emprestimoEspecial.calculaValor());
    }
}