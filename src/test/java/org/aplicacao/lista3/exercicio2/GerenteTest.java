package org.aplicacao.lista3.exercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {
    Gerente gerente = new Gerente(1412f,2);

    @Test
    void deveLancarExcecaoSeBonusNegativoOuZero() {
        try{
            gerente.setBonusFixo(0);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals(e.getMessage(), "Bônus deve ser positivo");
        }
    }

    @Test
    void deveCalcularSalarioCorretamente(){
        assertEquals(1414,gerente.calcularPagamento());
    }
}