package org.aplicacao.lista2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    Carro cronos = new Carro("Fiat","Cronos",2019,30,false);

    @Test
    void deveLancarExcecaoSeVelocidadeNegativa() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> cronos.setVelocidade_atual(-2), "Esperava exceção para velocidade negativa");
    }

    @Test
    void deveCalcularVelocidadeAposAcelerar() {
        cronos.acelerar(28);
        assertEquals(58, cronos.getVelocidade_atual());
    }

    @Test
    void deveLancarExcecaoSeVelocidadeNegativaAposAcelerar() {
        QuantidadeInvalidaException exception = assertThrows(QuantidadeInvalidaException.class, () -> cronos.acelerar(-100), "Esperava exceção para velocidade negativa");
    }

    @Test
    void deveCalcularVelocidadeAposFrear() {
        cronos.frear(28);
        assertEquals(2, cronos.getVelocidade_atual());
    }

    @Test
    void deveLancarExcecaoSeVelocidadeNegativaAposFrear() {
        QuantidadeInvalidaException exception = assertThrows(QuantidadeInvalidaException.class, () -> cronos.frear(-100), "Esperava exceção para velocidade negativa");
    }

    @Test
    void deveTestarCarroLigar() {
        cronos.ligar();
        assertTrue(cronos.isEstado());
    }

    @Test
    void desligar() {
        cronos.desligar();
        assertFalse(cronos.isEstado());
    }
}