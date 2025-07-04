package org.aplicacao.lista5.sistemareservahotel;

public class QuartoSingle extends Quarto{

    public QuartoSingle(int diasHospedados) {
        super(diasHospedados);
    }

    @Override
    public Double getValorDaReserva() {
        return 50.0 * diasHospedados;
    }


}
