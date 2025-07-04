package org.aplicacao.lista5.sistemacontrolebancario;

import org.aplicacao.lista5.sistemaarrecadacao.Apartamento;
import org.aplicacao.lista5.sistemaarrecadacao.Casa;
import org.aplicacao.lista5.sistemaarrecadacao.Contribuinte;
import org.aplicacao.lista5.sistemaarrecadacao.Imovel;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveLancarExcecaoSeNomeNaoPreenchido(){
        Cliente cliente = new Cliente("Anderson","8458-6");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> cliente.setNome("   "));
    }

    @Test
    void deveAdicionarContasNaListaCorretamente(){
        Cliente cliente = new Cliente("Anderson","8458-6");
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        cliente.adicionarConta(contaPoupanca);
        List<ContaBancaria> list = new ArrayList<ContaBancaria>();
        list.add(contaPoupanca);
        assertEquals(list,cliente.getContas());
    }

    @Test
    void deveListarContasBancariasComSaldo(){
        Cliente cliente = new Cliente("Anderson","8458-6");
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        ContaEspecial contaEspecial = new ContaEspecial();
        contaPoupanca.setSaldo(500);
        contaEspecial.setSaldo(750);
        cliente.adicionarConta(contaPoupanca);
        cliente.adicionarConta(contaEspecial);
        assertEquals("Contas bancárias de: Anderson\n" +
                "Conta 1: R$500.0\n" +
                "Conta 2: R$1000.0",cliente.listarContasComSaldos());
    }

}