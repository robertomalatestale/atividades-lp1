package org.aplicacao.lista5.sistemacontroleacademico;

public class AlunoMensalista extends Aluno {
    protected double valorMensalidade;

    public AlunoMensalista(String nome, String matricula, String endereco, int numeroDeParcelas, double valorMensalidade) {
        super(nome, matricula, endereco, numeroDeParcelas);
        setValorMensalidade(valorMensalidade);
    }

    public double getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(double valorMensalidade) {
        if(valorMensalidade <= 0){
            throw new IllegalArgumentException("Valor da mensalidade deve ser positivo");
        }
        this.valorMensalidade = valorMensalidade;
    }
}