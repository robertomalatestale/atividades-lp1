package org.aplicacao.lista2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    Produto pepsi = new Produto("Pepsi Cola","Refrigerante",5,3);

    @Test
    void deveLancarExcecaoSeQuantidadeEstoqueNegativa(){
        QuantidadeInvalidaException exception = assertThrows(QuantidadeInvalidaException.class,()->pepsi.setQuantidadeEstoque(-2),"Esperava exceção se a quantidade setada for negativa");
    }

    @Test
    void deveLancarExcecaoSePrecoNegativo(){
        QuantidadeInvalidaException exception = assertThrows(QuantidadeInvalidaException.class,()->pepsi.setPreco(-2),"Esperava exceção se o preço setado for negativo");
    }

    @Test
    void deveLancarExcecaoSeQuantidadeAdicionadaForNegativaOuZero(){
        QuantidadeInvalidaException exception = assertThrows(QuantidadeInvalidaException.class,()->pepsi.adicionarEstoque(-2),"Esperava exceção se adicionar estoque negativo ou igual a 0");
    }

    @Test
    void deveAdicionarQuantidadeAoEstoqueCorretamente(){
        pepsi.adicionarEstoque(5);
        assertEquals(10,pepsi.getQuantidadeEstoque());
    }

    @Test
    void deveLancarExcecaoSeRemoverQuantidadeMaiorQueOEstoque(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()->pepsi.removerEstoque(6),"Esperava exceção se quantidade removida for maior que o estoque");
    }

    @Test
    void deveLancarExcecaoSeQuantidadeRemovidaForNegativaOuZero(){
        QuantidadeInvalidaException exception = assertThrows(QuantidadeInvalidaException.class,()->pepsi.removerEstoque(-2),"Esperava exceção se quantidade removida for zero ou negativo");
    }

    @Test
    void deveRemoverQuantidadeDoEstoqueCorretamente(){
        pepsi.removerEstoque(5);
        assertEquals(0,pepsi.getQuantidadeEstoque());
    }

    @Test
    void deveAplicarDescontoCorretamente(){
        pepsi.aplicarDesconto(0.33);
        assertEquals(2,pepsi.getPreco(),0.01);
    }

}