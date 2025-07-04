package org.aplicacao.lista5.sistemaarrecadacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CasaTest {

    Casa casa = new Casa(50, 30);

    @Test
    void deveLancarExcecaoSeMetragemQuadradaDoTerrenoNegativaOuNula(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> casa.setMetragemQuadradaTerreno(0));
    }

    @Test
    void deveLancarExcecaoSeMetragemQuadradaConstruidaNegativaOuNula(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> casa.setMetragemQuadradaConstrucao(0));
    }

    @Test
    void deveLancarExcecaoSeMetragemQuadradaConstruidaForMaiorQueMetragemQuadradaDeTerreno(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> casa.setMetragemQuadradaConstrucao(50.01));
    }

    @Test
    void deveCalcularValorDaCasaCorretamente(){
        assertEquals(3000,casa.calcularValor());
    }

}