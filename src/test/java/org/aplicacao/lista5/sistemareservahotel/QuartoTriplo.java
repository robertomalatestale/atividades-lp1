package org.aplicacao.lista5.sistemareservahotel;

public class QuartoTriplo extends Quarto{

    private int numeroDeRefeicoes;

    public QuartoTriplo(int diasHospedados, int numeroDeRefeicoes) {
        super(diasHospedados);
        setNumeroDeRefeicoes(numeroDeRefeicoes);

    }

    public int getNumeroDeRefeicoes() {
        return numeroDeRefeicoes;
    }

    public void setNumeroDeRefeicoes(int numeroDeRefeicoes) {
        if(numeroDeRefeicoes<0){
            throw new IllegalArgumentException("Número de refeições não pode ser negativo");
        }
        this.numeroDeRefeicoes = numeroDeRefeicoes;
    }

    @Override
    public Double getValorDaReserva() {
        return 100.0 * diasHospedados + 10.0 * numeroDeRefeicoes;
    }
}
