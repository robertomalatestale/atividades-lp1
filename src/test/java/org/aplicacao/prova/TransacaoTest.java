package org.aplicacao.prova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransacaoTest {

    @Test
    void deveLancarExcecaoSeProdutoForNulo(){
        try{
            Transacao transacao = new Transacao("31/07/2025",5,null);
            fail();
        }catch (Exception e){
            assertEquals("Deve ter um produto associado",e.getMessage());
        }
    }

}