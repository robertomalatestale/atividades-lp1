package org.aplicacao.lista5.sistemareservahotel;

public abstract class Quarto{
    protected int diasHospedados;

    public Quarto(int diasHospedados) {
        setDiasHospedados(diasHospedados);
    }

    public int getDiasHospedados() {
        return diasHospedados;
    }

    public void setDiasHospedados(int diasHospedados) {
        if(diasHospedados<=0){
            throw new IllegalArgumentException("Número de dias hospedados inválido");
        }
        this.diasHospedados = diasHospedados;
    }

    public abstract Double getValorDaReserva();
}
