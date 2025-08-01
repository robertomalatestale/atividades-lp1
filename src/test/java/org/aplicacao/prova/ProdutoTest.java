package org.aplicacao.prova;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void deveLancarExcecaoSeQuantidadeEmEstoqueForNegativo(){
        try{
            Produto produto = new Produto("Caneta",100,1.2,10,200);
            produto.setQtdeEstoque(-2);
            fail();
        }catch (Exception e){
            assertEquals("Quantidade em estoque não pode ser negativo",e.getMessage());
        }
    }

    @Test
    void deveInicializarListaHistoricoNoConstrutorCorretamente(){
        Produto produto = new Produto("Caneta",100,1.2,10,200);
        assertEquals(0,produto.getHistorico().size());
    }

    @Test
    void deveAlocarRegistroDeTransacoesNoHistoricoCorretamente(){
        Produto produto = new Produto("Caneta",100,1.2,10,200);
        produto.registrarHistorico("Compra do produto Caneta");
        assertEquals(1,produto.getHistorico().size());
    }

    @Test
    void deveImprimirTodoHistoricoDeTransacoesCorretamente(){
        Produto produto = new Produto("Caneta",100,1.2,10,200);
        Cliente cliente = new Cliente("Marco","111.111.111-12");
        produto.vender("26/07/2021", cliente, 95);
        Fornecedor fornecedor = new Fornecedor("Antonio","999.999.999-21");
        produto.comprar("26/07/2021", fornecedor, 50, 1.1);
        assertEquals("[Venda do produto Caneta, Compra do produto Caneta]", produto.exibirHistorico());
    }

    @Test
    void deveLancarExcecaoSeQuantidadeDebitadaForNegativaOuZero(){
        try{
            Produto produto = new Produto("Caneta",100,1.2,10,200);
            produto.debitarEstoque(0);
            fail();
        }catch (Exception e){
            assertEquals("Informe um valor positivo para debitar",e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoSeQuantidadeCreditadaForNegativaOuZero(){
        try{
            Produto produto = new Produto("Caneta",100,1.2,10,200);
            produto.creditarEstoque(0);
            fail();
        }catch (Exception e){
            assertEquals("Informe um valor positivo para creditar",e.getMessage());
        }
    }

    @Test
    void deveRetornarMensagemAvisandoSeEstoqueEstiverBaixo(){
        Produto produto = new Produto("Caneta",9,1.2,10,200);
        assertEquals("Estoque baixo",produto.informaSeEstoqueBaixoOuNaoPorTexto());
    }

    @Test
    void deveRetornarMensagemAvisandoSeSituacaoEstoqueEstiverNormal(){
        Produto produto = new Produto("Caneta",100,1.2,10,200);
        assertEquals("Situação de estoque normal",produto.informaSeEstoqueBaixoOuNaoPorTexto());
    }

    @Test
    void deveRetornarMensagemAvisandoSeEstoqueInsuficiente(){
        Produto produto = new Produto("Caneta",100,1.2,10,200);
        assertEquals("Estoque insuficiente",produto.informaSeEstoqueExcedenteOuInsuficientePorTexto(101));
    }

    @Test
    void deveRetornarMensagemAvisandoSeEstoqueExcedente(){
        Produto produto = new Produto("Caneta",100,1.2,10,200);
        assertEquals("Estoque excedente",produto.informaSeEstoqueExcedenteOuInsuficientePorTexto(100));
    }


    @Test
    void deveRetornarVerdadeiroCasoEstoqueEstiverAbaixoDoMinimo(){
        Produto produto = new Produto("Caneta",9,1.2,10,200);
        assertTrue(produto.verificarEstoqueBaixo());
    }

    @Test
    void deveRetornarFalsoCasoEstoqueEstiverAcimaDoMinimo(){
        Produto produto = new Produto("Caneta",11,1.2,10,200);
        assertFalse(produto.verificarEstoqueBaixo());
    }

    @Test
    void deveRetornarVerdadeiroCasoEstoqueEstiverAbaixoDeDeterminadaQuantidade(){
        Produto produto = new Produto("Caneta",100,1.2,10,200);
        assertTrue(produto.verificarEstoqueInsuficiente(101));
    }

    @Test
    void deveRetornarFalsoCasoEstoqueEstiverAcimaDeDeterminadaQuantidade(){
        Produto produto = new Produto("Caneta",102,1.2,10,200);
        assertFalse(produto.verificarEstoqueInsuficiente(101));
    }

    @Test
    void deveRetornarVerdadeiroCasoTenhaEstoqueExcedenteComBaseEmDeterminadaQuantidade(){
        Produto produto = new Produto("Caneta",100,1.2,10,200);
        assertTrue(produto.verificarEstoqueExcedente(101));
    }

    @Test
    void deveRetornarFalsoCasoNaoTenhaEstoqueExcedenteComBaseEmDeterminadaQuantidade(){
        Produto produto = new Produto("Caneta",100,1.2,10,200);
        assertFalse(produto.verificarEstoqueExcedente(100));
    }

    @Test
    void deveCalcularValorVendaCorretamente(){
        Produto produto = new Produto("Caneta",100,1.2,10,200);
        assertEquals(12,produto.calcularValorVenda(10));
    }

    @Test
    void deveVenderERegistrarProdutoCorretamente(){
        Produto produto = new Produto("Caneta",100,1.2,10,200);
        Cliente cliente = new Cliente("Lucas","111.111.111-12");
        produto.vender("31/07/2025",cliente,50);
        assertEquals("Venda do produto Caneta", produto.getHistorico().get(0));
    }

    @Test
    void deveComprarERegistrarCorretamente(){
        Produto produto = new Produto("Caneta",100,1.2,10,200);
        Fornecedor fornecedor = new Fornecedor("Lucas","111.111.111-12");
        produto.comprar("31/07/2025",fornecedor,50, 1.0);
        assertEquals("Compra do produto Caneta", produto.getHistorico().get(0));
    }
}