package org.aplicacao.prova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendaTest {

    @Test
    void deveLancarExcecaoSeClienteForNulo(){
        try{
            Produto produto = new Produto("Caneta",100,1.2,10,200);
            Venda venda = new Venda("31/07/2025",null, produto, 5);
            fail();
        }catch (Exception e){
            assertEquals("Venda deve ter um cliente associado",e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSeQuantidadeVendidaForNegativaOuZero(){
        try{
            Produto produto = new Produto("Caneta",100,1.2,10,200);
            Cliente cliente = new Cliente("Lucas","111.111.111-12");
            Venda venda = new Venda("31/07/2025",cliente, produto, 5);
            venda.vender(produto,0);
            fail();
        }catch (Exception e) {
            assertEquals("Quantidade vendida deve ser positiva",e.getMessage());
        }
    }

    @Test
    void deveRetornarVerdadeiroSeVendaAprovada(){
        Produto produto = new Produto("Caneta",100,1.2,10,200);
        Cliente cliente = new Cliente("Lucas","111.111.111-12");
        Venda venda = new Venda("31/07/2025",cliente, produto, 5);
        assertTrue(venda.vender(produto, 50));
    }

    @Test
    void deveRetornarFalsoSeVendaReprovada(){
        Produto produto = new Produto("Caneta",100,1.2,10,200);
        Cliente cliente = new Cliente("Lucas","111.111.111-12");
        Venda venda = new Venda("31/07/2025",cliente, produto, 5);
        assertFalse(venda.vender(produto, 101));
    }

}