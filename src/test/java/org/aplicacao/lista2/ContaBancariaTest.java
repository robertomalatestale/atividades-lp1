package org.aplicacao.lista2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    ContaBancaria jose = new ContaBancaria("José","98762-3",900);

    @Test
    void deveLançarExcecaoSeSaldoNegativo() {
        QuantidadeInvalidaException exception = assertThrows(QuantidadeInvalidaException.class, () -> jose.setSaldo(-300),"Esperava exceção para saldo negativo");
    }

    @Test
    void deveCalcularCorretamenteSaldoComValorDepositado() {
        jose.depositar(200);
        assertEquals(1100, jose.getSaldo());
    }

    @Test
    void deveLançarExcecaoSeDepositoNegativo() {
        QuantidadeInvalidaException exception = assertThrows(QuantidadeInvalidaException.class, () -> jose.depositar(-300),"Esperava exceção para deposito negativo");
    }

    @Test
    void deveCalcularCorretamenteSaldoComValorSacado() {
        jose.sacar(200);
        assertEquals(700, jose.getSaldo());
    }

    @Test
    void deveLançarExcecaoSeSaqueNegativo() {
        QuantidadeInvalidaException exception = assertThrows(QuantidadeInvalidaException.class, () -> jose.sacar(-1000),"Esperava exceção para saque negativo");
    }

    @Test
    void deveLançarExcecaoSeSaldoNegativoAoSacar() {
        QuantidadeInvalidaException exception = assertThrows(QuantidadeInvalidaException.class, () -> jose.sacar(1000),"Esperava exceção para saldo negativo apos sacar");
    }
}