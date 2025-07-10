package org.aplicacao.lista5.sistemacontroleacademico;

public class AlunoBolsistaIntegral extends Aluno {
    public AlunoBolsistaIntegral(String nome, String matricula, String endereco, int numeroDeParcelas, Curso curso) {
        super(nome, matricula, endereco, numeroDeParcelas, curso);
    }

    @Override
    public double getValorMensalidade() {
        return 0.0;
    }}
