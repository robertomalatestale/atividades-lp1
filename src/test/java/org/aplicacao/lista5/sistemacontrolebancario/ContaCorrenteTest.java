package org.aplicacao.lista5.sistemacontrolebancario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {

    Cliente cliente = new Cliente("Anderson","8458-6");
    ContaCorrente contaCorrente = new ContaCorrente(cliente,"93831-9");

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