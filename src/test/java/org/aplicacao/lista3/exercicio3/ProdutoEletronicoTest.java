package org.aplicacao.lista3.exercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {

    ProdutoEletronico produtoEletronico = new ProdutoEletronico("  Celular    ",1000);

    @Test
    void deveLancarExcecaoSeNomeForVazioNoConstrutor(){
        try{
            ProdutoEletronico produtoEletronico1 = new ProdutoEletronico("    ",1000);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("Nome não deve ser vazio", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSePrecoNegativoOuZeroNoConstrutor(){
        try{
            ProdutoEletronico produtoEletronico1 = new ProdutoEletronico("Smartphone",0);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("Preço deve ser positivo", e.getMessage());
        }
    }

    @Test
    void deveFormatarNomeCorretamente(){
        assertEquals("Celular",produtoEletronico.getNome());
    }

    @Test
    void deveLancarExcecaoSeNomeForVazio(){
        try{
            produtoEletronico.setNome("      ");
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("Nome não deve ser vazio", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSePrecoNegativoOuZero(){
        try{
            produtoEletronico.setPrecoBase(0);
            fail();
        }catch(IllegalArgumentException e){
            assertEquals("Preço deve ser positivo", e.getMessage());
        }
    }

    @Test
    void deveCalcularDescontoCorretamente(){
        assertEquals(900,produtoEletronico.calcularPreco());
    }
}