package org.aplicacao.lista5.sistemareservahotel;

public class QuartoDuplo extends Quarto{

    private int numeroDeRefeicoes;

    public QuartoDuplo(int diasHospedados, int numeroDeRefeicoes) {
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
        return 80.0 * diasHospedados + 10.0 * numeroDeRefeicoes;
    }
}
