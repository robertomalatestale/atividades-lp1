package org.aplicacao.lista3.exercicio5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {

    ProdutoEletronico produto = new ProdutoEletronico("Celular",1000,13);

    @Test
    void deveCalcularPrecoCorretamente(){
        assertEquals(2000,produto.calcularPreco(2));
    }

}