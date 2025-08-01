package org.aplicacao.prova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest {

    @Test
    void deveLancarExcecaoSeFornecedorForNulo(){
        try{
            Produto produto = new Produto("Caneta",100,1.2,10,200);
            Compra compra = new Compra("31/07/2025",produto,null,5,32.0);
            fail();
        }catch (Exception e){
            assertEquals("Compra deve ter um fornecedor associado",e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSeQuantidadeCompradaForNegativaOuZero(){
        try{
            Produto produto = new Produto("Caneta",100,1.2,10,200);
            Fornecedor fornecedor = new Fornecedor("Lucas","111.111.111-12");
            Compra compra = new Compra("31/07/2025",produto,fornecedor,5,32.0);
            compra.comprar(produto, 0);
            fail();
        } catch (Exception e) {
            assertEquals("Quantidade comprada deve ser positiva",e.getMessage());
        }
    }

    @Test
    void deveRetornarVerdadeiroSeCompraAprovada(){
        Produto produto = new Produto("Caneta",100,1.2,10,200);
        Fornecedor fornecedor = new Fornecedor("Lucas","111.111.111-12");
        Compra compra = new Compra("31/07/2025",produto,fornecedor,5,32.0);
        assertTrue(compra.comprar(produto, 50));
    }

    @Test
    void deveRetornarFalsoSeCompraReprovada(){
        Produto produto = new Produto("Caneta",100,1.2,10,200);
        Fornecedor fornecedor = new Fornecedor("Lucas","111.111.111-12");
        Compra compra = new Compra("31/07/2025",produto,fornecedor,5,32.0);
        assertFalse(compra.comprar(produto, 101));
    }


}