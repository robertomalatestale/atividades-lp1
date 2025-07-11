package org.aplicacao.lista5.sistemavideolocadora;

import org.aplicacao.lista5.sistemareservahotel.Hospede;
import org.aplicacao.lista5.sistemareservahotel.QuartoTriplo;
import org.aplicacao.lista5.sistemareservahotel.Reserva;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    Cliente cliente = new Cliente("Wellington", "3495-2");

    @Test
    void deveLancarExcecaoSeNomeNaoPreenchido(){
    assertThrows(IllegalArgumentException.class, () -> cliente.setNome("   "));
    }

    @Test
    void deveInicializarListaDeEmprestimosCorretamente(){
        assertEquals(0,(cliente.getEmprestimos().size()));
    }

    @Test
    void deveAdicionarEmprestimosNaListaCorretamente(){
        EmprestimoEspecial emprestimoEspecial = new EmprestimoEspecial("Matrix",5,cliente, 8.50);
        cliente.adicionarEmprestimo(emprestimoEspecial);
        List<Emprestimo> list = new ArrayList<Emprestimo>();
        list.add(emprestimoEspecial);
        assertEquals(list,cliente.getEmprestimos());
    }

    @Test
    void deveImprimirReservasComValorDeUmHospedeCorretamente(){
        EmprestimoEspecial emprestimoEspecial = new EmprestimoEspecial("Matrix",5,cliente, 8.50);
        EmprestimoCatalogo emprestimoCatalogo = new EmprestimoCatalogo("Harry Potter",9, cliente);
        cliente.adicionarEmprestimo(emprestimoCatalogo);
        cliente.adicionarEmprestimo(emprestimoEspecial);
        assertEquals("Empréstimos do cliente: Wellington\n" +
                "Empréstimo Harry Potter: R$45.0\n" +
                "Empréstimo Matrix: R$42.5",cliente.listarEmprestimosComValores());
    }

}