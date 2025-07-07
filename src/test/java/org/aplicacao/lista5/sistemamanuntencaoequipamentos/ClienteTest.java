package org.aplicacao.lista5.sistemamanuntencaoequipamentos;

import org.aplicacao.lista5.sistemacontrolebancario.Cliente;
import org.aplicacao.lista5.sistemacontrolebancario.ContaBancaria;
import org.aplicacao.lista5.sistemacontrolebancario.ContaPoupanca;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveLancarExcecaoSeNomeNaoPreenchido(){
        org.aplicacao.lista5.sistemamanuntencaoequipamentos.Cliente cliente = new org.aplicacao.lista5.sistemamanuntencaoequipamentos.Cliente("Rodrigo","9DN8K");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> cliente.setNome("   "));
    }

    @Test
    void deveAdicionarContasNaListaCorretamente(){
        org.aplicacao.lista5.sistemamanuntencaoequipamentos.Cliente cliente = new org.aplicacao.lista5.sistemamanuntencaoequipamentos.Cliente("Rodrigo","9DN8K");
        Manuntencao manuntencao = new Manuntencao();
        cliente.adicionarEquipamentoEmManuntencao(manuntencao);
        List<Manuntencao> list = new ArrayList<Manuntencao>();
        list.add(manuntencao);
        assertEquals(list,cliente.getEquipamentosEmManuntecao());
    }

    @Test
    void deveListarManuntencoesComValorTotal(){
        org.aplicacao.lista5.sistemamanuntencaoequipamentos.Cliente cliente = new org.aplicacao.lista5.sistemamanuntencaoequipamentos.Cliente("Rodrigo","9DN8K");
        Manuntencao manuntencao1 = new Manuntencao();
        Manuntencao manuntencao2 = new Manuntencao();
        Monitor monitor = new Monitor(500);
        Impressora impressora = new Impressora(300,120);
        manuntencao1.setEquipamentoEmManuntencao(monitor);
        manuntencao2.setEquipamentoEmManuntencao(impressora);
        cliente.adicionarEquipamentoEmManuntencao(manuntencao1);
        cliente.adicionarEquipamentoEmManuntencao(manuntencao2);
        assertEquals("Manuntencoes registradas do cliente Rodrigo\n" +
                "Imovel 1: R$500.0\n" +
                "Imovel 2: R$420.0",cliente.consultarManuntencoesComValores());
    }

}