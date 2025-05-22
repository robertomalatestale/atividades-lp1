package org.aplicacao.lista3.exercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {

    ProdutoRoupa produtoRoupa = new ProdutoRoupa("Roupa",1000);

    @Test
    void deveCalcularDescontoCorretamente(){
        assertEquals(800,produtoRoupa.calcularPreco());
    }

}