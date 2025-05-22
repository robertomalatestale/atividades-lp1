package org.aplicacao.lista3.exercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoLivroTest {

    ProdutoLivro produtoLivro = new ProdutoLivro("Livro",1000);

    @Test
    void deveCalcularPrecoCorretamente() {
        assertEquals(950,produtoLivro.calcularPreco());
    }
}