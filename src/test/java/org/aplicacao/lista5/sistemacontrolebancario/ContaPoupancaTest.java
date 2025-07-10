package org.aplicacao.lista5.sistemacontrolebancario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {

    @Test
    void deveInformarSaldoCorretamente(){
        Cliente cliente = new Cliente("Anderson","8458-6");
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente,"31313-1");
        contaPoupanca.setSaldo(30);
        assertEquals(contaPoupanca.getSaldo(),contaPoupanca.informarSaldoDisponivel());
    }

}