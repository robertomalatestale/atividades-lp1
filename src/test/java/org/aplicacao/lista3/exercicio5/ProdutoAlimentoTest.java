package org.aplicacao.lista3.exercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoAlimentoTest {

    ProdutoAlimento produtoAlimento = new ProdutoAlimento("Macarrão",15,15);

    @Test
    void deveCalcularPrecoCorretamente(){
        assertEquals(225,produtoAlimento.calcularPreco(15));
    }

}