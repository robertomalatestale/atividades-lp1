package org.aplicacao.lista5.sistemacontroletransportadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreteEspecialTest {

    FreteEspecial freteEspecial = new FreteEspecial(100,20);

    @Test
    void deveLancarExcecaoSeTaxaDeEntregaNegativa(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> freteEspecial.setValor(-0.01));
    }

    @Test
    void deveCalcularCustoTotalCorrretamente(){
        assertEquals(120,freteEspecial.calcularValorTotalEntrega());
    }

}