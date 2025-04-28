package org.aplicacao.lista2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    Funcionario raul = new Funcionario("Raul Soares","Analista de Sistemas",1800,"TI");

    @Test
    void deveLancarExcecaoSeSalarioNegativo(){
        QuantidadeInvalidaException exception = assertThrows(QuantidadeInvalidaException.class,()->raul.setSalario(-200),"Esperava exceção se salário for setado negativo");
    }

    @Test
    void deveCalcularSalarioCorretamenteAposAumento(){
        raul.receberAumento(0.1);
        assertEquals(1980,raul.getSalario());
    }

    @Test
    void deveMudarDeDepartamentoCorretamente(){
        raul.setDepartamento("Financeiro");
        assertEquals("Financeiro",raul.getDepartamento());
    }

    @Test
    void deveImprimirAsInformaçõesDoFuncionárioCorretamente(){
        assertEquals("Funcionario Raul Soares que trabalha no cargo de Analista de Sistemas recebendo o salário de 1800.0 reais no departamento de TI",raul.exibirDados());
    }



}