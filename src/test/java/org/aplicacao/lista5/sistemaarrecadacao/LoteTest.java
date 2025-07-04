package org.aplicacao.lista5.sistemaarrecadacao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoteTest {

    Lote lote = new Lote();

    @Test
    void deveLancarExcecaoSeDonoDoImovelForNulo(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> lote.setDono(null));
    }

    @Test
    void deveLancarExcecaoSeMetragemQuadradaNegativaOuNula(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> lote.setMetragemQuadradaTerreno(0));
    }

    @Test
    void deveCalcularValorDoLoteCorretamente(){
        lote.setMetragemQuadradaTerreno(30);
        assertEquals(900,lote.calcularValor());
    }
}