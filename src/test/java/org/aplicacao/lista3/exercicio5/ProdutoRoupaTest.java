package org.aplicacao.lista3.exercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {

    ProdutoRoupa produtoRoupa = new ProdutoRoupa("Champion",10,10,10);

    @Test
    void deveLancarExcecaoSeDescontoMenorQueZero(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()-> produtoRoupa.setDesconto(-0.1));
    }

    @Test
    void deveLancarExcecaoSeDescontoMaiorQueCem(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()-> produtoRoupa.setDesconto(100.01));
    }

    @Test
    void deveCalcularPrecoCorretamente(){
        assertEquals(27,produtoRoupa.calcularPreco(3));
    }
}