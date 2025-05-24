package org.aplicacao.lista3.exercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioComumTest {

    FuncionarioComum funcionarioComum = new FuncionarioComum(1412f);

    @Test
    void deveLancarExcecaoSeSalarioNegativoOuIgualA0(){
        try{
            funcionarioComum.setSalarioMensal(0);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals(e.getMessage(), "Salário deve ser positivo");
        }
    }

    @Test
    void deveCalcularSalarioCorretamente(){
        assertEquals(1412,funcionarioComum.calcularPagamento());
    }

}