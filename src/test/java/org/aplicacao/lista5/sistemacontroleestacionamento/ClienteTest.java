package org.aplicacao.lista5.sistemacontroleestacionamento;

import org.aplicacao.lista5.sistemamanuntencaoequipamentos.Impressora;
import org.aplicacao.lista5.sistemamanuntencaoequipamentos.Manuntencao;
import org.aplicacao.lista5.sistemamanuntencaoequipamentos.Monitor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    Cliente cliente = new Cliente("Robson","9423-5");

    @Test
    void deveLancarExcecaoSeNomeNaoPreenchido(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> cliente.setNome("   "));
    }

    @Test
    void deveInicializarListaDeVagasAlugadasCorretamente(){
        assertEquals(0,(cliente.getVagasAlugadas().size()));
    }

    @Test
    void deveAdicionarContasNaListaCorretamente(){
        VagaMensal vagaMensal = new VagaMensal(10,"BRA2E19",3);
        cliente.adicionarVaga(vagaMensal);
        List<Vaga> list = new ArrayList<Vaga>();
        list.add(vagaMensal);
        assertEquals(list,cliente.getVagasAlugadas());
    }

    @Test
    void deveListarManuntencoesComValorTotal(){
        VagaMensal vagaMensal = new VagaMensal(10,"BRA2E19",3);
        VagaSemanal vagaSemanal = new VagaSemanal(9,"BRA2E19",2);
        cliente.adicionarVaga(vagaMensal);
        cliente.adicionarVaga(vagaSemanal);
        assertEquals("Vagas alugadas do cliente Robson\n" +
                "Conta 1: R$450.0\n" +
                "Conta 2: R$80.0",cliente.listarVagasAlugadas());
    }
}