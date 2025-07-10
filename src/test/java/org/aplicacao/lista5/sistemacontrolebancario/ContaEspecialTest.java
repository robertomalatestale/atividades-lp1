package org.aplicacao.lista5.sistemacontrolebancario;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaEspecialTest {

    @Test
    void deveInformarSaldoCorretamente(){
        Cliente cliente = new Cliente("Anderson","8458-6");
        ContaEspecial contaEspecial = new ContaEspecial(cliente,"3133-1");
        contaEspecial.setSaldo(30);
        assertEquals(280,contaEspecial.informarSaldoDisponivel());
    }

}