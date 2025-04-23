package org.aplicacao.lista1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    Funcionario joao = new Funcionario("João",1500);

    @Test
    public void deveCalcularAumento(){
        assertEquals(150,joao.calculaAumento(0.1));
    }

    @Test
    public void deveCalcularNovoSalario(){
        assertEquals(1650,joao.aumentaSalario(0.1));
    }
}

