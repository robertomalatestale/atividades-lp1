package org.aplicacao.lista3.exercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    Produto produto = new ProdutoEletronico("Celular",1000,13);

    @Test
    void deveLancarExcecaoSeNomeVazio(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> produto.setNome("  "));
    }

    @Test
    void deveLancarExcecaoSePrecoUnitarioMenorOuIgualAZero(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> produto.setPrecoUnitario(0));
    }

    @Test
    void deveLancarExcecaoSeQuantidadeEmEstoqueNegativa(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> produto.setQuantidadeEmEstoque(-1));
    }

    @Test
    void deveLancarExcecaoSeTentarTirarMaisDoEstoqueDoQueTemDisponivel(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> produto.lancaExcecaoSeQuantidadeMaiorQueEstoqueOuQuantidadeNegativaOuZero(15));
    }

    @Test
    void deveLancarSeQuantidadeRetiradaForNegativaOuZero(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> produto.lancaExcecaoSeQuantidadeMaiorQueEstoqueOuQuantidadeNegativaOuZero(0));
    }

    @Test
    void deveCalcularEstoqueCorretamenteAposRetirarProdutos(){
        produto.baixarEstoque(2);
        assertEquals(11,produto.getQuantidadeEmEstoque());
    }
}