package org.aplicacao.lista5.sistemacontroletransportadora;

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
        org.aplicacao.lista5.sistemacontroletransportadora.Cliente cliente = new org.aplicacao.lista5.sistemacontroletransportadora.Cliente("José","1452");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> cliente.setNome("   "));
    }

    @Test
    void deveAdicionarFretesNaListaCorretamente(){
        org.aplicacao.lista5.sistemacontroletransportadora.Cliente cliente = new org.aplicacao.lista5.sistemacontroletransportadora.Cliente("José","1452");
        Frete frete = new FreteNormal(21);
        cliente.adicionarFrete(frete);
        List<Frete> list = new ArrayList<>();
        list.add(frete);
        assertEquals(list,cliente.getFretes());
    }

    @Test
    void deveListarTodosFrentesComValorTotal(){
        org.aplicacao.lista5.sistemacontroletransportadora.Cliente cliente = new org.aplicacao.lista5.sistemacontroletransportadora.Cliente("José","1452");
        Frete frete1 = new FreteNormal(21);
        Frete frete2 = new FreteNormal(48);
        cliente.adicionarFrete(frete1);
        cliente.adicionarFrete(frete2);
        assertEquals("Fretes do cliente José\n" +
                "Frete 1: R$21.0\n" +
                "Frete 2: R$48.0",cliente.listarTodosFretesComValores());
    }

}