package org.aplicacao.lista3.exercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {

    ContaCorrente contaCorrente = new ContaCorrente("38731-2",1000,"José");

    @Test
    void deveLancarExcecaoSeValorDepositadoForNegativo(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> contaCorrente.depositar(-0.1));
    }

    @Test
    void deveCalcularSaldoCorretamenteAposDeposito(){
        contaCorrente.depositar(10);
        assertEquals(1004,contaCorrente.getSaldo());
    }
}