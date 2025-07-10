package org.aplicacao.lista5.sistemacontroleacademico;

public class AlunoBolsistaParcial extends AlunoMensalista {
    private double percentualDesconto;

    public AlunoBolsistaParcial(String nome, String matricula, String endereco, int numeroDeParcelas, double valorMensalidade, Curso curso, double percentualDesconto) {
        super(nome, matricula, endereco, numeroDeParcelas, valorMensalidade, curso);
        setPercentualDesconto(percentualDesconto);
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        if(percentualDesconto <= 0 || percentualDesconto > 50){
            throw new IllegalArgumentException("Desconto deve estar entre 0% e 50%");
        }
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public double getValorMensalidade() {
        return valorMensalidade * (1 - percentualDesconto / 100);
    }
}
