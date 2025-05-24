package org.aplicacao.lista3.exercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiretorTest {

    Diretor diretor = new Diretor(1412f, 50);

    @Test
    void deveLancarExcecaoSeParticipacaoNegativaOuZero() {
        try{
            diretor.setParticipacaoLucros(0);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals(e.getMessage(), "Participação nos lucros deve ser positiva");
        }
    }

    @Test
    void deveCalcularSalarioCorretamente(){
        assertEquals(51412,diretor.calcularPagamento());
    }
}