package org.aplicacao.lista5.sistemaarrecadacao;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContribuinteTest {

    @Test
    void deveLancarExcecaoSeNomeNaoPreenchido(){
        Contribuinte contribuinte = new Contribuinte("Jefferson","F31SA");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> contribuinte.setNome("   "));
    }

    @Test
    void deveInicializarListaDeImoveisCorretamente(){
        Contribuinte contribuinte = new Contribuinte("Jefferson","F31SA");
        assertEquals(0,(contribuinte.getImoveis().size()));
    }

    @Test
    void deveAdicionarImoveisNaListaCorretamente(){
        Contribuinte contribuinte = new Contribuinte("Jefferson","F31SA");
        Apartamento apartamento = new Apartamento(50,3);
        contribuinte.adicionarImovel(apartamento);
        List<Imovel> list = new ArrayList<Imovel>();
        list.add(apartamento);
        assertEquals(list,contribuinte.getImoveis());
    }

    @Test
    void deveListarImoveisDoContribuinteComPreco(){
        Contribuinte contribuinte = new Contribuinte("Jefferson","F31SA");
        Apartamento apartamento = new Apartamento(50,3);
        Casa casa = new Casa(80,60);
        contribuinte.adicionarImovel(apartamento);
        contribuinte.adicionarImovel(casa);
        assertEquals("Imoveis do contribuinte Jefferson\n" +
                "Imovel 1: R$1400.0\n" +
                "Imovel 2: R$5400.0",contribuinte.listarImoveisComPrecos());
    }
}