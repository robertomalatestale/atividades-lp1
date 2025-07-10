package org.aplicacao.lista5.sistemareservahotel;

public class Reserva {
    private Quarto quarto;
    private Hospede donoReserva;

    public Reserva(Quarto quarto) {
        setQuarto(quarto);
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        if(quarto == null){
            throw new IllegalArgumentException("Reserva deve ter um quarto associado");
        }
        this.quarto = quarto;
    }

    public Hospede getDonoReserva() {
        return donoReserva;
    }

    public void setDonoReserva(Hospede donoReserva) {
        this.donoReserva = donoReserva;
    }
}
