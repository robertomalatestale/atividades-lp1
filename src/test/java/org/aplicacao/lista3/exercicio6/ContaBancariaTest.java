package org.aplicacao.lista3.exercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    ContaBancaria contaBancaria = new ContaCorrente("38731-2",1000,"José");

    @Test
    void deveLancarExcecaoSeNumeroDaContaNaoForPreenchido(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> contaBancaria.setNumeroConta("   "));
    }

    @Test
    void deveLancarExcecaoSeClienteTiverUmSaldoMenorQue250Negativo(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> contaBancaria.setSaldo(-250.01));
    }

    @Test
    void deveLancarExcecaoSeTitularDaContaNaoForPreenchido(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> contaBancaria.setTitular("   "));
    }

    @Test
    void deveCalcularSaldoPosSaqueCorretamente(){
        contaBancaria.sacar(1250);
        assertEquals(-250,contaBancaria.getSaldo());
    }

    @Test
    void deveLancarExcecaoSeTentarSacarValorNegativoOuZero(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> contaBancaria.sacar(0));
    }

    @Test
    void deveLancarExcecaoSeTentarSacarMaisDoQueTemDisponivelNaConta(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> contaBancaria.sacar(1250.01));
    }
}