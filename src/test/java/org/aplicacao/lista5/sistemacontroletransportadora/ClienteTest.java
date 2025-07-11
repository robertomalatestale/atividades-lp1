package org.aplicacao.lista5.sistemacontroletransportadora;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveLancarExcecaoSeNomeNaoPreenchido(){
        Cliente cliente = new Cliente("José","1452");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> cliente.setNome("   "));
    }

    @Test
    void deveInicializarListaDeFretesCorretamente(){
        Cliente cliente = new Cliente("José","1452");
        assertEquals(0,(cliente.getFretes().size()));
    }

    @Test
    void deveAdicionarFretesNaListaCorretamente(){
        Cliente cliente = new Cliente("José","1452");
        Frete frete = new FreteNormal(21, cliente);
        cliente.adicionarFrete(frete);
        List<Frete> list = new ArrayList<>();
        list.add(frete);
        assertEquals(list,cliente.getFretes());
    }

    @Test
    void deveListarTodosFrentesComValorTotal(){
        Cliente cliente = new Cliente("José","1452");
        Frete frete1 = new FreteNormal(21, cliente);
        Frete frete2 = new FreteNormal(48, cliente);
        cliente.adicionarFrete(frete1);
        cliente.adicionarFrete(frete2);
        assertEquals("Fretes do cliente José\n" +
                "Frete 1: R$21.0\n" +
                "Frete 2: R$48.0",cliente.listarTodosFretesComValores());
    }

}