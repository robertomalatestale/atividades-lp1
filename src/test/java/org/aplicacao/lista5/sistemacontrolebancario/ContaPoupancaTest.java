package org.aplicacao.lista5.sistemacontrolebancario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {

    @Test
    void deveInformarSaldoCorretamente(){
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setSaldo(30);
        assertEquals(contaPoupanca.getSaldo(),contaPoupanca.informarSaldoDisponivel());
    }

}