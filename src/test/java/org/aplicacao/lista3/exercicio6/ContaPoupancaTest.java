package org.aplicacao.lista3.exercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {

    ContaPoupanca contaPoupanca= new ContaPoupanca("38731-2",1000,"José");

    @Test
    void deveLancarExcecaoSeValorDepositadoForNegativo(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> contaPoupanca.depositar(-0.1));
    }

    @Test
    void deveCalcularSaldoCorretamenteAposDeposito(){
        contaPoupanca.depositar(10);
        assertEquals(1010,contaPoupanca.getSaldo());
    }

    @Test
    void deveCalcularSaldoCorretamenteAposReceberJurosMensais(){
        contaPoupanca.recebeJurosMensaisNaConta();
        assertEquals(1100,contaPoupanca.getSaldo());
    }

}