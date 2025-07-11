package org.aplicacao.lista5.sistemareservahotel;

import org.aplicacao.lista5.sistemacontrolebancario.Cliente;
import org.aplicacao.lista5.sistemacontrolebancario.ContaBancaria;
import org.aplicacao.lista5.sistemacontrolebancario.ContaPoupanca;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HospedeTest {

    @Test
    void deveLancarExcecaoSeNomeNaoPreenchido(){
        Hospede hospede = new Hospede("Tassio","4743");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> hospede.setNome("   "));
    }

    @Test
    void deveInicializarListaDeReservaCorretamente(){
        Hospede hospede = new Hospede("Tassio","4743");
        assertEquals(0,(hospede.getReservas().size()));
    }

    @Test
    void deveAdicionarContasNaListaCorretamente(){
        Hospede hospede = new Hospede("Tassio","4743");
        QuartoTriplo quartoTriplo1 = new QuartoTriplo(3,5);
        Reserva reserva = new Reserva(quartoTriplo1);
        hospede.adicionarReserva(reserva);
        List<Reserva> list = new ArrayList<Reserva>();
        list.add(reserva);
        assertEquals(list,hospede.getReservas());
    }

    @Test
    void deveImprimirReservasComValorDeUmHospedeCorretamente(){
        Hospede hospede = new Hospede("Tassio","4743");
        QuartoTriplo quartoTriplo1 = new QuartoTriplo(3,5);
        Reserva reserva1 = new Reserva(quartoTriplo1);
        QuartoTriplo quartoTriplo2 = new QuartoTriplo(5,3);
        Reserva reserva2 = new Reserva(quartoTriplo2);
        hospede.adicionarReserva(reserva1);
        hospede.adicionarReserva(reserva2);
        assertEquals("Reservas de Tassio\n" +
                "Reserva 1: R$350.0\n" +
                "Reserva 2: R$530.0",hospede.mostrarValorDeTodasReservas());
    }

}