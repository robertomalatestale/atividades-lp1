package org.aplicacao.lista5.sistemacontrolebancario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaEspecialTest {

    @Test
    void deveInformarSaldoCorretamente(){
        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setSaldo(30);
        assertEquals(280,contaEspecial.informarSaldoDisponivel());
    }

}