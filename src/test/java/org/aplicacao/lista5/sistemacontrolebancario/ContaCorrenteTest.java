package org.aplicacao.lista5.sistemacontrolebancario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {

    ContaCorrente contaCorrente = new ContaCorrente();

    @Test
    void deveLancarExcecaoSeDonoDaContaForNulo(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, ()-> contaCorrente.setDono(null));
    }

    @Test
    void deveInformarSaldoCorretamente(){
        contaCorrente.setSaldo(30);
        assertEquals(contaCorrente.getSaldo(),contaCorrente.informarSaldoDisponivel());
    }

}