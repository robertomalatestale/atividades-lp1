package org.aplicacao.lista5.sistemacontroletransportadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteUrgenteTest {

    Cliente cliente = new Cliente("José","1452");
    FreteUrgente freteUrgente = new FreteUrgente(100, cliente, 20,3);

    @Test
    void deveLancarExcecaoSeTaxaDeEntregaNegativa(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> freteUrgente.setValor(-0.01));
    }

    @Test
    void deveLancarExcecaoSeNumeroDeItensNegativo(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> freteUrgente.setNumeroDeItens(-1));
    }

    @Test
    void deveCalcularCustoTotalCorrretamente(){
        assertEquals(150,freteUrgente.calcularValorTotalEntrega());
    }

}